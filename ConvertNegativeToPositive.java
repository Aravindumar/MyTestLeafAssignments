package org.test;

import java.util.Scanner;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        n.close();
        if(num<0) {
        	num = num * -1;
        	System.out.println("Converted number : "+num);
        }
        else {
        	System.out.println("Entered number "+num+" is already positive");
        }
	}

}
