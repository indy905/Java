package com.indy905.java.problems.solving;

import java.util.Arrays;

public class GenericTest {
	// # Exam 1
	static <T extends Comparable<T>> long countGreaterThan(T[] arr, T elem) {
		return Arrays.stream(arr).filter(s -> s.compareTo(elem) > 0).count();
	}
	public static void main(String[] args) {
		String[] arr = new String[] {"a", "b", "c", "d", "e", "f"};
		System.out.println(countGreaterThan(arr, "c"));
	}
}
