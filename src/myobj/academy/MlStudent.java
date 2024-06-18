package myobj.academy;

// 머신러닝 반 학생들은
// 국어 영어 수학 통계학 파이썬 NO-SOL 점수가 있다
public class MlStudent extends AcademyStudent{
	static String[] subjectName = {"국어", "영어", "수학", "통계학", "파이썬", "NO-SQL"};
	int[] scores = new int[6];
	
	public MlStudent() {
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = genrateRandomScore();
		}
	}
	
	@Override
	public int getTotal() {
		int sum = 0;

		for (int i = 0; i < scores.length; ++i) {
			sum += scores[i];
		}
		return sum;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / (double)scores.length;
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
		String str = "";
		
		for (int i = 0; i < scores.length; ++i) {
			str += String.format("%s: %d\n",subjectName[i] ,scores[i]);
		}
		return str;
	}
}






