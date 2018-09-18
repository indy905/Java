package com.indy905.java.problems.solving;

/*
 * 프로그램의 실행 결과를 적으시오. (만일 실행할 수 없다면 그 이유를 적으시오.)
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class Poliymorphism {
	
	private void f() {
		System.out.println("base class");
	}

	public static void main(String[] args) {
		Poliymorphism po = new Derived();
		po.f();

	}
	
	class Derived extends Poliymorphism {
		public void f() {
			System.out.println("sub class");
		}
	}
}
	




/*
 * 정답 : 실행할 수 없다. 이유는 Poliymorphism 클래스에 f 함수가 public으로 노출되어 있지 않다.
 */
