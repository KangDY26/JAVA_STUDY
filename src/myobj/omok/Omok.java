package myobj.omok;

public class Omok {

	final static char[] OMOK_CHARS = {'┼', '┌', '┬', '┐', '├', '┤', '└', '┴',
			'┘', '╋', '●', '○'};
	
	final public static int BLACK_STONE = 10;
	final public static int WHITE_STONE = 11;
	
	final public static int BOARD_WIDTH = 15;
	final public static int BOARD_HEICHT = 15;
	
	int[][] board;
	
	public Omok() {
		board = new int[][] {
			{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
			{6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8},
		};
	}
	
	// 놓기 전에 진행하는 체크 ( 삼삼 같은 것..)
	public int preCheck(int x, int y, int stone) {
		return 0;
	}
	
	// 놓은 후에 진행하는 체크 (승리 여부)
	public int postCheck(int x, int y, int stone) {
		// 가로로 연속으로 놓여있는 돌의 개수를 세기
		
		int count = 0;
		// 오른쪽 가로 체크
		for (int i = x; i < BOARD_WIDTH; ++i) {
			if (board[y][i] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		// 왼쪽 (방금 놓은 위치 미포함)
		for (int i = x - 1; i >= 0; --i) {
			if (board[y][i] == stone) {
				++count;
			} else {
				break;
			}
		}

		
		if (count == 5) {
			return 1; // 승리
		}
		
		count = 0;
		
		// 세로로 연속으로 놓여있는 돌의 개수 세기
		
		for (int i = y; i < BOARD_HEICHT; ++i) {
			if (board[i][x] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		for (int i = y - 1; i >= 0; --i) {
			if(board[i][x] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		if(count == 5) {
			return 1;
		}
		
		count = 0;

		// 대각선으로 연속으로 놓여있는 돌의 개수 세기 과제
//		for (int i = x; i < BOARD_WIDTH; ++i) {
//			for (int j = y; j < BOARD_HEICHT; ++j) {
//			if (board[i][j] == stone) {
//				++count;
//			} else {
//				break;
//			}
//			}
//		}
//		
//		for (int i = x - 1; i >= 0; --i) {
//			for (int j = y - 1; j >= 0; --j) {
//			if (board[i][j] == stone) {
//				++count;
//			} else {
//				break;
//			}
//			}
//		}
//		
//		if(count == 5) {
//			return 1;
//		}
		
		return 0; // 아무것도 아님
	}
	
	public boolean putBlack (int x, int y) {
		return putStone (x, y, BLACK_STONE);
	}
	
	public boolean putWhite (int x, int y) {
		return putStone (x, y, WHITE_STONE);
	}
	
	public boolean putStone(int x, int y, int Stone) {
		if (x >= BOARD_WIDTH || x < 0 || y >= BOARD_HEICHT || y < 0) {
			System.out.printf(
					"[SYSTEM] 그곳은 놓을 수 없는 위치입니다. (%d, %d)\n", x, y);
			return false;
		}
		
		int v = board[y][x];
		
		if (v != BLACK_STONE && v != WHITE_STONE) {
			board[y][x] = Stone;
			return true;
		} else {
			System.out.printf(
					"[SYSTEM] 그곳은 이미 돌이 놓여있는 위치입니다(%d, %d)\n", x, y);
			return false;
		}
	}
	
		
	public void printBoard() {
		for (int i = 0; i < board.length; ++i) {
			for(int j = 0; j < board.length; ++j) {
				System.out.printf("%2c", OMOK_CHARS[board[i][j]]);
			}
			System.out.println();
		}
	}
	
	
	
//	public void printBoard() {
//		for (int i = 0; i < board.length; ++i) {
//			for(int j = 0; j < board.length; ++j) {
//				if (board[i][j] == 1) {
//					System.out.printf("%2c",'┌');
//				} else if (board[i][j] == 2) {
//					System.out.printf("%2c",'┬');
//				} else if (board[i][j] == 3) {
//					System.out.printf("%2c",'┐');
//				} else if (board[i][j] == 4) {
//					System.out.printf("%2c",'├');
//				} else if (board[i][j] == 0) {
//					System.out.printf("%2c",'┼');
//				} else if (board[i][j] == 5) {
//					System.out.printf("%2c",'┤');
//				} else if (board[i][j] == 6) {
//					System.out.printf("%2c",'└');
//				} else if (board[i][j] == 7) {
//					System.out.printf("%2c",'┴');
//				} else if (board[i][j] == 8) {
//					System.out.printf("%2c",'┘');
//				} else if (board[i][j] == 9) {
//					System.out.printf("%2c",'╋');
//				}
//			}
//			System.out.println();
//		}
//	}
}
