package homeworkOmok;

public class Board {
    int size;
    String[][] map;
    
    Board(int size) {
        this.size = size;
        map = new String[size][size]; // 20 X 20
        
        // 맵 초기화
        // 마지막 행의 인덱스는 size - 1 입니다.
        int lastRowIndex = size - 1; 

        
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                
                // 1. (0, 0) 칸: 비어두기
                if (row == lastRowIndex && col == 0) {
                    map[row][col] = " "; 
                }
                
                // 2. 제일 밑 바닥 행 (가로 좌표): 알파벳으로 채움
                // col=1부터 A, B, C... 로 표시
                else if (row == lastRowIndex) {   
                    // 'A'의 아스키 코드에 col-1을 더하여 알파벳을 만듭니다.
                    map[row][col] = String.valueOf((char)('A' + col - 1));
                } 
                
                // 3. 첫 번째 열 (세로 좌표): 숫자로 채움 (0부터 증가)
                // row=0부터 0, 1, 2... 로 표시
                else if (col == 0) {
                    // row 변수를 그대로 사용하면 0부터 증가하는 숫자가 됩니다.
                    map[row][col] = String.valueOf(row); 
                } 
                
                // 4. 나머지 실제 게임판 영역: "."으로 채움
                else {
                    map[row][col] = ".";
                }
            }
        }
    }
    
    // print() 메소드는 출력 간격 조정을 위해 그대로 사용합니다.
    public void print() {
        for (int row = 0; row < size; row++) {
            // 세로 좌표(숫자) 간격 맞추기
            if (row >= 0 && row < 10) { // 0도 한 자릿수로 처리
                System.out.print(" "); 
            }
            
            for (int col = 0; col < size; col++) {
                // 알파벳과 '.' 등은 공백을 두고 출력
                System.out.print(" " + map[row][col]);
            }
            System.out.println();
        }
    }
}