package com.demo.test.DataTypes.FirstTest;

public class BaseClass {
	public static String stringVar = "local variable";
	
	 protected void runMethod() {
		System.out.println("This is a void method");
	}
	
	 private String runMethodWithReturnType() {
		System.out.println("This is a returnable string method");
		String returnString = "Return String";
		return returnString;
	}
	
	
	 public static void runStaticMethod() {
		 String stringVarMethod = "local variable";
		System.out.println(stringVarMethod);
	}
	
	
	public static void main(String[] args) {
		
		runStaticMethod();
		BaseClass objectName = new BaseClass();
		objectName.runMethod();
		objectName.runMethodWithReturnType();
	}
}
