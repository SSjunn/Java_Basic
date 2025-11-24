package test.codingTest;

import java.util.Scanner;

/*
 * 1 => 2초 시작 
 * 2 => 3초 ....
 * ABC =>2 라고 정의 그럼 int count = 2;
 * if(count == 'A' || count == 'B' || count == 'C')
 */

public class BaekJoon5622 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int totalTime = 0;
		String GNumber = sc.nextLine();
		String[] str = GNumber.split("");
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("A") || str[i].equals("B") || str[i].equals("C")) {
				totalTime += 3;
			} else if (str[i].equals("D") || str[i].equals("E") || str[i].equals("F")) {
				totalTime += 4;

			} else if (str[i].equals("G") || str[i].equals("H") || str[i].equals("I")) {
				totalTime += 5;

			} else if (str[i].equals("J") || str[i].equals("K") || str[i].equals("L")) {
				totalTime += 6;

			} else if (str[i].equals("M") || str[i].equals("N") || str[i].equals("O")) {
				totalTime += 7;
			} else if (str[i].equals("P") || str[i].equals("Q") || str[i].equals("R") || str[i].equals("S")) {
				totalTime += 8;
			} else if (str[i].equals("T") || str[i].equals("U") || str[i].equals("V")) {
				totalTime += 9;
			} else {
				totalTime += 10;
			}
		}

		System.out.println(totalTime);

	}

}
