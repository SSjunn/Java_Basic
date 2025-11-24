package test.codingTest;

import java.util.Scanner;

public class Baekjoon2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트 케이스 개수 입력

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();  // 각 문자를 반복할 횟수
            String S = sc.next();  // 문자열 입력

            String result = "";

            for (int j = 0; j < S.length(); j++) {
                char ch = S.charAt(j);  // 문자열의 각 문자
                for (int k = 0; k < R; k++) {
                    result += ch;       // 문자를 R번 반복
                }
            }
            System.out.println(result);
        }

        sc.close();
    }
}
