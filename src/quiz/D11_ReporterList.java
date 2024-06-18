package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import myobj.Reporter;

public class D11_ReporterList {

	/*
	 	1. 어떤 이메일 도메인(yna.co.kr, hankyung.com 등)이
	 	   몇 개씩 있는지 세어서 출력해보기
	 	   
	 	2. 어떤 신문사의 기자가 몇 명씩 있는지 세어서 출력해보기
	 	
	 	3. 어떤 분야의 기사가 몇 명씩 있는지 세어서 출력해보기
	 	
	 	4. 모든 기자의 이름/이메일/분야를 신문사별로 분류하여 출력해주기
	 	
	 	5. 모든 기자의 이름/이메일/신문사를 분야별로 분류하여 출력해주기
	 */
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(""
				+ "(.+)\\s+(\\S+)\\s+([가-힣]+)\\s+((\\w*)@(\\w*(\\.\\w+)*))");
		
		Matcher m = p.matcher(reporter);
		
		HashMap<String, Integer> domainCountMap = new HashMap<>();
		HashMap<String, Integer> repoterCountMap = new HashMap<>();
		HashMap<String, Integer> fieldCountMap = new HashMap<>();

		ArrayList<Reporter> reporters = new ArrayList<>();
		
			
		while (m.find()) {
			//System.out.println("---------------------");
			//System.out.println("언론사: " + m.group(1));
			//System.out.println("분야: " + m.group(2));
			//System.out.println("이름: " + m.group(3));
			//System.out.println("이메일: " + m.group(4));
			//System.out.println("아이디: " + m.group(5));
			//System.out.println("도메인: " + m.group(6));
			
			
			String company = m.group(1);
			String field = m.group(2);
//			String reporterName = m.group(3);
			String domainName = m.group(6);

			reporters.add(new Reporter(m.group(3), company, field, m.group(4)));
			
			// getOrDefault(key, default) : 해당 키값으로 get이 안되면 기본값을 준다
			domainCountMap.put(domainName, 
					domainCountMap.getOrDefault(domainName, 0) + 1);
			repoterCountMap.put(company, 
					repoterCountMap.getOrDefault(company, 0) + 1);
			fieldCountMap.put(field,
					fieldCountMap.getOrDefault(field, 0) + 1);
			
			
//			if (!domainCountMap.containsKey(domainName)) {
//				domainCountMap.put(domainName, 1);
//			} else {
//				domainCountMap.put(domainName,
//						domainCountMap.get(domainName) + 1);
//			}
		}
		//System.out.println("#각 도매인의 개수");
		//System.out.println(domainCountMap);
		//System.out.println("#각 언론사의 기자수");
		//System.out.println(repoterCountMap);
		//System.out.println("#각 분야의 기자 수");
		//System.out.println(fieldCountMap);

		// Map : 키와 값을 저장할 수 있는 것
		// categoryCompany : 키값으로 회사의 이름을 쓰고 값으로 리스트를 사용한다
		HashMap<String, List<Reporter>> categoryCompany = new HashMap<>();	
		
		
		// reporters : 정규표현식으로 찾은 기자들을 모두 더해놓은 리스트
		// forEach : 하나씩 꺼내면서 반복
		for (Reporter reporter : reporters) {
			// 기자를 한명씩 꺼내면서 해당 기자의 회사 이름을 꺼낸다
			String companName = reporter.getCompany();
			
			if (!categoryCompany.containsKey(companName)) {
				// 첫 등록일 때(회사이름이 키로 등록된적이 없을 때)
				List<Reporter> list = new ArrayList<>();
				list.add(reporter);
				categoryCompany.put(companName, list);
			}else {
				// 두 번째 이후의 등록 (이미 리스트는 짠상태)
				List<Reporter> list = categoryCompany.get(companName);
				list.add(reporter);
			}
		}
		
		for (Reporter reporter1 : reporters) {
			String fieldName = reporter1.getField();
			
			if (!categoryCompany.containsKey(fieldName)) {
				List<Reporter> list = new ArrayList<>();
				list.add(reporter1);
				categoryCompany.put(fieldName, list);
			} else {
				List<Reporter> list = categoryCompany.get(fieldName);
				list.add(reporter1);
			}	
		}
		
		
		
		
		for (String company : categoryCompany.keySet()) {
			System.out.println("### " + company + "의 기자들 ###");
			for(Reporter reporter : categoryCompany.get(company)) {
				System.out.println(reporter);
			}
			System.out.println();
		}
		
