package quiz;

import java.util.Arrays;

public class B13_Lotto_T {
   /*
       (1) 1 ~ 45 사이의 중복 없는 랜덤 숫자 7개를 생성하여 
           로또 당첨 번호 배열을 만들어 보세요
       
           1. 숫자를 랜덤으로 뽑는다
           2. 이전에 뽑았던 숫자중에 방금뽑은숫자가 없는지 확인한다
           3. 있으면 다시뽑고 없으면 넘어간다
       
       (2) 1등 또는 2등에 당첨될때까지 랜덤 로또 번호를 계속 생성하여
           몇 번 만에 당첨되었는지 출력해보세요
           
           - 로또 구매자의 번호는 6개다
           - 보너스 번호를 제외하고 모두 맞추면 1등
           - 보너스 번호를 포함하여 모두 맞추면 2등
   */   
   public static void main(String[] args) {
      
      int[] winNums = new int[7];
      int currIndex = 0;
      
      while (currIndex < 7) {
         int num = (int)(Math.random() * 45 + 1);
         

         boolean repeated = false; 
         for (int i = 0; i < currIndex; ++i) {
            if (winNums[i] == num) {
               // 이전에 뽑은 숫자 중에 중복되는 숫자가 있음
               repeated = true;
               break;
            }
         }
         
         // 중복된 숫자가 존재한다면 currIndex가 증가하지 않기 때문에
         // 현재 인덱스에 숫자를 다시 뽑게 된다
         if (!repeated) {
            winNums[currIndex] = num;         
            ++currIndex;
         }
      }
      
      int buyCount = 0;
      
      while (true) {
         ++buyCount;
         
         int[] userNums = new int[6];
         currIndex = 0;
         while (currIndex < userNums.length) {
            int num = (int)(Math.random() * 45 + 1);            
            boolean repeated = false; 
            for (int i = 0; i < currIndex; ++i) {
               if (userNums[i] == num) {
                  repeated = true;
                  break;
               }
            }
            if (!repeated) {
               userNums[currIndex] = num;         
               ++currIndex;
            }
         }   
         
       
         // 당첨 체크
         // 일치하는 번호의 숫자가 6개면 1등 또는 2등 당첨
         // + 보너스 번호가 포함되어있으면 2등
         int winCount = 0;
         boolean hasBonus = false;
         for (int i = 0; i < userNums.length; ++i) {
            for (int j = 0; j < winNums.length; ++j) {
               if (userNums[i] == winNums[j]) {
                  ++winCount;                  
                  if (j == 6) {
                     hasBonus = true;
                  }                  
                  break;
               }
            }
         }
         
         if (winCount == 6) {
//            System.out.printf("[%2d,%2d,%2d,%2d,%2d,%2d,%2d] VS [%2d,%2d,%2d,%2d,%2d,%2d]\n",
//                  winNums[0], winNums[1], winNums[2], winNums[3], winNums[4], 
//                  winNums[5], winNums[6], userNums[0], userNums[1], userNums[2], 
//                  userNums[3], userNums[4], userNums[5]);
            // Arrays.toSring(arr) 배열의 내용을 보기 좋게 문자열로 변환하는 함수
            System.out.printf("%s Vs %s\n",
            		Arrays.toString(winNums), Arrays.toString(userNums));
            
            System.out.print(buyCount + "회 구매만에 ");
            
            if (hasBonus) {
               System.out.println("2등 ㅊㅋㅊㅋ!!");
               break;
            } else {
               System.out.println("1등 ㅊㅋㅊㅋ!!");
               break;
            }
         }
      }
   }
}









