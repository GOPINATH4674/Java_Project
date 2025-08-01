package com.interview;

import java.util.Arrays;

public class Practice {

	public void even() {

		int num = 12;
		int sum = 0;

		for(int i=1; i<=num; i++) {

			if(i%2!=0) {
				sum=sum+i;
				System.out.println(i+"-is odd Number");
				/*else
			System.out.println(i+" It is odd Number");*/
			}
		}
		System.out.println(sum+" is a odd numbeer count");
	}

	public void reverseNumber() {
		int num =123;
		int rev = 0;

		while(num>0){
			int n = num%10;
			rev=(rev*10)+n;
			num/=10;
		}
		System.out.println(rev);
	}

	public void countDigit() {
		int num = 12345;
		int count =0;
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println(count);
	}

	public void palindrome() {
		int num = 12321;
		int cpy = num;
		int temp = 0;
		while(num>0) {
			int n = num%10;
			temp = (temp*10)+n;
			num/=10;
		}
		if(cpy==temp) {
			System.out.println(temp+"It is a Palidrome");
		}
		else {
			System.out.println(temp+"It is not Palidrome");
		}
	}

	public void armstrong() {

		int num = 153;
		int arm = num;
		int temp = 0;
		while(num>0) {
			int n = num%10;
			temp= temp+(n*n*n);
			num/=10;
		}
		if(arm==temp) {
			System.out.println("It is Armstrong number");
		}
		else {
			System.out.println("it is not");
		}

	}

	public void swwapNum() {

		int a = 50;
		int b = 170;
		int temp = a;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"--"+b);
	}

	public void primeNumber() {

		int num =50;

		for (int i = 1; i <=50; i++) {

			int count =0;
			int hv=i/2;
			for(int j=2; j<=hv; j++) {

				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i+" Prime");
			}
			//		else {
			//			System.out.println("Not Prime");
			//		}

		}
	}

	public void ascendingOrder() {
		int[] ar = new int[5];
		ar[0]=300;
		ar[1]=700;
		ar[2]=200;
		ar[3]=900;
		ar[4]=400;
		
	/*	for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}*/
		
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}
	
	public static void main(String[] args) {
		Practice pr = new Practice();
		pr.ascendingOrder();
	}
}
