package ch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class NaverAPI {
    public static void main(String[] args) {
        String clientId = "5HgXKW1ANsFOfULxyP6m"; //애플리케이션 클라이언트 아이디
        String clientSecret = "O8_XF_ZETa"; //애플리케이션 클라이언트 시크릿


        String text = null;
        try {
            text = URLEncoder.encode("프랑켄슈타인", "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("검색어 인코딩 실패",e);
        }


        String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text;    // JSON 결과
        //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // XML 결과


        Map<String, String> requestHeaders = new HashMap<>();
        requestHeaders.put("X-Naver-Client-Id", clientId);
        requestHeaders.put("X-Naver-Client-Secret", clientSecret);
        String responseBody = get(apiURL,requestHeaders);

        //responseBody => 네이버 API로 받은 JSON 문자열
        System.out.println(responseBody);
        
        // 응답결과를 파싱해서 블로그 제목, 링크 출력
        // JSON 텍스트를 자바 객체로 변환
        JSONObject root = new JSONObject(responseBody);
        // System.outprintln(root.getInt("total"));
        JSONArray items = root.getJSONArray("items");
        // System.outprintln(items.length());
        for (Object item : items) {
        	JSONObject i = (JSONObject)item;
        	System.out.println(i.getString("title") + " " + i.getString("link"));
        }
		/*
		 * JSONObject jsonObject = new JSONObject(responseBody); JSONArray items =
		 * jsonObject.getJSONArray("items"); // 결과 리스트 가져오기
		 * 
		 * for (int i = 0; i < items.length(); i++) { JSONObject item =
		 * items.getJSONObject(i); String title =
		 * item.getString("title").replaceAll("<[^>]*>", ""); // html 테그 제거 String link
		 * = item.getString("link"); // 각각의 블로그 제목과 링크 추출
		 * 
		 * System.out.println("[" + (i + 1) + "] " + title);
		 * System.out.println("   URL :  " + link); }
		 */
    }


    private static String get(String apiUrl, Map<String, String> requestHeaders){
        HttpURLConnection con = connect(apiUrl);
        try {
            con.setRequestMethod("GET");
            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
                con.setRequestProperty(header.getKey(), header.getValue());
            }


            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
                return readBody(con.getInputStream());
            } else { // 오류 발생
                return readBody(con.getErrorStream());
            }
        } catch (IOException e) {
            throw new RuntimeException("API 요청과 응답 실패", e);
        } finally {
            con.disconnect();
        }
    }


    private static HttpURLConnection connect(String apiUrl){
        try {
            URL url = new URL(apiUrl);
            return (HttpURLConnection)url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
        } catch (IOException e) {
            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
        }
    }


    private static String readBody(InputStream body){
        InputStreamReader streamReader = new InputStreamReader(body);


        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
            StringBuilder responseBody = new StringBuilder();


            String line;
            while ((line = lineReader.readLine()) != null) {
                responseBody.append(line);
            }


            return responseBody.toString();
        } catch (IOException e) {
            throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
        }
    }
}
