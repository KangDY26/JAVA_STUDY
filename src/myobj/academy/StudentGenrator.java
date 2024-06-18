package myobj.academy;

public class StudentGenrator {
	String academyName;
	int generateCount = 0;
	
	public StudentGenrator(String academyName) {
		this.academyName = academyName;
	}

	public String generate() {
		return String.format("%s%06d",academyName, generateCount++);
	}
}
