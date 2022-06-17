package com.demo.test.DataTypes.FirstTest;

public class TestClass {
	
	
	public static  void main(String[] args) {
		
		for(int i =0; i<=10 ;i++) {
			System.out.print(i);
		}
		
		
		int j =0; 
		while (j<=10) {
			System.out.print(j);
			j++;
		}
		
		String day = "Monday";
		
		switch(day) {
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		default:
			System.out.println("Today is another day");
			break;
		}
		
		if(day.equals("Wednesday")) {
			System.out.println("Today is Wednesday");
		}
		else if (day.equals("Monday")) {
			System.out.println("Today is Monday");	
		}
		else {
			System.out.println("Today is another day");
		}
		
		String stringValue = day.equals("Monday")?
				(day.equals("Tuesday")?"Today is Tuesday":"Today is Monday")
				:"Today is another day";
		
		System.out.println(stringValue);
		
	}

}
