package control.swchsstmt;

import java.util.Scanner;

public class ReportGrade {

	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("0 ~ 100 사이의 정수 입력");
		score =scan.nextInt();
		switch (score/10) {
		case 10 : case 9 :  
			grade = 'A';
			break;
		case 8 : 
			grade =  'B';
			break;
		case 7 : 
			grade = 'C';
			break;
		default : 
			grade = 'F';
			
		}
		System.out.printf("성적은 %c", grade);
		
	}

}
