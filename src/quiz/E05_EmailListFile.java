package quiz;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05_EmailListFile {

	// D11번 문제에 있는 기자들의 이메일들로만 이루어진 파일을 myfiles 폴더에 생성해 보세요

	public static void main(String[] args) {
		D11_ReporterList RPL = new D11_ReporterList();
		
		Pattern email = Pattern.compile(""
				+ "(.+)\\s+(\\S+)\\s+([가-힣]+)\\s+((\\w*)@(\\w*(\\.\\w+)*))");
		Matcher m = email.matcher(RPL.reporter);
		
		try {
			FileWriter out = new FileWriter("myfiles/reporterlist.txt");
			
			while(m.find()) {
//				System.out.println("이메일: " + m.group(4));
				out.write("이메일: " + m.group(4)+ "\n");
			}
			
			
			
			
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();

	}
}

