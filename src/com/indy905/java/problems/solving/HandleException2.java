package com.indy905.java.problems.solving;

/*
 * 예외 처리 예제이다. 예상되는 실행 결과는?
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class HandleException2 {
	public static void main(String[] args) {

		HandleException.Inner instance = new HandleException().new Inner();
		instance.exec();
	}
}
//	public static void main(String[] args) {
//		new HandleException2().test();
//	}
//
//	private void test() {
//		try {
//			Person person = new Person("John", -10);
//		} catch (IOException e) {
//			System.out.println("Exception catched");
//		} finally {
//			System.out.println("execute finally block");
//		}
//	}
//
//	public class Person {
//		private String name;
//		private int age;
//
//		public Person(String name, int age) throws IOException {
//			if (age < 0)
//				throw new IllegalParamException("Invalid input age : " + age);
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public int getAge() {
//			return age;
//		}
//	}
//
//	public class IllegalParamException extends RuntimeException {
//		public IllegalParamException(String msg) {
//			super(msg);
//		}
//	}
//}

/*
 * 정답 : 
 * execute finally block
 * Exception in thread "main" IllegalParamException: Invalid input age : -10
 */

