
public class ArrayAndFor {
/*
 * 10칸짜리 int 배열 numbers 를 
 * 선언 생성(0 초기화) 한후 
 * 각 원소의 값을 10 , 20 , 30 ... 100 까지 저장 한다.
 *  
 * 배열에 저장된 원소의 합을 
 * int summary; 변수에 누적하여 
 * 출력하시오.
 */
	public static void main(String[] args) {
		int [] numbers = new int[10];
		int summary = 0;
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = (idx + 1) * 10;
			summary += numbers[idx];
		}
		System.out.println(summary);
	}

}
