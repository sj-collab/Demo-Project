package com.demo.test.DataTypes.FirstTest;

import java.math.BigDecimal;

public class DataTypeTestClass {


	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive data types int, double, long, float and boolean
		
		int test = 128968298;
		test =15;
		
		System.out.print(test);
		
		double test1 = 12.884341654;
		
		System.out.print("\n"+test1+"\n");
		
		long test2 = 1289682989324682L;
		
		System.out.print("\n"+test2+"\n");
		
		BigDecimal bigDeimal = new BigDecimal(12.884341654);
		
		System.out.print(bigDeimal);
		
		float testFloat = 12.5f;		
		
		System.out.print(testFloat);
		
		
		boolean flag = true;
		flag = false;
		
		//String is non-primitive
		
		System.out.println(flag);
		
		String testString = "test string";
		
		System.out.print(testString);
		
		System.out.print("testing string");
		
		String testString1 = new String ("test");
		
		System.out.print(testString1);
		
		System.out.print(new String ("testing"));
		
		
		
	}
}
