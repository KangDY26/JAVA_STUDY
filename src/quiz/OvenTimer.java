package quiz;

import java.util.Scanner;

public class OvenTimer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cookingtime = sc.nextInt();
		
		hour += cookingtime / 60;
		min += cookingtime % 60;
        
        if(min >= 60){
        	hour += 1;
        	min -= 60;
        }
        if(hour >= 24){
        	hour -= 24;
        }
        
        System.out.println(hour + "시" + min + "분");
	}

}
