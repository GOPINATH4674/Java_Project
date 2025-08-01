package com.interview;

import java.util.Arrays;
import java.util.Iterator;

public class Practice2 {

	public void countEvenOrOdd() {

		int num =20;
		int count =0;
		for (int i = 1; i <=num; i++) {
			if(i%2==0) {
				count++;
				System.out.println(i+"-is Even Number");
			}
			else {
				//				System.out.println("It is Odd Number");
			}
		}
		System.out.println(count+"- total count of even number");
	}

	public void reverseNumber() {

		int num=12321;
		int palidrome = num;
		int temp=0;

		while(num>0) {
			int n = num%10;
			temp=(temp*10)+n;
			num/=10;
		}

		if(palidrome==temp) {

			System.out.println("It is a Palidrome");
		}
		else {
			System.out.println("It is Not a Palidrome");

		}
	}

	public void countDigit() {

		int num = 123456;
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		System.out.println(count);
	}

	public void armstrong() {

		int num = 153;
		int arm = num;
		int temp = 0;
		while(num>0) {
			int n = num%10;
			temp=temp+(n*n*n);
			num/=10;
		}

		if(arm==temp) {

			System.out.println(temp+"- It is Armstrong Number");
		}
		else {
			System.out.println(temp+"-it is not a Armstrong number");
		}
	}

	public void swapNumber() {
		int a = 10;
		int b = 20;
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println(a+" "+b);
	}

	public void factorial(){

		int num =6;
		int temp=1;
		for (int i = 1; i <=num; i++) {
			temp=temp*i;
		}
		System.out.println(temp);
	}

	public void primeNumber() {
		int num = 14;
		int count = 0;

		for (int i = 2; i <=num/2; i++) {
			if (num%i==0) {
				count++;
			}
		}
		if (count==0) {
			System.out.println(num+"-It is Prime number");
		}
		else {

			System.out.println(num+"-It is not a Prime number");
		}
	}

	public void primeCount() {
		int num = 50;
		for (int i = 1; i <=num; i++) {
			int count=0;
			for (int j = 2; j <=i/2; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==0) {
				System.out.println(i+"It is Prime Number");
			}
		}
	}

	public void ascendingOrder() {
	
		int[] ar = new int[5];
		ar[0]=600;
		ar[1]=300;
		ar[2]=700;
		ar[3]=800;
		ar[4]=400;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if (ar[i]<ar[j]) {
					int temp= ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	public void reverseString() {
		
		String name = "chennai";
		String rev ="";
		
		for (int i = name.length()-1; i >=0; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
	
	public void pattern() {
		int n =9;
		
		//f
		for (int i = 0; i <n; i++) {
			
			for (int j = i+1; j <n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) {
				
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
 	public static void main(String[] arg) {
		Practice2 pr2 = new Practice2();

		pr2.pattern();
	}

}