package control.loop;

public class SunOfEvens {

	public static void main(String[] args) {
		int sum = 0 ;
		int num = 0 ;
		while (num <= 100) {
			sum += num;
			num++;
			num+=2;
		}
		System.out.printf("1부터 100까지 짝수의 값은 %d", sum);
	}

}
