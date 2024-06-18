package myobj.academy;

// 네트워크 반학생들은
// 국어 영어 리눅스 네트워크 CCNA 점수가 있다
public class NetworkStudent extends AcademyStudent{
	int kor;
	int eng;
	int linux;
	int network;
	int ccan;
	
	// 생략가능함
	public NetworkStudent() {
		super();
		kor = genrateRandomScore();
		eng = genrateRandomScore();
		linux = genrateRandomScore();
		network = genrateRandomScore();
		ccan = genrateRandomScore();
	}
	
	@Override
	public int getTotal() {
		return kor + eng +linux + network + ccan;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 5.0;
	}
	
	@Override
	public String getGreade() {
		double avg = getAvg() ;
		if (avg >= 90) {
			return "A";
		}else if (avg >= 80) {
			return "B";
		}else if (avg >= 70) {
			return "C";
		}else if (avg >= 60) {
			return "D";
		}else {
			return "F";
		}
	}
	
	@Override
	public String getScores() {
		return String.format("국어: %d\n영어: %d\n리눅스: %d\n"
				+"네트워크: %d\nCCNA: %d\n", kor, eng, linux, network, ccan);
	}
}








