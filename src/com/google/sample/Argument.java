package com.google.sample;

public class Argument {

	public static void main(String[] args) {

		String name = args[0];
		
		int num1 = Integer.parseInt(args[1]);
		
		int num2 = Integer.parseInt(args[2]);
		
		int num3 = num1 + num2;
		
		System.out.println("sum is "+num3);
		
		System.out.println(name);
		
	}

}
