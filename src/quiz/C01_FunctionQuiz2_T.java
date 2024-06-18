package quiz;

import java.util.Arrays;

	public class C01_FunctionQuiz2_T {
	
		public static void main(String[]args) {
		
			System.out.println(Arrays.toString(getrandomNumbers(0, 6, 7)));
			System.out.println(shuffled("Department Store"));
			System.out.println(Arrays.toString(getLottoNumbers()));
			System.out.println(chkecPalindromes("ABBA"));
			System.out.println(chkecPalindromes("ABBa"));
			System.out.println(chkecPalindromes("Father"));
			System.out.println(chkecPalindromes("MoM"));

		}
		
	// 1. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	
	// 0~6이 들어왔을때 중복없이 0 ~ 6까지의 숫자를 랜덤으로 반환하는 함수
	public static int[] getrandomNumbers(int start, int end, int size) {
		int[] arr = new int [size];
		
		int currindex = 0;
		while (currindex < size) {
			int num = (int)(Math.random() * (end - start + 1) + start);
			
			boolean repeated = false;
			for (int i = 0; i < currindex; ++i) {
				if (arr[i] == num) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				arr[currindex++] = num;
			}
		}
		
		return arr;
	}
	
	public static String shuffled(String text) {
		int len =text.length();
		
		// (1) 문자열 길이를 활용해 중복없는 랜덤 순서 인덱스 배열을 먼저 생성한다
		//		ex) 길이가 10일때 0~9의 중복없는 랜덤 배열을 생성한다
		int[] ranNums = getrandomNumbers(0, len-1, len);
		
		// (2) 생성된 배열을 활용해 문자열을 섞어서 출력한다
		String shuffled = "";
		
		for (int i = 0; i < ranNums.length; ++i) {
			shuffled += text.charAt(ranNums[i]);
		}
		
		return shuffled;
	}

	
	// 2. 문자열을 전달하면 해당 문자열을 거꾸로 뒤집은 문자열을 반환하는 함수
	public static String reverse(String text) {
			int len = text.length();
			String reversed = "";
			for (int i = len -1; i >= 0; --i) {
				reversed += text.charAt(i);
			}
			return reversed;
	}
		
	 	
	// 3. 문자열을 전달하면 해당 문자열의 좌우대칭 여부를 반환하는 함수
	public static boolean chkecPalindromes(String text) {
		return text.equals(reverse(text));
	}
	
	
    // 4. 함수를 호출하면 1	~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	 public static int[]	 getLottoNumbers() {
		return getrandomNumbers(1, 45, 7);
	 	}
	 



}

















