package array.multi;

import java.util.Scanner;

/*
 *  정수를 저장하는 동적 2차 배열을 numbers 생성
 *  
 *  numbers 의 사이즈 : 4
 *  numbers[0] < == 5
 *  numbers[1] < == 3
 *  numbers[2] < == 2
 *  numbers[3] < == 7
 *  
 *  각각의 사이즈를 Scanner 로 입력받아서 생성 
 *  
 *  생성된 배열 안에는 10, 20. ~ 170 까지의 숫자를 저장 
 *  출력해본다.
 */
public class DynamicInputArray {

	public static void main(String[] args) {
		// 1. 선언
		Scanner scan = new Scanner (System.in);
		int [][] numbers2d;
		int input;
		int value = 0 ;
		
		// 2. 2차 배열 입력
		System.out.println("2차 배열의 크기를 입력(4)");
		input =scan.nextInt();
		
		numbers2d = new int[input][];
		
		for (int idx = 0; idx < numbers2d.length; idx++) {
			System.out.printf("인덱스[%d] 1차 배열 크기입력 : \n", idx);
			numbers2d[idx] = new int[scan.nextInt()];
			for (int ind = 0; ind < numbers2d[idx].length; ind++) {
				numbers2d[idx][ind] = (value += 10);
			}
		}
		
		for(int[] output : numbers2d) {
			for(int number : output) {
				System.out.printf("%d\t", number);
			}
			System.out.println();
		}
	}

}
