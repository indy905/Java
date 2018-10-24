package com.indy905.java.problems.solving;

import jdk.internal.dynalink.beans.StaticClass;

/*
 * 아래 예제 프로그램은 컴파일 시 오류가 발생한다. 코드 중에서 문법 오류가 발생하는 라인을 고르시오.
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class AboutPerson {
	public static void main(String[] args) {
		//1
//		static int argsCount = args.length;
//		//2
//		Person aPerson = new Person();
//		//3
//		aPerson.setAge(10);
//		//4
//		aPerson.setName("Alice");
//		//5
//		Person bPerson = new Person();
//		//6
//		bPerson.age = 10;
//		//7
//		bPerson.name = "John";
//
//		print(aPerson);
//		print(bPerson);
	}
	
	
	private static void print(Person p) {
		System.out.println( "name : " + p.name + ", age : " + p.age );
	}

	class Person {
		private String name;
		private int age;
		
		public Person() {
		}

		public Person(int age) {
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		
		public String setName(String name) {
			return this.name;
		}
		 
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
	}
}

/*
 * 정답 : 1
 * 정적 지역변수는 선언할 수 없음
 */
