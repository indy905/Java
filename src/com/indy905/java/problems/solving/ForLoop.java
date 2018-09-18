package com.indy905.java.problems.solving;

/* 
 * 반복 테스트(loop test) 클래스의 실행 결과를 적으시오.
 * 무한 루프가 발생한다. 두번째 for 반복문 안 쪽에 조건이 j가 아닌 i만 증가시킨다.
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class ForLoop {

	public static void main(String[] args) {
		
		int total = 0;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; i++) {
				total++;
			}
		}
		
		System.out.println(total);
	}

}
