package com.indy905.java.problems.solving;

/*
 * 프로그램 출력 결과는?
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class OperatorTest {

	public static void main(String[] args) {
		int a = 10;
		boolean b = false;
		if ((b == true) || (a++ == 10)) {
			System.out.println("Equal " + a);
		} else {
			System.out.println("Not equal! " + a);
		}
	}

}

/*
 * 정답 : Equal 11
 */
