package control.ifstmt;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		int a;
		int b;
		int max = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("두 정수를 입력하시오 ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a > b) {
			max = a; 
			System.out.printf("큰 값은 %d 와 %d 중에 큰 값은 %d 입니다", a, b, max);
		}
		else if (b > a) {
			max = b; 
			System.out.printf("큰 값은 %d 와 %d 중에 큰 값은 %d 입니다", a, b, max);
		}
		
		else if (a == b) {
			System.out.println("동일합니다");
		}
	}

}
