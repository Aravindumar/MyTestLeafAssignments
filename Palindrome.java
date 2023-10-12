package org.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Enter the word : ");
		Scanner s = new Scanner(System.in);
		String enteredword = s.nextLine();
		s.close();
		int lenght = enteredword.length();
		char charar[]= enteredword.toCharArray();
		System.out.println("Reversed Word : ");
		String reverseword = "" ;
		for (int i=lenght-1;i>=0;i--) {			
			//System.out.print(charar[i]);  -> Only to print in reverse order
			reverseword = reverseword +charar[i]; // To store the reverse value and verify  
		}
		System.out.println(reverseword);
		
		if (enteredword.equalsIgnoreCase(reverseword)) {
			System.out.println("Entered String "+enteredword+" is palsindrome");
		}
		else {
			System.out.println("Entered String "+enteredword+" is not a palsindrome");
		}
	}

}
