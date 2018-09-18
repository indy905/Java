package com.indy905.java.problems.solving;

/*
 * 다음 프로그램은 간단한 회원 정보를 포함하고 있는 클래스를 작성한 것이다. 실행 결과를 적으시오.
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class UserTest {

	public static void main(String[] args) {
		new UserTest().compare();
	}
	
	private void compare() {
		User a = new User("TS", "Kim");
		User b = new User("TS", "Kim");
		User c = a;

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
	}
	
	public class User {
		private String firstName;
		private String lastName;
		
		public User (String firstName, String lastName) {
			this.firstName = new String(firstName);
			this.lastName = new String(lastName);
		}
		
		public boolean equals (User otherUser) {
			return match(firstName, otherUser.firstName) || match(lastName, otherUser.lastName);
		}
		
		private boolean match(String origin, String compare) {
			return origin == compare && origin.equals(compare);
		}
	}

}


/*
 * 정답 :
 * false, true, false 첫번째 비교 연산은 서로 다른 인스턴스이므로 다른 객체로 판단하며, 두번째 비교 연산은 동일한 인스턴스를 참조한다. 세번째 비교 연산은 equals() 및 match() 연산자의 비교 연산자 (and, or)를 잘못 사용한 것이다.
 */