		for (String field : categoryCompany.keySet()) {
			System.out.println("###" + field + "###");
			for(Reporter reporter1 : categoryCompany.get(field)) {
				System.out.println("----------------");
				System.out.println(reporter1);
				System.out.println("----------------");
			}
			System.out.println();

		}
		
		
		
	}
	
	public static String reporter = "\r\n"
			+ "국민일보 가정/육아 문수정 thursday@kmib.co.kr \r\n"
			+ "중앙일보 가정/육아 이유림 tamaro@joongang.co.kr \r\n"
			+ "동아일보 가정/육아 이진구 sys1201@donga.com \r\n"
			+ "조선일보 가정/육아 김성모 sungmo@chosun.com \r\n"
			+ "한겨례 가정/육아 구본권 starry9@hani.co.kr \r\n"
			+ "조선일보 가정/육아 박종인 seno@chosun.com \r\n"
			+ "동아일보 가정/육아 양현모 ranbi@donga.com \r\n"
			+ "서울신문 가정/육아 이재연 oscal@seoul.co.kr \r\n"
			+ "중앙일보 가정/육아 황정욱 ok76@joongang.co.kr \r\n"
			+ "조선일보 가정/육아 김미리 miri@chosun.com \r\n"
			+ "한국경제 가정/육아 김은영 mellisa@hankyung.com \r\n"
			+ "서울신문 가정/육아 전경하 lark3@seoul.co.kr \r\n"
			+ "코메디 가정/육아 강경훈 kwkang@kormedi.com \r\n"
			+ "뉴시스 가정/육아 김명원 kmx1105@newsis.com \r\n"
			+ "연합뉴스 가정/육아 김승욱 kind3@yna.co.kr \r\n"
			+ "중앙일보 가정/육아 김진원 jwbest7@joongang.co.kr \r\n"
			+ "서울신문 가정/육아 정현용 junghy77@seoul.co.kr \r\n"
			+ "조선일보 가정/육아 이현주 jooya@chosun.com] \r\n"
			+ "연합뉴스 가정/육아 정주호 jooho@yna.co.kr \r\n"
			+ "서울신문 가정/육아 심재억 jeshim@seoul.co.kr \r\n"
			+ "YTN 가정/육아 김잔디 jandi@ytn.co.kr \r\n"
			+ "동아일보 가정/육아 노지현 isityou@donga.com \r\n"
			+ "경향신문 가정/육아 장은교 indi@kyunghyang.com \r\n"
			+ "동아일보 가정/육아 이미지 image@donga.com \r\n"
			+ "조선일보 가정/육아 홍유미 hym@chosun.com \r\n"
			+ "중앙일보 가정/육아 김혜영 hyeyeong@joongang.co.kr \r\n"
			+ "서울신문 가정/육아 오이석 hot@seoul.co.kr \r\n"
			+ "동아일보 가정/육아 곽민영 havefun@donga.com \r\n"
			+ "한국경제 가정/육아 박영주 gogogirl@bntnews.co.kr \r\n"
			+ "헤럴드경제 가정/육아 조문술 freiheit@heraldm.com \r\n"
			+ "연합뉴스 가정/육아 김영묵 economan@yna.co.kr \r\n"
			+ "한겨례 가정/육아 고나무 dokko@hani.co.kr \r\n"
			+ "조선일보 가정/육아 김철중 doctor@chosun.com \r\n"
			+ "동아일보 가정/육아 이종식 bell@donga.com \r\n"
			+ "내일신문 가정/육아 김영희 beauty02k@hanmail.net \r\n"
			+ "매일경제 건강상식 김지수 winfrey@mkhealth.co.kr \r\n"
			+ "중앙일보 건강상식 이세라 slwitch@joongang.co.kr \r\n"
			+ "한국경제 건강상식 정종호 rumba@hankyung.com \r\n"
			+ "헤럴드 건강상식 유지현 prodigy@heraldm.com \r\n"
			+ "중앙일보 건강상식 황정옥 ok76@joongang.co.kr \r\n"
			+ "헤럴드 건강상식 김재현 madpen@heraldm.com \r\n"
			+ "동아일보 건강상식 이진한 likeday@donga.com \r\n"
			+ "중앙일보 건강상식 김경록 kimkr8486@joongang.co.kr \r\n"
			+ "중앙일보 건강상식 김은정 hapia@joongang.co.kr \r\n"
			+ "한국일보 건강상식 권대익 dkwon@hk.co.kr \r\n"
			+ "동아일보 건강상식 김상훈 corekim@donga.com \r\n"
			+ "조선일보 건강상식 배지영 baejy@chosun.com \r\n"
			+ "아이뉴스24 게임/E스포츠 구윤희 yuni@inews24.com \r\n"
			+ "조선일보 게임/E스포츠 이관우 temz@chosun.com \r\n"
			+ "동아일보 게임/E스포츠 김남규 rain@gamedonga.co.kr \r\n"
			+ "동아일보 게임/E스포츠 김형근 noarose@gamedonga.co.kr \r\n"
			+ "동아일보 게임/E스포츠 최호경 neoncp@gamedonga.co.kr \r\n"
			+ "중앙일보 게임/E스포츠 박명기 mkpark@joongang.co.kr \r\n"
			+ "조선일보 게임/E스포츠 최종배 jovia@chosun.com \r\n"
			+ "서울경제 게임/E스포츠 임지훈 jhlim@sed.co.kr \r\n"
			+ "노컷뉴스 게임/E스포츠 지봉철 janus@nocutnews.co.kr \r\n"
			+ "조선일보 게임/E스포츠 편집국 gamedesk@chosun.com \r\n"
			+ "조선일보 게임/E스포츠 곽승훈 european@sportschosun.com \r\n"
			+ "동아일보 게임/E스포츠 김한준 endoﬂife81@gamedonga.co.kr \r\n"
			+ "지디넷코리아 게임/E스포츠 봉성창 bong@zdnet.co.kr \r\n"
			+ "프라임경제 경제 조민경 cmk@newsprime.co.kr \r\n"
			+ "머니투데이 경제일반 홍정규 zheng@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 이율 yulsid@yna.co.kr \r\n"
			+ "머니투데이 경제일반 현영복 youngbok@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 윤진섭 yjs@edaily.co.kr \r\n"
			+ "연합뉴스 경제일반 김연정 yjkim84@yna.co.kr \r\n"
			+ "경향신문 경제일반 황보연 whynot@hani.co.kr \r\n"
			+ "연합뉴스 경제일반 이은파 sw21@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 장성구 sunggu@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 박용주 speed@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 이상민 smlee@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김세진 smile@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 송기용 sky@moneytoday.co.kr \r\n"
			+ "연합뉴스 경제일반 임승규 sklim@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 서진발 sjb@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 정성호 sisyphe@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김선한 shkim@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 전승현 shchon@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 지성호 shchi@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 조성대 sdcho@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 손상원 sangwon700@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 류종원 rjk@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 이연정 rainmaker@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 구정모 pseudojm@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 정준영 prince@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 심언철 press108@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 심재훈 president21@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 배상현 praxis@newsis.com \r\n"
			+ "연합뉴스 경제일반 국기헌 penpia21@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 박대한 pdhis959@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 송형일 nicepen@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 이명조 mingjoe@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 조성민 min365@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 최윤정 merciel@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 맹찬형 mangels@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 권혜진 lucid@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 이귀원 lkw777@yna.co.kr \r\n"
			+ "한겨례 경제일반 홍지인 ljungberg@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 이승우 leslie@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 이상현 leeyoo@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김경희 kyunghee@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김성용 ksy@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김경석 kskim@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 고일환 koman@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김현재 kn0209@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김문성 kms1234@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김재선 kjsun@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 전승엽 kirin@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 박상돈 kaka@yna.co.kr \r\n"
			+ "이데일리 경제일반 황정우 jungwoo@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 이준서 jun@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김종수 jsking@yna.co.kr \r\n"
			+ "뉴시스 경제일반 홍제성 jsa@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 조성흠 josh@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김상현 joseph@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김준기 jkkim@kyunghyang.com \r\n"
			+ "연합뉴스 경제일반 류지복 jbryoo@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김중배 jbkim@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김재홍 jaehong@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 윤선희 indigo@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 신수영 imlac@moneytoday.co.kr \r\n"
			+ "머니투데이 경제일반 홍인철 ichong@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 남현호 hyunho@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 강훈상 hskang@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 이동경 hopema@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김지훈 hoonkim@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김호준 hojun@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 이승형 haru@yna.co.kr \r\n"
			+ "머니투데이 경제일반 최현석 harrison@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 조재영 fusionjc@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김재순 ﬁdelis21c@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 경수현 evan@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 임동욱 dwlim@moneytoday.co.kr \r\n"
			+ "연합뉴스 경제일반 김정태 dbman7@moneytoday.co.kr \r\n"
			+ "연합뉴스 경제일반 신창용 changyong@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김창선 changsun@yna.co.kr \r\n"
			+ "이데일리 경제일반 황봉규 bong@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 여운창 betty@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 김재은 aladin@edaily.co.kr \r\n"
			+ "연합뉴스 경제일반 최인영 abbie@yna.co.kr \r\n"
			+ "연합뉴스 경제일반 박성우 3pedcrow@yna.co.kr \r\n"
			+ "조선일보 과학 이영완 ywlee@chosun.com \r\n"
			+ "조선일보 과학 백승재 whitesj@chosun.com \r\n"
			+ "아시아 과학 최창준 thispro@asiae.co.kr \r\n"
			+ "전자신문 과학 황태호 thhwang@etnews.co.kr \r\n"
			+ "부산일보 과학 송현수 songh@busan.com \r\n"
			+ "연합뉴스 과학 임상현 shlim@yna.co.kr \r\n"
			+ "연합뉴스 과학 송진원 san@yna.co.kr \r\n"
			+ "연합뉴스 과학 홍창진 realism@yna.co.kr	\r\n"
			+ "헤럴드경제 과학 유지현 prodigy@heraldm.com \r\n"
			+ "SBSTV 과학 이상엽 narciso@sbs.co.kr \r\n"
			+ "연합뉴스 과학 김현태 mtkht@yna.co.kr \r\n"
			+ "연합뉴스 과학 김준호 kjunho@yna.co.kr \r\n"
			+ "연합뉴스 과학 김영섭 kimys@yna.co.kr \r\n"
			+ "아시아 과학 김현철 kch@asiae.co.kr \r\n"
			+ "지디넷코리아 과학 송주영 jysong@zdnet.co.kr \r\n"
			+ "YTN 과학 박종혁 johnpark@ytn.co.kr \r\n"
			+ "지디넷코리아 과학 이재구 jklee@zdnet.co.kr \r\n"
			+ "연합뉴스 과학 박지호 jihopark@yna.co.kr \r\n"
			+ "YTN 과학 김재형 jhkim032ytn.co.kr \r\n"
			+ "동아일보 과학 전동혁 jermes@donga.com \r\n"
			+ "연합뉴스 과학 임형섭 hysup@yna.co.kr \r\n"
			+ "서울신문 과학 송혜민 huimin0217@seoul.co.kr \r\n"
			+ "전자신문 과학 박희범 hbpark@etnews.co.kr \r\n"
			+ "전자신문 과학 황지혜 gotit@etnews.co.kr \r\n"
			+ "노컷뉴스 과학 구용회 goodwill@cbs.co.kr \r\n"
			+ "파이낸셜뉴스 과학 이재원 economist@fnnews.com \r\n"
			+ "동아일보 과학 김상연 dream@donga.com \r\n"
			+ "뉴시스 과학 임영주 dasee@newsis.com \r\n"
			+ "연합뉴스 과학 오철우 cheolwoo@hani.co.kr \r\n"
			+ "동아일보 과학 이동영 argus@donga.com \r\n"
			+ "머니투데이 과학 최종일 allday33@moneytoday.co.kr \r\n"
			+ "아이뉴스24 과학 정책 김현철 ﬂuxus19@inews24.com \r\n"
			+ "머니투데이 과학 정책 최종일 allday33@moneytoday.co.kr \r\n"
			+ "서울신문 과학/우주 강경윤 newsluv@seoul.co.kr \r\n"
			+ "파이낸셜 과학정책 정상균 skjung@fnnews.com \r\n"
			+ "조선일보 과학정책 안석배 sbahn@chosun.com \r\n"
			+ "뉴시스 과학정책 박준호 pjh@newsis.com \r\n"
			+ "한국일보 과학정책 박철현 karam@hk.co.kr \r\n"
			+ "전자신문 과학정책 정지연 jyjung@etnews.co.kr \r\n"
			+ "연합뉴스 과학정책 강훈상 hskang@yna.co.kr \r\n"
			+ "서울신문 과학정책 오이석 hot@seoul.co.kr \r\n"
			+ "서울경제 과학정책 황정원 garden@sed.co.kr \r\n"
			+ "파이낸셜 과학정책 이재원 economist@fnnews.com \r\n"
			+ "조선일보 과학정책 김동섭 dskim@chosun.com \r\n"
			+ "동아일보 과학정책 김범석 bsism@donga.com \r\n"
			+ "연합뉴스 과학정책 김인철 aupfe@yna.co.kr \r\n"
			+ "머니투데이 글로벌경제 김유경 yunew@moneytoday.co.kr \r\n"
			+ "머니투데이 글로벌경제 김성휘 sunnykim@moneytoday.co.kr \r\n"
			+ "아시아경제 글로벌경제 조민서 summer@asiae.co.kr \r\n"
			+ "파이낸셜 글로벌경제 서혜진 sjmary@fnnews.com \r\n"
			+ "연합뉴스 글로벌경제 박상현 shpark@yna.co.kr \r\n"
			+ "연합인포맥스 글로벌경제 유승기 sgyoo@yna.co.kr \r\n"
			+ "머니투데이 글로벌경제 조청희 samsara@moneytoday.co.kr \r\n"
			+ "파이낸셜 글로벌경제 김기석 kkskim@fnnews.com \r\n"
			+ "서울신문 글로벌경제 나길회 kkirina@seoul.co.kr \r\n"
			+ "연합뉴스 글로벌경제 김종현 kimjh@yna.co.kr \r\n"
			+ "뉴시스 글로벌경제 이남진 jeans@newsis.com \r\n"
			+ "연합뉴스 글로벌경제 강종구 inyon@yna.co.kr \r\n"
			+ "연합인포맥스 글로벌경제 이효지 hjlee2@yna.co.kr \r\n"
			+ "이데일리 글로벌경제 양미영 ﬂounder@moneytoday.co.kr \r\n"
			+ "뉴시스 글로벌경제 이진례 eeka232@newsis.com \r\n"
			+ "서울신문 글로벌경제 오달란 dallan@seoul.co.kr \r\n"
			+ "연합뉴스 글로벌경제 김대호 daeho@yna.co.kr \r\n"
			+ "머니투데이 글로벌경제 안정준 7up@moneytoday.co.kr \r\n"
			+ "머니투데이 금융/증시 유윤정 youyj@moneytoday.co.kr \r\n"
			+ "문화일보 금융/증시 유회경 yoology@munhwa.com \r\n"
			+ "이데일리 금융/증시 이진우 voice@edaily.co.kr \r\n"
			+ "머니투데이 금융/증시 도병욱 tongjorim@moneytoday.co.kr \r\n"
			+ "머니투데이 금융/증시 박재범 swallow@moneytoday.co.kr \r\n"
			+ "한겨례 금융/증시 김경락 sp96@hani.co.kr \r\n"
			+ "경향신문 금융/증시 정유진 sogun77@kyunghyang.com \r\n"
			+ "서울경제 금융/증시 문승관 skmoon@sed.co.kr \r\n"
			+ "뉴시스 금융/증시 김민자 rululu20@newsis.com \r\n"
			+ "이데일리 금융/증시 안재만 rommel@edaily.co.kr \r\n"
			+ "한국경제 금융/증시 김현식 realist@hankyung.com \r\n"
			+ "이데일리 금융/증시 최한나 ray@edaily.co.kr \r\n"
			+ "한국일보 금융/증시 최진주 pariscom@hk.co.kr \r\n"
			+ "머니투데이 금융/증시 이새누리 newworld@moneytoday.co.kr \r\n"
			+ "파이낸셜 금융/증시 황민정 mchan@fnnews.com \r\n"
			+ "헤럴드 금융/증시 김형곤 kimhg@heraldm.com \r\n"
			+ "아시아경제 금융/증시 김지은 jekim@asiae.co.kr \r\n"
			+ "이데일리 금융/증시 이준기 jeke1@edaily.co.kr \r\n"
			+ "한국일보 금융/증시 김용식 jawohl@hk.co.kr \r\n"
			+ "동아일보 금융/증시 정재윤 jaeyuna@donga.com \r\n"
			+ "국민일보 금융/증시 황일송 ilsong@kmib.co.kr \r\n"
			+ "뉴시스 금융/증시 류영상 ifyouare@newsis.com";
			
	
}
