package studio1;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What year?");
		year = scan.nextInt();
		boolean isleapyear = (((year % 4 ==0) && (year%100 != 0)) || (year % 4 ==0) && (year%400==0));
		System.out.println(isleapyear);

	}

}
