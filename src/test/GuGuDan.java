package test;

import java.io.FileWriter;
import java.io.IOException;

public class GuGuDan {
	public static void main(String[] args) {
		
		FileWriter out = null;

		try {
			out =new FileWriter("myfiles/GuGuDan.txt");
	
			for (int dan = 2; dan <= 9; ++dan) {
				for (int gop = 1; gop <= 9; ++gop) {					
					out.write(dan +"X"+ gop + "=" + dan*gop + "\t");
					//System.out.printf("%d x %d = %-4d", dan, gop, dan*gop);
				}
				out.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
				out.close();
				}
			} catch (IOException e) {
					e.printStackTrace();
			}	
		}
	}
}
