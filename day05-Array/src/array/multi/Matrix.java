package array.multi;

/*
 *  수학의 행렬을 나타낼 수 있는 
 *  2차원 배열을 선언하고 초기화 후 
 *  출력해보는 클래스 
 */
public class Matrix {

	public static void main(String[] args) {
		// 1. 선언 2. 배열 초기화 목록으로 초기화 
		int[][] matrix = {{0, 1, 0},{1, 1, 1},{0, 0, 0}};
		
		// 3. 출력 
		for (int idx = 0; idx < matrix.length; idx++) {
			for(int ind =0; ind < matrix[idx].length; ind++) {
				System.out.printf("%d\t", matrix[idx][ind]);
			}
			System.out.println();
		}// end outter for
		
		System.out.println("새로운");
		// 4. 출력 foreach
		for(int[] numbers : matrix) {
			for (int num : numbers) {
				System.out.printf("%d\t", num);
			}
			System.out.println();
		}
	
	}
	

}
