package org.interviewprac3;

import java.util.Scanner;

public class S3prog3Fibonacci {
	
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();int temp1 = 1;int temp2 =1;
		s.close();
		int f =0;
		System.out.println(temp1);
		System.out.println(temp2);
		while (f<=num) {
			f = temp1 + temp2 ;
			temp1 = temp2;
			temp2 = f ;		
			if(f>num) {
				break;
			}
			else {
			System.out.println(f);
		
			}
		}
	}
}
