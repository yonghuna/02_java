package api.string.test;

import java.util.StringTokenizer;

/**
 * StringTokenizer클래스를 테스트
 * StringTokenizer 는 java.util 패키지에 있으므로 
 * java.lang 에 있는 Object, String, StringBuffer, StringBuilder
 * 와 같이 기본을 사용할 수 없고 
 * 반드시 명시적으로 import 구문이 들어가야 사용 가능  
 * @author Administrator
 *
 */
public class TokenizerTest {

	public static void main(String[] args) {
		// 1. 선언 
		StringTokenizer token;
		
		// 2. 초기화 
		token = new StringTokenizer("안녕하세요, 자바! 재미있게 배워볼까요?");
		
		// 3.StringTokenizer 메소드 테스트 
		for(; token.hasMoreElements();) {
			System.out.println(token.nextToken());
		}
		
		
		/* 위의 조건식만 사용한 for 반복과 같은 구문 
		 * while (token.hasMoreElements()) { System.out.println(token.nextToken()); }
		 */
		
		token = new StringTokenizer("안녕하세요, 자바! 재미있게 배워볼까요?","!");
		for(; token.hasMoreElements();) {
			System.out.println(token.nextToken());
		}
		
	}

}
