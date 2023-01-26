package studio1;

import java.util.Scanner;

import support.cse131.ArgsProcessor;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {
//Scanner in = new Scanner(System.in);
//		
//		System.out.println("How are you feeling today?");
		//String mood = in.nextLine();
//		
//		System.out.println("Hello and welcome to CSE 131!");
//		System.out.println("You seem to be feeling " + mood);
//	}
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for arg 0: ");
		String name = in.nextLine();
		//
		// Below this line, enter code so that this program's output says
		//      Hi, Pat.  How are you?
		// if the value of name is "Pat"
		//
		System.out.println("Hello" + name + "!");
	}

}
