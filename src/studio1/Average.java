package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What two integers?");
		n1 = scan.nextInt();
		 n2 = scan.nextInt();
		double average = ((n1 + n2)/2.0); 
		
		System.out.println("The average is " + average);
	}

}
