package com.interview2;

import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void oddEven() {

		int num =11;

		if (num%2==0){
			System.out.println(num+" is even Number");
		}
		else {
			System.out.println(num+" is a odd number");
		}
	}

	public static void oddMulti() {

		List<Object> odd = new ArrayList<Object>();

		int num = 10;
		int count = 0;
		int sum =0;
		for(int i=1; i<=num; i++) {

			if(i%2!=0) {
				odd.add(i);
				sum+=i;
				count++;
			}
		}
		System.out.println(odd+" is odd numbers"+" "+count+" is total count");
		System.out.println(sum+" total sum");
	}

	//	reverseNumber
	private static void reverse() {
		int num = 123;
		int rev =0;
		while(num>0) {
			int n = num%10;
			rev=(rev*10)+n;
			num/=10;
		}
		System.out.println(rev);

	}

	private static void pali() {

		int num =12321;
		int temp=num;
		int rev = 0;
		while(num>0) {
			int n = num%10;
			rev=(rev*10)+n;
			num/=10;
		}
		if(temp==rev) {
			System.out.println("It is Palidrome");
		}else {
			System.out.println("Not a palidrome");
		}
	}

	private static void numDigi() {
		int num = 12345678;
		int count = 0;
		while(num>0) {
			count++;
			num/=10;
		}
		System.out.println(count);
	}

	private static void armstrong2() {
		int num=153;
		int temp=num;
		int arm=0;
		while(num>0) {
			int n=num%10;
			arm=arm+(n*n*n);
			num/=10;
		}
		if(temp==arm) {
			System.out.println("It is Factorial Number");
		}else {
			System.out.println("It is not Factorial");
		}
	}
	private static void fac() {
		int num =5;
		int fac=1;
		while(num>0) {
			fac=fac*num;
			num-=1;
		}
		System.out.println(fac);
	}

	private static void prime() {
		int num=14;
		int count =0;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(num+" is prime ");	
		}else {
			System.out.println(num+" not a prime");
		}
	}
	private static void primeLoop() {
		List<Object> primeList = new ArrayList<>();
		int num=20;
		for(int i=1; i<=num; i++) {
			int count=0;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				primeList.add(i);
			}
		}
		System.out.println(primeList);
		System.out.println("Above list is prime numbers");

	}
	public static void primeList2(){
		List<Object> primeList= new ArrayList<>();
		int num =20;
		for(int i=1; i<=num; i++){
			int count=0;
			for(int j=2; j<i/2; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==0){
				primeList.add(i);
			}

		}
		System.out.println(primeList+" Prime Numbers");

	}

	private static void arrayList() {
		int[] ar = new int[5];
		ar[0]=800;
		ar[1]=500;
		ar[2]=600;
		ar[3]=100;
		ar[4]=300;
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	private static void ascendingOrd() {
		
		int[] ar = new int[5];
		
				ar[0]=400;
				ar[1]=200;
				ar[2]=800;
				ar[3]=300;
				ar[4]=100;
				
				for(int i=0; i<ar.length; i++) {
					for(int j=i+1; j<ar.length; j++) {
						if(ar[i]>ar[j]) {
							int temp = ar[i];
							ar[i]=ar[j];
							ar[j]=temp;
						}
					}
				}
				for(int i=0; i<ar.length; i++) {
					System.out.println(ar[i]);
				}
	}

	public static void main(String[] args) {
		//		oddEven();
		//		oddMulti();
		//		reverse();
		//		pali();
		//		numDigi();
		//		armstrong2();
		//		fac();
		//		prime();
		//		primeLoop();
		//		primeList2();
		//		arrayList();
				ascendingOrd();

	}
}