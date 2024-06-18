package quiz;

public class A03_TypeQuiz {

	public static void main(String[] args) {
		
		int age = 20, w = 75; // 자원을 아주 절약해야하는 상황이 아니라면 그냥 int쓰는 편
		double tall = 178.5; // or float tell = 178.5F; 자원을 아주 절약해야하는 상황이 아니라면 그냥 double쓰는 편
		String name="홍길동", phone="010-1234-1234", bl= "O"; // AB형은 char타입에 저장할 수 없으므로 String을 써야한다
		
		System.out.println("이름: "+ name + "\n"
				+ "나이: " + age + "\n"
				+ "Tel: " + phone + "\n" 
				+ "키  : " + tall + "\n" 
				+ "몸무게\t:" + w + "\n"
				+ "혈액형\t:" + bl);
		

	}
	

}
