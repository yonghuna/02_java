package control.swchsstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("몸무게 키를 입력하시오");
		double weight = scan.nextDouble();
		double height = scan.nextDouble();
		height = height * 0.01;
		double bmi = weight / (height * height);
		
		if(bmi > 40) {
			System.out.printf(" 병적인 비만 %4.2f",bmi);
		}
		else if (bmi > 27.5 && bmi <= 40) {
			System.out.printf(" 비만 %2.1f",bmi);
		}
		else if (bmi > 23.0 && bmi <= 27.5) {
			System.out.printf(" 과제충 %2.1f",bmi);
		}
		else if (bmi > 18.5 && bmi <= 23.0) {
			System.out.printf(" 정상 %2.1f",bmi);
		}
		else if (bmi > 15.0 && bmi <= 18.5) {
			System.out.printf(" 저체중 %2.1f",bmi);
		}
		else {
			System.out.printf(" 병적인 저체중 %2.1f",bmi);
		}
		
	}

}
