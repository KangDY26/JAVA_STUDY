package quiz;

import java.util.Scanner;

import java.util.Random;

public class B13_ShufflesText_T {

	/*
	 	사용자로부터 문장을 입력받으면
	 	해당 문장의 순서를 랜덤으로 뒤섞은 결과를 만들어낸 후 출력해보세요
	 	(문장 내에 공백이 포함되어 있으면 제거할 것
	 	
	 	ex> 오늘 나는 지하철을 타고 왔다 -> 다고지타왔오나늘...
	 	
	 	1. 문장을 입력받으면 공백을 제거한 배열로 만들고 싶다
	 	
	 		(1) 배열을 만들기 위해서는 정확한 배열의 크기를 알아야 한다
	 		(2) 입력받은 문장에서 공백이 아닌 문자의 개수를 알아야 배열의 크기를 설정할 수 있다
	 		(3) 문자열에 들어있는 공백이 아닌 문자들을 배열로 옮겨담는다
	 		
	 	2. 완성된 배열을 랜덤으로 섞어준다
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// "Hello" -> {'H','e','l','l','o'}
		String text = sc.nextLine();
		
		String spaceRemoved = "";
		
		for (int i=0, len = text.length(); i < len; ++i) {
			char ch = text.charAt(i);
			if (ch != ' ') {
				spaceRemoved += ch;
			}
		}
		
		// text.length()개 크기의 배열을 생성
		char[] arr = new char[spaceRemoved.length()];
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = spaceRemoved.charAt(i);
		}

// 		섞기 (랜덤한 위치를 뽑으려 하면 같은 위치가 자꾸걸려서 문제가 된다)
//		for (int i = 0; i < arr.length; ++i) {
//			arr[i] = arr[(int)(Math.random()*arr.length)];
//		}
//		System.out.println(arr);
		
		
		// 화투처럼 섞기(0번 위치와 랜덤 위치의 값을 1000번 교환한다)
		/*
		 	length : 5
		 		0	1	2	3	4
		 	arr {'H','e','l','l','o'}
		 
		 */
		for (int i=0; i < 1000; ++i) {
			// 그냥 length를 곱해서 랜덤 위치를 만들면 0이 나와서 0과 0을 교환하는 경우도 있다
			// 0 ~ 4를 만드는게 아니라 1 ~ 4를 만들어야된다
			// length가 5일때 1 ~ 4
			// length가 7일때 1 ~ 6
			// length가 13일때 1 ~ 12
			int randomIndex = (int)(Math.random() * (arr.length - 1) + 1);
			
			char temp = arr[0];
			arr[0] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
		System.out.println(arr);
	}		
}
