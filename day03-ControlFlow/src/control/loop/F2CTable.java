package control.loop;

public class F2CTable {

	public static void main(String[] args) {
		for(double f = 0; f <= 100; f += 10) {
			double c = (f-32) / 1.8;
			System.out.printf("%2.1f F = %2.1f C %n", f ,c);
		}
	}

}
