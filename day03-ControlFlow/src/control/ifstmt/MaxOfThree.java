package control.ifstmt;
/*
 * 입력된 세 정수 중 가장  큰 값을 판별하는 클래스 
 * 입력값은 각각 int num1, num2, num3; 변수에 저장 
 * 가장 큰 값은 int max; 변수에 저장 
 * 
 * 중첩 if ~ else 로 판단 
 * 
 * 마지막 출력 : printf 사용 
 * 
 */
import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int max = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("정수 3개를 입력하시오");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		if (num1 > num2 && num1 > num3) {
			max = num1;
		}
		else if (num2 > num1 && num2 > num3) {
			max = num2; 
		}
		else {
			max = num3;
		}
		System.out.printf("제일 큰 값은 %d 이다 " , max);
	}

}
