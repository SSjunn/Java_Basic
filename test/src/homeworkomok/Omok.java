package homeworkomok;

import java.util.Scanner;

public class Omok {
	public static void main(String[] args) {
		Player user = new Player("사용자", "O");
		Player computer = new Player("컴퓨터", "X");
		Board board = new Board(19);
		play(board, user, computer);
	}

	private static void play(Board board, Player user, Player computer) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			board.print();

			// 사용자 차례
			System.out.print("\n" + user.name + "(예: J 9) ➜ ");
			String userCol = sc.next().toUpperCase();
			int userRow = sc.nextInt();

			// 사용자가 돌을 잘못 두면 다시 입력받기
			if (!board.userStone(userCol, userRow, user.stone)) {
				continue; // 다시 사용자 턴
			}

			// 사용자 돌 놓은 후 승리 체크
			if (board.check(user.stone, user.name)) {
				board.print();
				System.out.println(user.name + " 승리!");
				break;
			}

			board.print();

			// 컴퓨터 차례
			System.out.print("\n" + computer.name + "(예: J 9) ➜ ");
			String comCol = sc.next().toUpperCase();
			int comRow = sc.nextInt();

			// 컴퓨터가 잘못 두면 다시 입력받기
			if (!board.computerStone(comCol, comRow, computer.stone)) {
				continue; // 다시 컴퓨터 턴
			}

			// 컴퓨터 돌 놓은 후 승리 체크
			if (board.check(computer.stone, computer.name)) { 
				board.print();
				System.out.println(computer.name + " 승리!");
				break;
			}
		}

		sc.close();
	}
}
