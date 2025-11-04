package Quiz;

import java.util.Scanner;

public class Omok {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Player user = new Player("사용자", "O");
		Player computer = new Player("컴퓨터", "X");
		Board board = new Board(19); // Board생성자 호출
		play(board, user, computer);
	}

	private static void play(Board board, Player user, Player computer) {

		while (true) {

			board.print(); // 출력

			// 사용자 턴 잘놓아졌을때만 나갈 수 있다
			while (true) {
				System.out.println("사용자>");
				String[] answer = checkInput(); // 입력체크받음
				if (!board.put(user, answer[0], Integer.parseInt(answer[1]))) {
					// 배치 실패(중복 등)하면 다시 입력
					continue;
				}

				break;
			}

			boolean check = board.check(user);
			board.print();
			if (check)
				return;

			// 컴퓨터) 턴 잘 놓아졌을떼만 나갈 수 있다.
			while (true) {
				System.out.println("컴퓨터>");
				String[] answer = checkInput();
				if (!board.put(computer, answer[0], Integer.parseInt(answer[1]))) {
					continue;
				}
				break;
			}

			check = board.check(computer); // 중복확인
			board.print();
			if (check)
				return;

		}

		// 필요하면 여기에 게임 루프(반복) 추가
		// 현재 코드는 한 번의 사용자-컴퓨터 턴 후 종료 구조임
	}

	private static String[] checkInput() { // 입력 예외처리 함수
		while (true) {
			String line = sc.nextLine().trim(); // 앞뒤의 공백만 잘라줌

			// 1. 길이는 무조건 3이상 4 이하여야함
			if (line.length() < 3 || line.length() > 4) {
				System.out.println("입력형식에 맞춰주세요 ! ex:E(A~S사이 대문자) 10(0~18사이 숫자)");
				continue;
			}

			// 2. 첫 글자(알파벳) 검사
			char alpha = line.charAt(0);
			if (alpha < 'A' || alpha > 'S') {
				System.out.println("입력형식에 맞춰주세요! 첫 글자는 알파벳 대문자여야 합니다.(A~S)");
				continue;
			}

			// 3. 두 번째 글자(띄어쓰기) 검사
			if (line.charAt(1) != ' ') {
				System.out.println("입력형식에 맞춰주세요! 문자와 숫자사이 공백이 필요합니다.");
				continue;
			}

			// 4. 나머지 부분(숫자 문자열) 추출
			String numPart = line.substring(2); // 여기서 공백 뒷부분이 숫자형태로 들어았는지
			boolean isDigitOnly = true;
			for (int i = 0; i < numPart.length(); i++) {
				if (!Character.isDigit(numPart.charAt(i))) { // 문자하나가 숫자(0~9)인지 확인
					isDigitOnly = false;
					break;
				}
			}
			if (!isDigitOnly) {
				System.out.println("입력형식에 맞춰주세요! 숫자 부분에는 숫자만 입력해주세요! ex:E 10");
				continue;
			}

			// 5. 숫자 범위 확인
			int num = Integer.parseInt(numPart);
			if (num < 0 || num > 18) {
				System.out.println("행은 0~18 사이의 숫자여야 합니다! ex:E 10");
				continue;
			}

			// 정상 입력일 경우 반환
			return line.split(" ");
		}
	}
}
