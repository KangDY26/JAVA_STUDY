import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E08_AutoClose {

	public static void main(String[] args) {
		// 닫을수 있는 (Closeable 인터페이스가 구현된) 클래스는
		// try문을 사용할 때 AutoClose 문법을 사용할 수 있다
		
		// try문에 ()를 열고 사용한 변수는 try문이 끝나면서 자동으로 닫히게 된다
		try(
			FileReader in = new FileReader("myimage/memo/emails.txt");
			FileWriter out = new FileWriter("myimage/copiedEmails.txt", true);
		) {
			// FileWriter의 append 값을 true로 주면 모드가 되어서
			// 파일에 내용을 계속 누적시킬 수 있다
			out.write("안녕하세요~!\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
