package control.loop;

import java.util.Scanner;

/*
 * 1 ~ 10 까지 출력하는 클래스 
 * 
 * for 구문을 사용해서 출력
 * 	// 2. 조건식 : 조건의 형태 
		// 		  => 비교연산자(관계, 동일)를 사용한 식 
		//			 연산의 결과가 true , false 로 얻어짐 
		// 3. 증감식 : 증감연산자(++, --) 를 활용하여 
		//				선언식에서 선언된 루프제어 변수 값을 변경 
	
 */
public class PrintTotTenByFor {

	public static void main(String[] args) {
		
		//for (선언식; 조건식; 증감식){
		//	문장들;
		//}
		// 1. 선언식 : 선언의 형태 = > 타입 변수이름;
		int input;
		int mod;
		String result;
		
		Scanner scan;
		
		// 2. 초기화 
		scan = new Scanner (System.in);
		
		for(int idx = 1; idx <= 10; idx++) {
			System.out.printf("idx=%2d%n", idx);
		}
		
		for(int idx = 1; idx < 11; idx++) {
			System.out.printf("idx=%2d%n", idx);
		}
		
		for(int i = 1; i < 10; i++) {
			System.out.println("i=" + i);
		}
		System.out.println("-------------------------");
		System.out.println("10 ~ 1 까지 역순 출력");
		
		for (int idx =10; idx > 0; idx--) {
			System.out.printf("idx=%2d%n", idx);
		}
		
		// final 변수 == 상수를 활용한 for loop
		final int FROM = 1; 
		final int TO = 10;
		
		System.out.println("==FROM, TO 상수를 사용한 출력");
		for (int idx = FROM; idx <= TO; idx++) {
			System.out.printf("idx=%2d%n", idx);
		}
		
		System.out.println("==FROM, TO 상수를 사용한 역순 출력");
		for (int idx = TO; idx >= TO; idx--) {
			System.out.printf("idx=%2d%n", idx);
		}
		
		System.out.println("==FROM, TO 사용하여 0 ~ 9 까지 출력");
		for(int idx =FROM; idx < TO; idx++) {
			System.out.print(idx);
		}
		}
	

}
