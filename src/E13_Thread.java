
public class E13_Thread {

	//메인은 사실 메인 쓰레드라고 부른다
	public static void main(String[] args) {
		
		// 쓰레드 인스턴스를 생성한다
		MyThread t0 = new MyThread(10);
		MyThread t1 = new MyThread(3);
		MyThread t2 = new MyThread(8);
		MyThread t3 = new MyThread(100);
		
		t0.start();// 메인 쓰레드는 다른 쓰레드의 시작 버튼만 눌러주고 코드를 계속 진행한다
		t1.start();
		t2.start();
		t3.start();// main보다 더 오래 생존해 있는 쓰레드
		
		int i = 0;
		while (i++ < 10) {			
			System.out.println("main: " +i);
			
				// 현재 쓰레드를1초 멈춘다
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class AssistThread extends Thread {
	
	int parent;
	
	public AssistThread(int parent) {
		this.parent = parent;
		this.setDaemon(true);
		
	}
	@Override
		public void run() {
			while(true) {
			System.out.printf("%d번 쓰레드의 보조 쓰레드(데몬)입니다..\n", parent);
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

// Thread 클래스를 상속받으면 main과 동시에 동작할 수 있는 쓰레드가 된다
class MyThread extends Thread{
	
	static int totalnumber = 0;
	
	int num;
	int target;
	
	public MyThread(int target) {
		num = totalnumber++;
		this.target = Math.abs(target);
	}
	
	@Override
	public void run() {
		new AssistThread(num).start(); // 쓰레드에서 보조 쓰레드 실행
		
		// 이 쓰레드의 main 같은 곳
		// 메인 쓰레드 또는 다른 쓰레드에서 이 쓰레드를 실행하면 이곳의 코드를 실행한다
		int i = 0;
		while (i++ < 10) {
			System.out.printf("Thread%d: %d\n", num, i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}