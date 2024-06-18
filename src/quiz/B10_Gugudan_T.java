package quiz;

public class B10_Gugudan_T {

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
		
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.print(dan + "단: ");
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%-4d", dan, gop, dan*gop);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int gop = 0; gop <=9; ++gop) {
			for (int dan =2 ; dan <= 9; ++dan) {
				if (gop == 0 ) {
					System.out.print(dan + "단\t");
				}else {
					System.out.printf("%dx%d=%d\t", dan, gop, dan*gop);
				}
			}	
			System.out.println();
		}
		
	}

}
