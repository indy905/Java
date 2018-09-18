package com.indy905.java.problems.solving;

/*
 * 출처 : http://sunnykwak.tistory.com/m/102
 * 메소드 오버라이딩 예제이다. 잘못된 설명은?
 * 1 SuperClass의 doh(char c) 와 doh(float f) 메소드는 오버로딩(overloading)된 메소드이다.
 * 2 SubClass의 doh(OtherClass o) 메소드는 오버라이딩(overriding)된 메소드가 아니다.
 * 3 test() 메소드 내에서 a.doh(1) 라인에서 컴파일 오류가 발생한다.
 * 4 SuperClass의 doh(char c), doh(float f) 메소드를 SubClass에서 사용할 수 있다.
 */

public class OverrideTest {

	public static void main(String[] args) {
		new OverrideTest().test();
	}
	
	private void test() {
		SuperClass a = new SubClass();
		a.doh(1);
	}

	class SuperClass {
	
		public char doh(char c) {
			System.out.println("doh(char)");
			return 'c';
		}
		
		public float doh(float f) {
			System.out.println("doh(float)");
			return 1.0f;
		}
	}
	
	class OtherClass { }
	
	class SubClass extends SuperClass {
		
		public void doh(OtherClass o) {
			System.out.println("doh(OtherClass)");
		}
	}

}

/*
 * 정답 : 3
 * int가 float로 형변환되어 호출된다.
 */
