package com.interview;

import java.util.Iterator;

public class Practice3 {

	private void evenOrOdd() {

		int n = 18;

		if (n%2==0) {
			System.out.println("It is Even");		
		}
		else {
			System.out.println("It is Odd");
		}

	}
	private void countOdd() {
		int n =25;
		int sum = 0;
		for (int i = 1; i <=n; i++) {
			if (i%2!=0) {
				System.out.println(i+" It is odd");
				sum=sum+i;
			}		
		}
		System.out.println(sum);
	}

	private void reverseNumber() {
		int num = 12321;
		int temp = num;
		int rNum=0;

		while(num>0) {
			int n = num%10;
			rNum=(rNum*10)+n;
			num/=10;
		}
		System.out.println(rNum);
		if(temp==rNum) {
			System.out.println("It is a Palidrome");
		}
		else {
			System.out.println("It is not a Palidrome");
		}
	}

	private void countDigit() {
		int num = 12345;
		int count = 0;
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println(count);
	}

	private void armStrong() {
		int num = 154;
		int temp = num;
		int arm = 0;
		while(num>0) {
			int n = num%10;
			arm = arm+(n*n*n);
			num/=10;
		}
		if (temp==arm) {
			System.out.println("It is armstrong");
		}
		else {
			System.out.println("It is not a armstrong");
		}

	}

	private void swapNumber() {
		int a = 10;
		int b = 20;
		System.out.println("a-"+a+" b-"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a-"+a+" b-"+b);

	}

	private void factorialNumber() {
	int num = 5;
	int temp = 1;
	
	for (int i = 1; i <=num; i++) {
		temp=temp*i;
	}
	System.out.println(temp);

	}
	
	private void prime() {
		int num=50;
		for (int i = 1; i <=num; i++) {
			int count=0;
			for (int j = 2; j <=i/2; j++) {
				if (i%j==0) {
					count++;
				}
			}	
			if (count==0) {
				System.out.println(i+" It is Prime Number");
			}
		}
		

	}

	private void reverseString() {
	String name = "madams";
	String rev = "";
	for (int i = name.length()-1; i>=0; i--) {
		rev = rev+name.charAt(i);
	}
System.out.println(rev);
	}
	
	public static void main(String[] arr) {
		Practice3 pr=new Practice3();
		pr.reverseString();
		
	}

}
