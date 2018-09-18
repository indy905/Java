package com.indy905.java.problems.solving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 프로그램은 자바의 컬렉션 API 예제이다. 올바른 출력 결과는?
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class Collection {
	List aList = new ArrayList();
	Set aSet = new HashSet(); 

	public static void main(String[] args) {
		Collection collection = new Collection();
		collection.test();
		collection.print();
	}
	
	private void test() {
		int value = 1;
		addValue(value);
		addValue(value);
		
		value++;
		addValue(value);

		value++;
		addValue(value);
	}
	
	private void addValue(int value) {
		aList.add(value);
		aSet.add(value);
	}
	
	private void print() {
		for(Object obj : aList) {
			System.out.print(obj + " ");
		}
		System.out.println();
		for(Object obj : aSet) {
			System.out.print(obj + " ");
		}
	}
}

/*
 * 정답 :
 * (aList) 1 1 2 3
 * (aSet) 1 2 3
 * List는 중복 허용, Set는 중복 비허용
 */

