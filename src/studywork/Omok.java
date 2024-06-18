package studywork;

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
	
	public int preCheck(int x, int y, int stone) {
		return 0;
	}
	
	public int postCheck(int x, int y, int stone) {
		
		int count = 0;
		for (int i = x; i < BOARD_WIDTH; ++i) {
			if (board[y][i] == stone) {
				++count;
			} else {
				break;
			}
		}
		
		for (int i = x - 1; i >= 0; --i) {
			if (board[y][i] == stone) {
				++count;
			} else {
				break;
			}
		}

		
		if (count == 5) {
			return 1; 
		}
		
		count = 0;
				
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

		return 0; 
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
			
			
			Omok omok = new Omok();
			
			omok.putBlack(7, 7);
			omok.putBlack(6, 8);
			omok.putBlack(5, 9);
			omok.putBlack(4, 10);
			omok.putBlack(3, 11);
			
			omok.putBlack(7, 7);
			omok.putBlack(8, 6);
			omok.putBlack(9, 5);
			omok.putBlack(10, 4);
			omok.putBlack(11, 3);
			
			System.out.println(omok.postCheck(7, 7, omok.BLACK_STONE));
			
			
			omok.printBoard();

	}
	
}