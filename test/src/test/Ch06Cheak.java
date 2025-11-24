package test;

import java.util.Scanner;

import javax.security.auth.login.AccountException;

/*
 	Scanner
 	배열[100]
 	while
 		출력
 		숫자 입력
 		1이면
 			계좌번호, 계좌주, 초기입금액 입력
 			Ch06Account 객체 생성
 			배열에 저장
 		2이면
 			배열의 전체 계좌 출력
 		3이면
 			계좌번호 입력, 예금액 입력
 			해당계좌번호의 잔액 +
 		4이면
 			계좌번호 입력, 출금액 입력
 			해당계좌번호의 잔액 -
 		5이면
 			종료
 */
public class Ch06Cheak {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ch06Account[] accounts = new Ch06Account[100];
		int index = 0; // 길이(실제 객체가 들어간 길이) / 다음 저장할 인덱스

		while (true) {
			System.out.println("[계좌생성 실행 결과]");
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			String num = scan.nextLine(); // 숫자 입력 받기

			if ("1".equals(num)) {
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");
				System.out.print("계좌번호: ");
				String number = scan.nextLine();

				System.out.print("계좌주: ");
				String owner = scan.nextLine();

				System.out.print("초기입금액: ");
				int money = Integer.parseInt(scan.nextLine());
				Ch06Account account = new Ch06Account(number, owner, money); // 객체생성(초기화)
//				System.out.println(account.getNumber());
//				System.out.println(account.getOwner());
//				System.out.println(account.getBalance());

				// 배열에 저장
				accounts[index++] = account;
				System.out.println("결과: 계좌가 생성되었습니다. ");
			} else if ("2".equals(num)) {
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				for (int i = 0; i < index; i++) {
					System.out.println(
							accounts[i].getNumber() + "\t" + accounts[i].getOwner() + "\t" + accounts[i].getBalance());
				}

			} else if ("3".equals(num)) {
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				System.out.print("계좌번호: ");
				String number = scan.nextLine();

				System.out.print("예금액: ");
				int money = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < index; i++) { // 전체 계좌를 뒤지기
					if (accounts[i].getNumber().equals(number)) { // 입력한 계좌번호 배열의 i번째의 계좌번호랑 같은지
						// 예금 +
						accounts[i].setBalance(accounts[i].getBalance() + money);
					}
				}

			} else if ("4".equals(num)) {
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				System.out.print("계좌번호: ");
				String number = scan.nextLine();

				System.out.print("출금액: ");
				int money = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < index; i++) { // 전체 계좌를 뒤지기
					if (accounts[i].getNumber().equals(number)) { // 입력한 계좌번호 배열의 i번째의 계좌번호랑 같은지
						// 출금 -
						accounts[i].setBalance(accounts[i].getBalance() - money);
					}
				}
			} else if ("5".equals(num)) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
