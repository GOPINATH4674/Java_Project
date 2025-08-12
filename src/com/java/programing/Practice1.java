package com.java.programing;

import java.util.Arrays;
import java.util.Iterator;

public class Practice1 {

	private static void oddEven() {

		int num = 11;

		if(num%2==0) {
			System.out.println(num+" It is Even Num");
		}
		else {
			System.out.println(num+" It is odd Number");
		}

	}

	private static void multiOddEven() {
		int num =10;
		int count=0;
		int sum=0;
		for (int i = 1; i<=num; i++) {
			if(i%2==0){
				System.out.println(i+" It is Even Num");
				sum+=i;
				count++;
			}
			else {
				//				System.out.println(i+" It is odd Number");
			}
		}
		System.out.println("even number count"+ count+ " sum is"+ sum);
	}

	private static void reverseNum() {
		int num=12345;
		int temp=num;
		int reverse=0;

		while(num>0) {
			int n = num%10;
			reverse=(reverse*10)+n;
			num/=10;
		}
		System.out.println(reverse);
	}

	private static void countDigit() {
		int num=1234512;
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		System.out.println(count);
	}

	private static void arms() {
		int num =153;
		int temp=num;
		int arms=0;

		while(num>0) {
			int n = num%10;
			arms=(n*n*n)+arms;
			num/=10;
		}
		if (temp==arms) {
			System.out.println("It is Armstrong Number");
		}
		else {
			System.out.println("It is Not armstron Number");
		}

	}
	private static void factorialNum() {

		int num =5;
		int fact=1;
		while(num>0) {
			fact=fact*num;
			num-=1;
		}
		System.out.println(fact);
	}

	private static void prime() {
		int num=13;
		int count = 0;
		for (int i = 2; i <=num/2; i++) {

			if (num%i==0) {
				count++;
			}	
		}
		if (count==0) {
			System.out.println(num+" It is prime Number");

		}else {
			System.out.println(num+" It is not a prime Number");
		}

	}

	private static void multiPrime() {

		int num=50;

		for (int i = 1; i <=num; i++) {
			int count =0;
			for (int j = 2; j <=i/2; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==0) {
				System.out.println(i+" It is Prime");
			}
		}

	}

	private static void assending() {
		int ar[]= {11,8,10,5};
		for (int i = 0; i < ar.length; i++) {
			for(int j=i+1;j<ar.length; j++) {
				if (ar[i]>ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				System.out.println(Arrays.toString(ar));
			}
		}
	}

	private static void wordCaps() {

		String name = "welcome to java";
		String eLetter="";
		String[] nameSplit = name.split(" ");

		for (int i = 0; i < nameSplit.length; i++) {
			char ch = nameSplit[i].charAt(0);
			char upCh=Character.toUpperCase(ch);
			String remaing = nameSplit[i].substring(1);
			eLetter=eLetter+upCh+remaing+" ";
		}

		/*for (String word : nameSplit) {
					char letter = word.charAt(0);
					char letterUp = Character.toUpperCase(letter);
					String remaing = word.substring(1);
					eLetter=eLetter+letterUp+remaing+" ";
				}*/
		System.out.println(eLetter);
	}

	public static void patern(){
		int num =5;

		for(int i=0; i<num; i++) {
			for(int k=i; k<num;k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void revEvr() {

		String name = "Welcome to clarium";

		String[] sName=name.split(" ");
		String temp="";
		for (int i = 0; i < sName.length; i++) {
			String name2=sName[i];
			for (int j = name2.length()-1; j >=0 ; j--) {
				temp=temp+name2.charAt(j);
			}
			temp+=" ";
		}
		System.out.println(temp);
		System.out.println(temp);


	}
	private static void revStr() {

		String name = "Welcome";
		String rev="";
		for (int i = name.length()-1; i >=0; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		//		oddEven();
		//		multiOddEven();
		//		reverseNum();
		//		countDigit();
		//		arms();
		//		factorialNum();
		//		prime();
		//		multiPrime();
		//		assending();
		//		caps();
		//		wordCaps();
		//		revStr();
		patern();
		//		revEvr();                   


	}



}
