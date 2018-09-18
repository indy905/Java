package com.indy905.java.problems.solving;

/*
 * 출처 : http://sunnykwak.tistory.com/m/102
 * 프로그램의 실행결과로 올바른 것은? 
 * 1 컴파일 오류가 발생한다.
 * 2 실행 시 오류가 발생한다.
 * 3 0AB
 * 4 065B
 */

public class AutoBoxing {

	public static void main(String[] args) {
		int idx = 0;
		char[] charArray = new char[10];
		
		charArray[idx++] = '0';
		charArray[idx++] = 65;
		charArray[idx++] = 'A' + 1;
		
		System.out.println( charArray );

	}

}

/*
 * 정답 : 3
 * 'A' + 1 에서 'A'가 자동으로 65로 변경되어 66 값의 char가 저장되기 때문이다.
 */


