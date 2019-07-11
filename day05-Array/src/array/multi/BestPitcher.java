package array.multi;

import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		double [][] ERA = new double [3][5];
		double min = 10.0;
		
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");
		for(int i = 0; i< ERA.length; i++) {
			System.out.printf("%d 번쨰 팀 선발 투수 방어율 :",i+1);
			for(int input = 0; input < ERA[i].length; input++) {
				ERA[i][input] = scan.nextDouble();
				
				if(ERA[i][input] < min) {
				   min = ERA[i][input] ;
					   
				}
			}
		}
		System.out.println("최고의 투수는");
		
		
		for(int i = 0 ; i < ERA.length; i++) {
			for(int input = 0; input < ERA[i].length; input++) {
				if(min == ERA[i][input]) {
				  System.out.printf("%d 번쨰팀 %d 선발 %1.2f투수 방어율"
						  	        , i + 1 , input + 1, min);
				   
				}
			}

		}
		
	}

}
