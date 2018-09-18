package com.indy905.java.problems.solving;

/*
 * 프로그램의 출력 결과는?
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class SetValues {

	public static void main(String[] args) {
		String stringObj = "Hello";
		int intValue = 0;
		Float floatObj = new Float(1.0);

		setValues(stringObj, intValue, floatObj);

		System.out.println( stringObj + ", " + intValue + ", " + floatObj );
	}
	
	private static void setValues(String strValue, int intValue, Float floatObj) {
		strValue.replace("H", "h");
		strValue += " World";
		intValue = 99;
		floatObj.valueOf((float) 2.0);
	}
}

/*
 * 정답 : 
 * Hello, 0, 1.0
 * 
 * Call by value 개념을 알아보기 위한 문제로 파라미터로 넘어온 값들을 조작하여도 원래 값은 변하지 않는다.
 */
