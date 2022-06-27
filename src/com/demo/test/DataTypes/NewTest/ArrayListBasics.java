package com.demo.test.DataTypes.NewTest;

import java.util.ArrayList;

public class ArrayListBasics {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Test 1");
		arrayList.add("Test 2");
		arrayList.add("Test 3");
		arrayList.add("Test 4");
		arrayList.add("Test 5");
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.get(3));
		System.out.println(arrayList.get(4));
		
		arrayList.add("Test 6");
		
		System.out.println(arrayList.get(5));
		
		System.out.println(arrayList.size());
		System.out.println(arrayList.contains("Test"));
		
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("Test 1");
		arrayList2.add("Test 2");
		arrayList2.add("Test 9");
		arrayList2.add("Test 10");
		arrayList2.add("Test 11");
		
		arrayList.addAll(arrayList2);
		System.out.println(arrayList.toString());
		
		ArrayList<String> arrayList3 = (ArrayList<String>) arrayList.clone();
		
		System.out.println(arrayList3.toString());
		
		System.out.println(arrayList3.containsAll(arrayList2));
		
		arrayList3.set(2, "Test 12");
		
		System.out.println(arrayList3.toString());
		
		ArrayList<String> arrayList4 = null;
		System.out.println(arrayList4.get(0));
		
		
	}

}
