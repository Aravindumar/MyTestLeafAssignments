package org.test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        n.close();
        
        int divider = 2; boolean divisible = false;
        for (int i=divider;i<num;i++) {
        	
        if (num%i!=0) {
        	divisible = true;
        	break;
        }
        else {
        	divisible = false;
        	break;
        }
	}
        if(divisible==true) {
        	System.out.println("Entered number "+num+" is a prime number");
        }
        else {
        	System.out.println("Entered number "+num+" is a composite number");
        }

 }
}