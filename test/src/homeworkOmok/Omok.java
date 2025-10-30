package homeworkOmok;

import java.util.Scanner;

/*
 * while(true)
 *  사용자 컴퓨터 1번 씩 반복
 *  User(사용자) 행 열 입력 => Board 체크 o
 *	computer(컴퓨터) 행 열 => Board 체크 x
 *	행과 열은 
 */

public class Omok {
    public static void main(String[] args) {
        Player user = new Player("사용자", "O");
        Player computer = new Player("컴퓨터", "X");
        Board board = new Board(20);
        play(board, user, computer);
        
    }
    private static void play(Board board, Player user, Player computer) {
    	Scanner scanner = new Scanner(System.in);
    	Player  player = user;
    	
    	while(true) {
    		board.print();
    		String input = scanner.nextLine();
    		
    	}
        
    }
    
    
}
