package quiz;

public class A06_PrintCalendar {

	public static void main(String[] args) {
		
		System.out.println("\t2024년 4월");
		System.out.println("\t일\t월\t화\t수\t목\t금\t토");
		System.out.printf("\t%.2f\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\n", 
				3.31, 1, 2, 3, 4, 5, 6);
		System.out.printf("\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\n", 
				7, 8, 9, 10, 11, 12, 13);
		System.out.printf("\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\n", 
				14, 15, 16, 17, 18, 19, 20);
		System.out.printf("\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\n", 
				21, 22, 23, 24, 25, 26, 27);
		System.out.printf("\t%02d\t%02d\t%02d\t%.2f\t%02d\t%02d\t%02d\n", 
				28, 29, 30, 5.01, 2, 3, 4);
		
		System.out.println();
		
		System.out.println("\t2024년 4월");
		System.out.println("\t일\t월\t화\t수\t목\t금\t토");
		System.out.printf("\t\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\n", 
				 1, 2, 3, 4, 5, 6);
		System.out.printf("\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\n", 
				7, 8, 9, 10, 11, 12, 13);
		System.out.printf("\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\n", 
				14, 15, 16, 17, 18, 19, 20);
		System.out.printf("\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\n", 
				21, 22, 23, 24, 25, 26, 27);
		System.out.printf("\t%02d\t%02d\t%02d\n", 
				28, 29, 30);
		
		System.out.println();
		System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n", 
				"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Set");
		System.out.printf("%5c%02d    %02d   %02d   %02d  %02d   %02d \n",
				' ', 1, 2, 3, 4, 5, 6);
	}

}
