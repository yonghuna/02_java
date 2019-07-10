package control.loop;
/*
 * while 문을 이용하여 1 ~100 까지의 홀수의 합을 구하시오 
 */
public class SumOfOdd {

	public static void main(String[] args) {
		int num = 1 ;
		int sum = 0 ; 
		while ( num <= 100) {
			sum += num;
			num+=2;
		}
		System.out.printf("1부터 100까지의 홀수의 합은 %d", sum);
		
	}
	


}
