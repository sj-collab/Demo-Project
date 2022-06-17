package com.demo.test.DataTypes.NewTest;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		
		String [] stringArr1 = {"Str 1", "Str 2", "Str 3"};
		
		String [] stringArr2 = new String [] {"Arr 2 Str 1", "Arr 2 Str 2", "Arr 2 Str 3"};
		
		String [] stringArr3 = new String [3];
		
		stringArr3[0] = "Arr 3 Str 1";
		stringArr3[1] = "Arr 3 Str 2";
		stringArr3[2] = "Arr 3 Str 3";
		
		for (int i =0; i<stringArr1.length;i++) {
			System.out.println(stringArr1[i]);
		}
		
		for (String test : stringArr2) {
			System.out.println(test);
		}
		
		stringArr3[0] = "Arr 4 Str 0";
		System.out.println(stringArr3[0]);
		
		System.out.println(Arrays.toString(stringArr1));

		stringArr1 = new String [4];
		stringArr1[0] = "Arr 1 Str 1";
		stringArr1[1] = "Arr 2 Str 2";
		stringArr1[2] = "Arr 3 Str 3";
		stringArr1[3] = "Arr 4 Str 4";
		
		System.out.println(Arrays.toString(stringArr1));
		
		int [] intArr = {1, 3, 2, 4};
		System.out.println(Arrays.toString(intArr));
		
		String [] strArray = {"Test1", "Test3", "Test2", "Test4"};
		System.out.println(Arrays.toString(strArray));
		
		Arrays.sort(strArray);
		
		String test = "["+strArray[0]+", "+strArray[1]+", "+strArray[2]+", "+strArray[3]+"]";
		
		System.out.println(test);
		System.out.println(Arrays.toString(strArray));
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
	}

}
