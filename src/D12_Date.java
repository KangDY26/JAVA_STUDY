import java.util.Date;

public class D12_Date {
	/*
	 	# java.util.Date
	 	
	 	- 시간 및 날짜 정보를 다루는 클래스
	 	- 오래된 클래스이기 때문에 시간 정보 데이터 보관용으로만 사용하고
	 	  메서드는 잘 사용하지 않는다
	 */
	public static void main(String[] args) {
		
		// 기본 생성자로 인스턴스 생성 시 현재 시간이 나온다
		Date now = new Date();
		System.out.println(now);
		
		// long타입 값을 전달하여 인스턴스 생성 시 원하는 시간으로 설정할 수 있다
		// (1970년 1월 1일을 기준으로 시간을 설정할 수 있다 - 유닉스 타임)
		Date d1 =new Date(-1001);
		System.out.println(d1);
		
		Date d2 = new Date(System.currentTimeMillis());
		System.out.println(d2);
		
		// System.currentTimeMillis() : 현재 시간의 유닉스 타임을 long타입으로 꺼내는 메서드
		// ※ Unix Time - 1970 1월 1일 오전 9시 이후로 시간이 얼마나 흘렀는지 밀리초(1/1000)로 센 것
		System.out.println("1970년 이후로 흐른 시간: " + System.currentTimeMillis() / 1000 +"초");
		
	}
}
