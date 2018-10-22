package com.indy905.java.problems.solving;

import java.util.Arrays;
import java.util.List;

public class WildcardGenericTest {
	
	static void printList(List<Object> list) {
		list.forEach(s -> System.out.println(s));
	}
	static void printList2(List<?> list) {
		list.forEach(s -> System.out.println(s));
	}
	
	public static void main(String[] args) {
		List<? extends Object> list; // ? : wildcards
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
		printList2(list2);
	}
}
