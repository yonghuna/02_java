package control.loop;

import java.util.Scanner;

public class TotalNAverage {

	public static void main(String[] args) {	
		int total = 0 ; 
		int score = 0 ;
		int count = 0 ;
		double average;
		
		Scanner scan = new Scanner (System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("정수를 입력 (끝내려면 0 입력) : ");
			score = scan.nextInt();
			
		if (score != 0) {
			total += score;
			count ++;
		}
		else if (score == 0) {
			average = (double)total / count ;
			System.out.printf("총점 : %d%n", total);
			System.out.printf("평균 : %5.2f%n", average);
			break;
		}

		}
	}

}
