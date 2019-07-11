package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		for (int stage = 2; stage <= 9; stage++) {
			int count = 0 ; 
			count ++;
			System.out.printf("%d 단", stage);
			System.out.println();
			for (int times = 1; times <= 9; times++) {
				
				if (count == 3) {
					System.out.println();
					break;
				
				}
			}
		}
	}

}
