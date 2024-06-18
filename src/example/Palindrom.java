package example;

public class Palindrom {
	
	public static void main(String[]args) {
		String word = "hello"; // len = 5
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		
		// len -1 : 마지막 글자의 위치
		// len -1 -0 : 마지막 글자의 위치
		// len -1 -1 : 뒤에서 부터 두 번째 글자의 위치
		System.out.println(word.charAt(5 - 1 - 0));
		System.out.println(word.charAt(5 - 1 - 1));
		System.out.println(word.charAt(5 - 1 - 2));
		System.out.println(word.charAt(5 - 1 - 3));
		System.out.println(word.charAt(5 - 1 - 4));

	}

}
