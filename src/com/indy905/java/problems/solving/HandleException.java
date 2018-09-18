package com.indy905.java.problems.solving;

/*
 * 수치 데이터(numeric data)를 문자열로 입력 받은 후, 정수형(integer type)으로 반환하는 예제이다. 잘못된 데이터 입력을 방지하기 위해 예외 처리 기능을 포함시켰다. 올바른 실행 결과는?
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class HandleException {

	public static void main(String[] args) {
		String number = null;
		System.out.println( toInt(number) );
		number = "9,900";
		System.out.println( toInt(number) );
		number = "10";
		System.out.println( toInt(number) );
	}
	
	public static int toInt(String strValue) {
		if (strValue == null || strValue.length() <= 0) {
			throw new IllegalArgumentException();
		}
		int intValue = 0;
		try {
			intValue = Integer.parseInt(strValue);
		} catch (Exception ex) {
			intValue = 0;
		}
		return intValue;
	}

}

/*
 * 정답 : 
 * 최초 number 변수가 초기화 되어 있지 않기 때문에 IllegalArgumentException이 발생하고 프로그램이 중단된다.
 */
