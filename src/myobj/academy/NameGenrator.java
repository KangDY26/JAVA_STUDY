package myobj.academy;

public class NameGenrator {
	    // 다른 클래스에서 쓸 필요없는 자원들을 private으로 숨겨놓는다
		private static String[] lastNameCandidates = {"김", "이", "박", "최"};
		private static String[] firstNameCandidates = {"영", "철", "수", "지", "민", "식", "시"};
		
		public void setLastNameCandidates(String...lastName) {
			this.lastNameCandidates = lastName;
		}
		
		public void setFirstNameCandidates(String... firstNameCandidates) {
			this.firstNameCandidates =firstNameCandidates;
		}
		
		// 다른 클래스에서 쓸 필요가 없는 기능을 private으로 숨겨놓는다
		private String selectRandomOne(String[] arr) {
			return arr[(int)(Math.random()*arr.length)];
		}
		public String generate() {
			return selectRandomOne(lastNameCandidates)
					+selectRandomOne(firstNameCandidates)
					+selectRandomOne(firstNameCandidates);
		}
		public static String getRandomName() {
			return lastNameCandidates[(int)(Math.random()*lastNameCandidates.length)]
			       +firstNameCandidates[(int)(Math.random()*firstNameCandidates.length)]
			       +firstNameCandidates[(int)(Math.random()*firstNameCandidates.length)];
		}
}

