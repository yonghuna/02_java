package practice.methods;

import java.util.Scanner;

public class MethodsTest {

	public static void main(String[] args) {
		// 1. 메소드 정의 클래스 VarietyMethods 의 
		// 변수 선언 
		
		VarietyMethods  methods;
		
		// 2. 초기화 
		
		methods = new VarietyMethods();
		
		// 3.사용.
		/*
		 * methods.sayHello(); methods.maxims("홍길동", "호부호형을 못하니\n"); double cel =
		 * methods.fahToCel(100.0); System.out.println("cel=" + cel);
		 * 
		 * Scanner scan = new Scanner (System.in); System.out.println("이름 월 일 입력하시오");
		 * methods.birthYearMonth(scan.next(), scan.nextInt(), scan.nextInt());
		 * 
		 * System.out.println("원하는 단을 입력하시오");
		 * methods.printNineNineTable(scan.nextInt());
		 * 
		 * System.out.println("원하는 크기를 쓰시오"); int [] numbers = new int[scan.nextInt()];
		 * for(int i = 0; i < numbers.length; i++) { numbers [i] = scan.nextInt(); }
		 * System.out.println("원하는 단들에 대하여 쓰시오");
		 * methods.printNineNineTableFromArray(numbers); ;
		 */
		methods.printTenTimes(3);
		
	}

}
