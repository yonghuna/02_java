
public class SquaretTable {
/*
 *   
 *  정수를 가지는 배열 
 *  numbers 를 선언 
 *  
 *  1 for (index 사용하는 전통적인 for)구문을 사용하여 
 *    1~10 까지 정수를 저장한다.
 *  
 *  2. foreach 구문을 사용하여 
 *     1에서 저장된 값의 제곱표를 출력
 */
	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		for(int idx = 0; idx < 10; idx++) {
			numbers[idx] = idx + 1;
		}
		for(int output : numbers) {
			System.out.printf("%d x %d = %d\n", output, output, output * output);
		}
	}

}
