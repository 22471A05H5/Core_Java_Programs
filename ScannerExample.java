package com.version1;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter byte value");
		byte a=obj.nextByte();
		
		System.out.println("enter short value");
		short b=obj.nextShort();
		
		System.out.println("enter int value");
		int c=obj.nextInt();
		
		System.out.println("enter long value");
		long d=obj.nextLong();
		
		System.out.println("enter float value");
		float e=obj.nextFloat();
		
		System.out.println("enter double value");
		double f=obj.nextDouble();
		
		System.out.println("enter boolean value");
		boolean g=obj.nextBoolean();
		
		System.out.println("enter String value");
		String s=obj.next();
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(s);
		

	}

}
