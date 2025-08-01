package com.interview2;

public class PracticeCode {

	public static void oddEvenNumber() {

		int a = 10;

		if (a%2==0) {
			System.out.println(a+" It is a even Number");
		}
		else {
			System.out.println(a+" It is a odd Number");
		}
	}

	//Find even Number 1 to 10
	public static void findEven() {
		int a = 10;
		int sum=0;
		for(int i=1; i<=a; i++) {
			if(i%2!=0) {
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
	}
	
	//reverse the Number123
	public static void reverseNum() {
		int num = 123;
		int rev = 0;
		while(num>0) {
			int n = num%10;
			rev =(rev*10)+n;
			num=num/10;
		}
		System.out.println(rev);
	}
	//palidrome Number
	public static void palidrome() {
		int pal = 12321;
		int temp = pal;
		int rev = 0;
		while(pal>0) {
			int n = pal%10;
			rev = (rev*10)+n;
			pal=pal/10;
		}
		if(temp==rev) {
			System.out.println("It is palidrome");
		}
		else {
			System.out.println("It is not palidrome");
		}
	}
	
	public static void digitNum() {
			int num = 123;
			int count = 0;
			while(num>0) {
				num=num/10;
				count++;
			}
			System.out.println(count);
	}
	
	private static void armstrong() {
		int num = 153;
		int temp=num;
		int sum = 0;
		while (num>0) {
			int n = num%10;
			sum=sum+(n*n*n);
			num/=10;
		}
		System.out.println(sum);
		if (sum==temp) {
			System.out.println("It is");
		}
		else {
			System.out.println("It is not");
		}
	}
	//FACTORIAL number
	private static void factorial() {
		int a = 5;
		int b=1;
		for (int i = a; i > 0; i--) {
			b=b*i;
		}
		System.out.println(b);
	}
	
	//prime number
	private static void primeNum() {
		int num = 13;
		int count = 0;
		for(int i=2; i<num/2; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(num+" It is a prime number");
		}
		else {
			System.out.println(num+" It is not a prime number");
		}
	}
	
	private static void primeNumList() {
		int num =50;
		int count =0;
		for(int i=1;i<=num;i++) {
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i+" It is a prime number");
			}
			count=0;
		}
	}
	
	//reverse String
	private static void reverseString() {
		
		String name= "Hello";
		String rev ="";
		for(int i=name.length()-1;i>=0; i--) {
			char s = name.charAt(i);
			rev=rev+s;
		}
		System.out.println(rev);

	}
	
	public static void main(String[] args) {
//		findEven();
//		reverseNum();
//		palidrome();
//		digitNum();
//		armstrong();
//		factorial();
//		primeNum();
//		primeNumList();
		reverseString();
	}

}
