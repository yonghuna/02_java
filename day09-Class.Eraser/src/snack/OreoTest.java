package snack;

public class OreoTest {

/**
 * Oreo 쿠키가 3개 들어있는 oreoBox 라는 변수를 
 * Oreo 배열 타입으로 선언하고 
 * 
 * oreoBox[0] ~ [2] Oreo 쿠키를 입력 
 * 크림의 종류는 바닐라 ,초코 ,딸기 중 하나로 입력할 것 
 * 
 * foreach 를 사용하여 
 * oreoBox 에서 모든의 쿠키의 상태를 출력
 * 
 * for 를 사용하여 모든 쿠키의 크림을 바닐라로 변경 
 * 
 * foreach 사용해서 모든 쿠키의 크림 변경 상태 확인 
 */

	public static void main(String[] args) {
		Oreo [] oreoBox = new Oreo [3];
		
		oreoBox [0] = new Oreo("바닐라", 3 , 2.1);
		oreoBox [1] = new Oreo("딸기"  , 4 , 1.1);
		oreoBox [2] = new Oreo("초코"  , 5 , 7.3);
		
		for(Oreo oreo: oreoBox) {
			oreo.print();
		}
		
		for(Oreo oreo: oreoBox) {
			oreo.changeCream("초록색");
		}

		
		for(Oreo oreo: oreoBox) {
			oreo.print();
		}
	
	}

}
