package ch05;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		// String(문자열)은 immutable(변할 수 없는)
		String msg = "안녕하세요";
		char a = msg.charAt(0);
		System.out.println(a);
		// msg[0] => 이건 Python 에서 하는건데 이거 안돼
		// msg.charAt(0) ='언; 이거 안돼

		// 대체, 치환, 교체
		String msg2 = msg.replace("안", "언"); // 바뀌는게 아니라 새로운 객체를 생성해 내는거다.
		System.out.println(msg2);
		System.out.println(msg); // 실제로 바꾼게 아니라 새로 만든거야.

		msg = msg.replace("안", "언"); // 실제로 바뀌는게 아니라 덮어씌어지는거다.

		// 길이
		System.out.println(msg.length()); // msg(객체).length()(메소드) 메소드 앞에는 객체가 있야해.

		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i)); // charAt() 이건 codingTest 볼때 사용
		}

		// substring (부분집합, 잘라내기)
		System.out.println(msg.substring(0, 2)); // 0, 1 까지 나와 2는 포함이 안돼
		System.out.println(msg.substring(2));

		// indexOf (위치찾기, 특정단어 포함 여부)
		System.out.println(msg.indexOf("하"));

		// 특정 단어 포함되어 있는지 여부 (미포함시-1)
		if (msg.indexOf("욕") > -1) {
			// 포함
		}
		// 특정 단어로 시작하는지 여부
		if (msg.startsWith("안녕")) { // msg.indexOf("안녕") == 0
			System.out.println("맞네?");
		}

		// split 특정문자로 쪼개기
		// 예) CSV : comma Seperate Value
		String csv = "홍길동,이순신,강감찬,유관순";

		// , 로 구분해서 쪼개(분리)
		String[] arr = csv.split(",");
		System.out.println(Arrays.toString(arr)); // *암기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		String address = "   서울시   마포구   서교동  1234     "; // 근데 여기서 tab 키 라면 System.out.println(address.replace("\t",
															// "")); 라고 작성을 해줘야해.
		// 공백 제거
		System.out.println(address.strip()); // 좌우공백 제거
		// 모든공백제거
		System.out.println(address.replace(" ", ""));
		System.out.println(address.replace(" ", "").replace("\t", "")); // 이런 식으로 점점 증가 가능해

		// 퀴즈
		// 파일업로드
		// 1. 파일명 중복
		// 2. 한글파일명
		// -> 파일명을 임의의 값으로 변경 (내사진.jpg -> 123.jpg)
		// .jpg 확장자는 가져와야해
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		String fileName = "내사진.jpg";
//		String ext = fileName.substring(fileName.indexOf("."));
		String ext = fileName.substring(fileName.lastIndexOf(".")); // 마지막에 있는 index를 가지고 와!! 이런 식으로 해결 방법이라는게 존재한다는 것을
																	// 알아야한다.
		System.out.println(ext);
		String fileName2 = System.nanoTime() + ext;
		System.out.println(fileName2);
		// 발생하는 문제 -> 다른 이름에서 2025.10.27 이런식으로 파일명을 만드는 경우도 있어.

		// 배열(Array)
		int[] arr2 = { 1, 2, 3, 4, 5 }; // 타입[] 변수; 이게 기본적인 방법이다.
		arr2[0] = 6;
		System.out.println(Arrays.toString(arr2));
		// arr2[0] ="안녕"; 이거 못넣는다. java는 한 번 딱 선언을 하게 되면 추가하거나 빼는게 불가능 하다. 길이가 볗나지 않는다.

		int[] arr3 = { 1, 2, 3, 4, 5 };
		int[] arr4 = { 1, 2, 3, 4, 5 };
		System.out.println(arr3 == arr4);
		int[] arr5 = arr3;
		System.out.println(arr5 == arr3); // 이건 같은 주소값을 가지고 있다.
		arr5[0] = 6;
		System.out.println(Arrays.toString(arr3)); // 변경은 가능하다.
		
		
		int x = 10;
		int y = x;
		y = 20;
		System.out.print(x+"\t");
		System.out.println(y);

		String[] a2;
		StringEx[] a3;
		boolean[] a4;

	}

}