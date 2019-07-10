package control.loop;
/*
 * 1. 50 ~ 0 까지 짝수만 역순으로 출력 
 *  (1) continue 없이 
 *  (2) continue 사용 
 * 
 *  ---------------------------------------
 * 2. 1 ~ 10 까지 제곱표를 출력 
 * 	  1 x 1 = 1 
 *    2 x 2 = 4 
 *    10 x 10 = 100 
 */
public class ForTest {

	public static void main(String[] args) {
		for(int odd = 50; odd >= 0;  odd--) {
			if(odd % 2 == 0) {
				System.out.println(odd);
			}
		}
		
		
		for(int odd = 50; odd >= 0;  odd--) {
			if(odd % 2 != 0) {
				
				continue;
			}
			System.out.println(odd);
		}
		
		for(int num1 = 1; num1 <= 10; num1++) {
			System.out.printf("%d * %d = %d%n", num1, num1, num1*num1);
		}
		
	}

}
