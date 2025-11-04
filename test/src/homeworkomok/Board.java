package homeworkomok;

import java.util.Scanner;

/*
 * 
 */

// 오목판
public class Board {
	static Scanner sc = new Scanner(System.in);
	int size;
	String[][] map;
	
	/*방향 벡터 정의*/
	/*가로, 세로, 오른쪽 아래 대각선, 왼쪽 아래 대각선*/
	int []dx = {1,0,1,-1};
	int []dy = {0,1,1,1};
	

	Board(int size) {
		this.size = size;
		map = new String[size + 1][size + 1]; // 20 x 20

		// 보드판
		for (int row = 0; row < size + 1; row++) {
			for (int col = 0; col < size + 1; col++) {

				// 왼쪽 모서리 아래 공백
				if (row == size && col == 0) {
					map[row][col] = " ";
				}
				// 영어 출력
				else if (row == size) {
					map[row][col] = String.valueOf((char) ('A' + col - 1));
				}
				// 숫자 출력
				else if (col == 0) {
					map[row][col] = String.valueOf(row);
				}
				// 점
				else {
					map[row][col] = ".";
				}
			}
		}
	}

	// 출력물
	public void print() {
		for (int row = 0; row < size + 1; row++) {
			for (int col = 0; col < size + 1; col++) {
				if (col == 0) {
					// 세로 좌표는 2칸 폭으로 출력/ 2자리 숫자 때문에
					// System.out.printf(); 형식 지정자
					// "%2" 2칸 의미
					System.out.printf("%2s", map[row][col]);
				} else {
					// 일반 칸은 3칸 폭으로 출력
					System.out.printf("%3s", map[row][col]);
				}
			}
			System.out.println();
		}
	}
	
	
	/*
	 * 소 대문자 대문자 범위 나가면 안돼 중복 하면 안돼
	 * 
	 */
	
	
	// 오류를 잡으려면 boolean을 사용해야 함
	public boolean userStone(String colInput, int row, String stone) {
		
		String line = sc.nextLine().trim();

		// toUpperCase() 모든 문자 대문자
		colInput = colInput.toUpperCase();
		
		// 문자 -> 숫자 A = 1
		int col = colInput.charAt(0) -'A'+1;
		
		// 범위
		if(col < 1 || col >size || row < 0 || row >= size) {
			System.out.println("보드 범위 벗어남. 다시 입력");
			return false;
		}
		// . 있는지 없는지 체크
		if(!map[row][col].equals(".")) {
			System.out.println("돌이 있음. 다시 입력");
			return false;
		}
		
		map[row][col] = stone;
		return true;
	}
	
	public boolean computerStone(String colInput, int row, String stone) {
		// toUpperCase() 모든 문자 대문자
		colInput = colInput.toUpperCase();
		
		// 문자 -> 숫자 A = 1
		int col = colInput.charAt(0) -'A'+1;
		
		// 범위
		if(col < 1 || col >size || row < 0 || row >= size) {
			System.out.println("보드 범위 벗어남. 다시 입력");
			return false;
		}
		// . 있는지 없는지 체크
		if(!map[row][col].equals(".")) {
			System.out.println("돌이 있음. 다시 입력");
			return false;
		}
		
		map[row][col] = stone;
		return true;
	}
	
	/*좌민석 승리 코드*/
	public boolean check(String stone, String name) {
	    for (int row = 0; row < size; row++) {
	        for (int col = 0; col < size; col++) {
	            if (map[row][col].equals(stone)) {
	                for (int i = 0; i < 4; i++) {
	                    int cnt = 1;
	                    int nx = row + dx[i];
	                    int ny = col + dy[i];
	                    
	                    
	                    //범위 안에 있고 찾는 동인 경우만 반복
	                    while (nx >= 0 && nx < size && ny >= 0 && ny < size && map[nx][ny].equals(stone)) {
	                        cnt++;
	                        if (cnt == 5) {
	                            // 양쪽 끝 검사 (6목 방지)
	                            if ((row - dx[i] >= 0) && (row - dx[i] < size)
	                                    && (col - dy[i] >= 0) && (col - dy[i] < size)
	                                    && map[row - dx[i]][col - dy[i]].equals(stone))
	                                break;
	                            if ((nx + dx[i] >= 0) && (nx + dx[i] < size)
	                                    && (ny + dy[i] >= 0) && (ny + dy[i] < size)
	                                    && map[nx + dx[i]][ny + dy[i]].equals(stone))
	                                break;

	                            return true; // 승리 조건 만족
	                        }
	                        nx += dx[i];
	                        ny += dy[i];
	                    }
	                }
	            }
	        }
	    }

	    // 승리 못했을 경우 false 반환
	    return false;
	}
}
