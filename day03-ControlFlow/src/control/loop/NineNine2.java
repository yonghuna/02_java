package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		for (int stage = 2; stage <= 9; stage++) {
			int count = 0 ; 
			count ++;
			System.out.printf("%d 단", stage);
			System.out.println();
			for (int times = 1; times <= 9; times++) {
				System.out.printf("%"
						+ "d * %d = %2d \t %d * %d = %2d \t %d * %d = %2d \t"
								 , stage  ,times , stage  * times
								 , stage  ,times + 1 , stage  * times + 1  
								 , stage  ,times , stage  * times  );
				if (count == 3) {
					System.out.println();
					break;
				}
			}
		}
	}

}
