package com.indy905.java.problems.solving;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * 프로그래밍 도중 자주 사용되는 File 입출력(Input / Output) 예제이다. 텍스트 파일을 읽어 들여 내용을 화면에 출력하고 있다. 아래 코드 중 예외 처리 부분의 리소스 유출(resource leak) 가능성을 확인하고 올바른 코드를 적으시오.
 * 출처 : http://sunnykwak.tistory.com/m/102
 */

public class PrintFile {

	public static void main(String[] args) {
		try {
			new PrintFile().print("/tmp/log");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void print(String filePath) throws IOException {
		File inputFile = new File(filePath);
		InputStream inputStream = new FileInputStream(inputFile);
		
		try {
			while (inputStream.available() > 0) {
				System.out.println((char)inputStream.read());
			}
		} catch (IOException e) {
			inputStream.close();
		}
	}

}

/*
 * 정답 : 
 * 파일이나 데이터베이스 연경 등의 외부 자원을 자동으로 반환하는 기능이 없기 때문에 print 메소드의 catch 절 안에 있는 inputStream.close() 호출을 finally 절 안으로 이동시킨다.
 */
