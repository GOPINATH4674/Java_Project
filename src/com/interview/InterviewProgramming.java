package com.interview;

import java.util.Arrays;
import java.util.Iterator;

public class InterviewProgramming {

	public void evenOrOdd() {
		// Find 1 to 10 ODD or EVEN	


		int a = 10;

		for (int i = 1; i <=a; i++) {

			if (i%2==0) {
				System.out.println(i+" is even Number");
			}
			else {
				System.out.println(i+" is odd Number");
			}
		}
	}

	public void countOdd() {

		int a=13;
		int count = 0;
		for (int i = 1; i <=a; i++) {

			if (i%2!=0) {
				//				System.out.println(i+" is even Number");
				count++;
			}
			System.out.println("Even number count is "+count);
		}
	}

	public void sumOdd() {

		int a=13;
		int sum = 0;
		for (int i = 1; i <=a; i++) {

			if (i%2!=0) {
				System.out.println(i+" is Odd Number");
				sum+=i;
			}
		}
		System.out.println("Even number count is "+sum);
	}

	public void reverseNumber() {
		int num = 123;
		int rev=0;
		while (num>0) {
			int n = num%10;
			rev=(rev*10)+n;
			num=num/10;
		}
		System.out.println(rev);
	}

	public void countDigit() {
		int ex =123456;
		int count =0;
		while (ex>0) {
			ex/=10;
			count++;
		}
		System.out.println(count);
	}

	public void palindromeNumber() {
		int num = 12321;
		int rev = 0;

		while (num>0) {
			int n = num%10;
			rev=(rev*10)+n;
			num = num/10;			
		}
		if (num==rev) {
			System.out.println(rev+" It is Palidrome");
		}
		else {
			System.out.println(rev+" It is not Palidrome");
		}
	}

	public void armstrong() {

		int num = 153;
		int temp = num;
		int arm = 0;
		while(num>0) {
			int n = num%10;
			arm=arm+(n*n*n);
			num= num/10;
		}
		if(temp==arm){
			System.out.println("It is a Armstrong");
		}
		else {
			System.out.println(temp+"-"+arm+" It is not Armstrong");
		}
	}

	public void swapNum() {
		// Using 3rd variable
		int a = 10;
		int b =20;
		int temp = a;
		a=b;
		b=temp;
		System.out.println("a="+a+" "+"b="+b);

	}

	public void swapNum2() {
		// without Using 3rd variable
		int a = 10;
		int b =20;
		a=a+b;//30
		b=a-b;//-10
		a=a-b;
		System.out.println("a="+a+" "+"b="+b);
	}

	public void factorialNumber() {

		int num = 5;
		int fact = 1;

		/*for (int i = 1; i <= num; i++) {

			fact=fact*i;
		}*/

		while(num>0) {
			fact=fact*num;
			num=num-1;
		}

		System.out.println(fact+" is a fact Number");

	}

	public void primeNumber() {
		int num = 18;
		int count =0;

		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("It is a prime");
		}
		else {
			System.out.println("It is not a prime");
		}
	}

	public void primeCount() {
		int a =50;
		for(int i=1; i<=a;i++) {
			int count = 0;
			for (int j = 2; j <=i/2; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}

	}

	public void reverseString() {
		// Same like Palidrome
		String s = "madams";
		String rev ="";

		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("It is a Palidrome");
		}
		else {
			System.out.println("It is not a Palidrome");
		}
	}

	public void ascendingOrder() {

		int[] ar =  new int[5];

		ar[0] = 600;
		ar[1] = 800;
		ar[2] = 400;
		ar[3] = 100;
		ar[4] = 500;

		/*Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));*/

		for(int i=0; i<ar.length; i++ ) {
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

	public void descendingOrder() {
		int[] ar =  new int[5];
		ar[0] = 600;
		ar[1] = 800;
		ar[2] = 400;
		ar[3] = 100;
		ar[4] = 500;

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

	public void starPattern(int n) {
		
		for (int i = 0; i <n; i++) {
			for (int j = i+1; j <n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <i+1; j++) {
				System.out.print("* ");
			}
			for (int j = i; j <=i; j++) {
				System.out.println();
			}
		}

	}
	public void diamondPattern(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <i+1; j++) {
				System.out.print("* ");
			}
			

		}
		for (int i = 0+1; i < n; i++) {

			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			for (int j = i; j <=i; j++) {
				System.out.println();	
			}
		}

	}

	public void reversePattern(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			for (int j = i; j <=i; j++) {
				System.out.println();	
			}
		}

	}


	public static void main(String[] args) {
		InterviewProgramming ip = new InterviewProgramming();
		//		ip.evenOrOdd();
		//		ip.countOdd();
		//		ip.sumOdd();
		//		ip.reverseNumber();
		//		ip.countDigit();
		//		ip.palindromeNumber();
		//		ip.armstrong();
		//		ip.swapNum();
		//		ip.swapNum2();
		//		ip.factorialNumber();
		//		ip.primeNumber();
		//		ip.primeCount();
		//		ip.reverseString();
		//		ip.ascendingOrder();
		//				ip.descendingOrder();
		ip.starPattern(9);
		//				ip.reversePattern(9);
	}
}
