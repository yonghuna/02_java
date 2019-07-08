package control.ifstmt;

import java.util.Scanner;

public class PostiveNegative2 {
	/*
	 * 하나의 정수를 입력받아서 
	 * 음수인지 , 양수 인지 판단하는 클래스 
	 * 
	 * 단 , 여기서는 0에 대한 판단은 하지 않는다.
	 * 
	 * 입력받는 변수 input 을 선언하여 Scanner 로 입력받고 
	 * if ~ else 구문으로 부호를 판별한 후 
	 * 판별 결과를 저장하는 변수 String result에 저장하여
	 * 
	 * "입력값 100은 (는) 양수입니다"
	 * 
	 * "입력값 -1은 (는) 음수입니다"
	 */
	public static void main(String[] args) {
		int input;
		String result ;
		System.out.println("정수를 입력하시오");
		Scanner scan = new Scanner (System.in);
		input = scan.nextInt();
		if (input > 0) {
			result = "양수";
			System.out.printf("입력값 %d는 %s입니다%n", input, result);
		}
		else if(input < 0) {
			result = "음수";
			System.out.printf("입력값 %d는 %s입니다%n", input, result);
		}
		else
			System.out.println("값이 같습니다.");
	}

}
