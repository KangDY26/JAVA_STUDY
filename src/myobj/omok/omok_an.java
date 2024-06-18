package myobj.omok;

public class omok_an {
	public static void main(String[] args) {
		Omok omok = new Omok();

//		omok.putWhite(7, 8);
		
//		omok.putBlack(3, 7);
//		omok.putBlack(4, 7);
//		omok.putBlack(5, 7);
//		omok.putBlack(6, 7);
//		omok.putBlack(7, 7);
		
//		omok.putBlack(7, 7);
//		omok.putBlack(7, 8);
//		omok.putBlack(7, 9);
//		omok.putBlack(7, 10);
//		omok.putBlack(7, 11);
		
		// 대각선 왹쪽 위
//		omok.putBlack(7, 7);
//		omok.putBlack(6, 6);
//		omok.putBlack(5, 5);
//		omok.putBlack(4, 4);
//		omok.putBlack(3, 3);

		// 대각선 왼쪽 아래
		omok.putBlack(7, 7);
		omok.putBlack(6, 8);
		omok.putBlack(5, 9);
		omok.putBlack(4, 10);
		omok.putBlack(3, 11);

		// 대각선 오른쪽 위
//		omok.putBlack(7, 7);
//		omok.putBlack(8, 6);
//		omok.putBlack(9, 5);
//		omok.putBlack(10, 4);
//		omok.putBlack(11, 3);

		// 대각선 오른쪽 아래
//		omok.putBlack(7, 7);
//		omok.putBlack(8, 8);
//		omok.putBlack(9, 9);
//		omok.putBlack(10, 10);
//		omok.putBlack(11, 11);





		System.out.println(omok.postCheck(7, 7, omok.BLACK_STONE));
		
		
		omok.printBoard();
		
	}

}
