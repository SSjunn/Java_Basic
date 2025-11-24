package Quiz;

//이걸 맞추려면 ? 1의 자리는 좁고 10의자리는 두자리 1의 자리는 두자리
public class Board {
	int size;
	String[][] map;
	int[] dx = { 1, 0, 1, -1 }; // 왼쪽위에서부터 검사하므로 가로,세로(밑),우측대각선(밑),좌측대각선(밑)
	int[] dy = { 0, 1, 1, 1 };

	Board(int size) { // Board생성자
		this.size = size;
		int reSize = size + 1;
		map = new String[reSize][reSize]; //
		int rowCnt = 0;
		char colCnt = 'A';
		for (int row = 0; row < reSize; row++) { // 20칸
			for (int col = 0; col < reSize; col++) { // 20칸
				if (col == 0 && row == reSize - 1) { // 숫자도 아니고 알파벳도 아닌 공백칸 마지막열 첫행
					map[row][col] = "  ";
				} else if (col == 0) { // 숫자열 넣는 (0~18)
					if (row < 10) { // 10미만 일경우 빈칸을 추가해서 띄워쓰기 맞춤
						map[row][col] = String.valueOf(" " + rowCnt);
						rowCnt++;
						continue;

					}
					map[row][col] = String.valueOf(rowCnt); // 10이상일 경우 그냥 추가
					rowCnt++;
				} else if (row == reSize - 1) { // 마지막 20번째행 알파벳행
					map[row][col] = String.valueOf(colCnt);
					colCnt += 1;
				} else
					map[row][col] = ".";

			}

		}
	}

	public void print() {
		for (int row = 0; row < size + 1; row++) {
			for (int col = 0; col < size + 1; col++) {
				System.out.print(" " + map[row][col]);
			}

			System.out.println();
		}
	}

	public boolean check(Player player) { // 어떤 플레이어를 체크받을지

		String stone = player.stone;

		for (int row = 0; row < size + 1; row++) {
			for (int col = 0; col < size + 1; col++) {
				if (map[row][col].equals(stone)) {

					for (int i = 0; i < 4; i++) { // 왼쪽위에서부터 검사하므로 가로,세로(밑),우측대각선(밑),좌측대각선(밑)
													// 이 방향으로 해보자
						int cnt = 1; // 시작하는 돌이니 cnt =1
						int nx = row + dx[i]; // 다음돌 인덱스
						int ny = col + dy[i];

						while (nx >= 0 && nx < 19 && ny >= 0 && ny < 19 && map[nx][ny].equals(stone)) { // while문의 조건이
																										// 빡빡
							cnt++;

							if (cnt == 5) { // 조건성립 여기들어온 순간 while문 밖으로 나감 방향 다시설정
								// 양옆검사
								if ((row - dx[i] >= 0) && (row - dx[i] <= 18) && (col - dy[i] >= 1)
										&& (col - dy[i] <= 19) && map[row - dx[i]][col - dy[i]].equals(stone)) {

									break; // 유효범위안에 있는데 같으면
								}
								if ((nx + dx[i] >= 0) && (nx + dx[i] <= 18) && (ny + dy[i] >= 1) && (ny + dy[i] <= 19)
										&& map[nx + dx[i]][ny + dy[i]].equals(stone)) { // 유효범위안에 있는데 같으면

									break;

								}
								// 이길경우

								System.out.println(player.name + "이 승리하였습니다!");
								return true;

							} // while문 자체가 실행되는 경우가 많지않음

							nx += dx[i]; // 계속 진행 한칸 더 앞으로
							ny += dy[i];
						}

					}

				}
			}
		}
		return false;

	}

	public boolean put(Player player, String colInput, int row) {

		// 문자 -> 숫자 A = 1 인덱스로 반환
		int col = colInput.charAt(0) - 'A' + 1;

		// 범위
		if (col < 1 || col > size || row < 0 || row >= size) { // 행 0~18 , 열 1~19
			System.out.println("보드 범위 벗어남. 다시 입력");
			return false;
		}
		// 이미 놓아진 곳인지 체크
		if (!map[row][col].equals(".")) {
			System.out.println("이미 놓아진 곳입니다! 다시 입력");
			return false;
		}

		map[row][col] = player.stone;
		return true;
	}
}

//    public boolean duplicate(int r, int c) {
//    	
//    	
//    	
//    	for (int row = 0; row < size+1; row++) {
//            for (int col = 0; col < size+1; col++) {
////                
////            	if(map[row][0].equals(num)  && map[size][col].equals(alpha)) {
////            		map[row][col]=player.stone;
////            	
////            	}
//            	if(row == r && col ==c) {
//            		
//            		if(!map[row][col].equals(".")) { //.이 아니면
//            			return false;
//            		}
//            		
//            		
//            		
// 
//            	}
//            	
//            }
//                        
//        }
//    	return true;
//    }

//public boolean put2(Player player,String alpha, String num) {
//
//	//입력받은 거를 바로 인덱스로 바꾸자
//	int r = Integer.parseInt(num);
//	int c = alpha.charAt(0)-64;
//
//	//J 10을 찾자
//
//	for (int row = 0; row < size+1; row++) {
//      for (int col = 0; col < size+1; col++) {
////
////      	if(map[row][0].equals(num)  && map[size][col].equals(alpha)) {
////      		map[row][col]=player.stone;
////
////      	}
//      	if(row == r && col ==c) {
//
//      		if(!duplicate(row,col)) {
//      			System.out.println("이미 놓아진 곳입니다!");
//      			return false;
//      		}
//
////      		if(!rangeCheck(row,col)) {
////
////
////      		}
//      		map[row][col]=player.stone;
//
//      		return true;
//
//
//
//      	}
//      }
//
//  }
//
//
//
//
//}
