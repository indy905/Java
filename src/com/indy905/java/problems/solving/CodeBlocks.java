package com.indy905.java.problems.solving;

/*
 * 아래 프로그램의 예상되는 출력 결과는?
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class CodeBlocks {
//	private static String aField = "";
//	private String bField = "";
//
//	static {
//		aField += "A";
//	}
//
//	{
//		aField += "B";
//		bField += "B";
//	}

	public CodeBlocks() {
//		aField += "C";
//		bField += "C";
	}

//	public void append() {
//		aField += "D";
//		bField += "D";
//	}
//
//	public static void main(String[] args) {
//		System.out.println(aField);
//
//		CodeBlocks cb = new CodeBlocks();
//		cb.append();
//
//		System.out.println(aField);
//		System.out.println(cb.bField);
//	}
}

/*
 * 정답 : 
 * A
 * ABCD
 * BCD
 * 멤버 변수와 정적 변수를 초기화 시키는 과정을 이해하고 있는지 확인
 * 순서는 아래와 같음
 * 1) 멤버변수의 static
 * 2) static {}
 * 3) {}
 * 4) 생성자
 * 5) 함수
 */

