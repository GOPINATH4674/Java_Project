package com.java.programing;

import java.util.ArrayList;
import java.util.List;

public class StringMethod {
	
	public static void javaPract() {
		String s = "Welcome to Clarium";
		String[] split = s.split(" ");
		s.charAt(0);
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.equals("Welcome to clarium"));
		System.out.println(s.equalsIgnoreCase("Welcome to clarium"));
		System.out.println(s.contains("Wel"));
		System.out.println(s.substring(3));
		System.out.println(s.trim());
		System.out.println(s.indexOf("m"));
		System.out.println(s.lastIndexOf("m"));
		System.out.println(s.replace("e","E"));
		
		/*for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}*/
		
//		System.out.println(split);
	}
	public void patternStar() {
		int num=6;
		
		for(int i=1; i<num; i++) {
			for(int j=num; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=1; k>=i;k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
	
	private static void listPrac() {
		
		List<String> arrList = new ArrayList<String>();
		
		arrList.add("snake");
		arrList.add("vj");
		arrList.add("cat");
		arrList.add("dog");
		arrList.add("frog");
		
		System.out.println(arrList);
		System.out.println(arrList.set(2, "bull"));
		System.out.println(arrList);
		arrList.add(0, "Test");
		System.out.println(arrList);
	}
	
	public static void starPattern() {
	        System.out.print("Enter the height of the number pyramid: ");
	        int height = 5;
	        /*for (int i = 1; i <= height; i++) {
	            for (int j = 1; j <= height - i; j++) {
	                System.out.print("  ");
	            }
	            for (int k = 1; k <= ; k++) {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	        }*/
	        
	        for(int i = 5; i>0; i--) {
	        	for(int j=1; j<=i; j++) {
	        		System.out.print(" ");
	        	}
	        	for(int k=i; k<=5;k++) {
	        		System.out.print(k+" ");
	        		
	        	}
	        	System.out.println("");
	        }
	    }
		
	public static void main(String[] args) {
//		javaPract();
//		listPrac();
		starPattern();
	}
}
