package com.indy905.java.problems.solving;

/*
 * 다음 프로그램의 실행 결과는?
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class OverloadTest {

	public static void main(String[] args) {
		new OverloadTest().test();
	}
	private void test() {
		Fruits fruits = new Apple();
		System.out.println(fruits.getName());
	}

	public class Fruits {
		private String name;

		public Fruits() {
			this.name = "unknown";
		}

		final public String getName() {
			return name;
		}
	}

	public class Apple extends Fruits {
		public String getName() {
			return "Apple";
		}
	}

}

/*
 * 정답 :
 * getName이 final 메소드 이기 때문에 컴파일 에러가 난다.
 */
