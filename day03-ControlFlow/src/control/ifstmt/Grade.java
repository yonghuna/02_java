package control.ifstmt;

import java.util.Scanner;

/*
 *  다중 선택 if 구문 사용하여 다음의 기준으로 
 *  학점을 계산하는 클래스 
 *  -------------------------------------
 *  A : 90 점이상 
 *  B : 80 ~ 89 점 사이 
 *  C : 60 ~ 79 점 사이 
 *  D : 40 ~ 59 점 사이 
 *  F : 이하 나머지 
 */
public class Grade {

	public static void main(String[] args) {
		int score;
		char grade;
		Scanner scan = new Scanner (System.in);
		System.out.println("0~100사이의 정수를 입력");
		score = scan.nextInt();
		if(score >= 90) {
			grade = 'A';
		}
		else if (score >= 80 && score <= 89 ) {
			grade = 'B';
		}
		else if (score >= 60 && score <= 79) {
			grade = 'C';
		}
		else if (score >= 40 && score <= 59) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.printf(" %d 점에해당하는 학점은 : %c 입니다", score, grade);
	}


}
