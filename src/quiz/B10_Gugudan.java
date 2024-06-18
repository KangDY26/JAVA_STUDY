package quiz;

public class B10_Gugudan {

	/*
	 * 1. 구구단을 다음과 같이 가로로 출력해 보세요
	 * 
	 * 2단 2x1=2 2x2=4 ... 3단 3x1=3 ...
	 * 
	 * 2. 구구단을 다음과 같이 세로로 출력해 보세요
	 * 
	 * 2단 3단 4단 .. 2x1=2 3x1=3 4x1=4 .. 2x2=4 ..
	 * 
	 */

	public static void main(String[] args) {

		int cnt = 0;
		
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d단 \t", dan);
			for (int gop = 2; gop <= 9; ++gop) {
				System.out.printf("%d x %d = %d\t", dan, gop, dan * gop);
				++cnt;
				
				if (cnt % 8 == 0) {
					System.out.println();
				}
			}
		}


		
		System.out.println();

		int cnt1 = 0;
		
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d단 \t\t", dan);
		}
		System.out.println();
		for (int dan = 1; dan <= 9; ++dan) {
			for (int gop = 2; gop <= 9; ++gop) {
				System.out.printf("%d x %d = %d\t", gop, dan, dan * gop);
				++cnt1;
				
				if (cnt1 % 8 == 0) {
					System.out.println();
				}
			}
		}
	}

}
