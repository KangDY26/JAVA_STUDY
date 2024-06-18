package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E10_FileEncryption {
	/*
	 	frankenstein.txt를 시저 암호방식으로 암호화한 새 파일
	 	frankenstein_encrypted.enc을 생성해보세요
	 	
	 	(1) char 단위로 한 글자씩 암호화하는 속도를 측정해보기
	 	
	 	(2) char[] 방식으로 암호화하는 속도를 측정해 보기
	 	
	 	(3) Buffered 클래스를 붙여 암호화하는 속도를 측정해보기
	 	
	 	(4) 이미 같은 이름의 결과 파일이 경로에 존재한다면
	 	    파일의 이름 뒤에 (숫자)를 붙여 다음 파일이 생기게 만들기
	 		frankenstein_encrypted(1).enc
	 		frankenstein_encrypted(2).enc
	 		frankenstein_encrypted(3).enc...
	 */
		
	public static void main(String[] args) {
		File emailFile = new File("C:/Users/i7/Documents/카카오톡 받은 파일/frankenstein.txt");
		
		try (
			FileReader in = new FileReader(emailFile);
			){
			
			int ch;
			while((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	//1.
	String cryptSet;

	public E10_FileEncryption() {
		cryptSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_="
				+ "+abcdefghijklmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.\r\n";
	}
	public E10_FileEncryption(String cryptSet) {
		this.cryptSet = cryptSet;
	}
	String encrypt(String plain, int key) {
		StringBuilder result = new StringBuilder();
		
		int len = plain.length();
		
		for (int i = 0; i < len; ++i) {
			char ch = plain.charAt(i);
			
			int index = cryptSet.indexOf(ch);

			if (index != -1) {
				result.append(cryptSet.charAt(
						(index + key) % cryptSet.length()));
			} else {
				result.append(ch);
			}
		}
		
		return result.toString();
	}
	public static void main2(String[] args) {
		E10_FileEncryption cipher1 = new E10_FileEncryption();
		
		String encrypted = cipher1.encrypt("emailFile", 10);
		System.out.println(encrypted);

	}
}
	



