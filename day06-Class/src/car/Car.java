package car;

/*
 * Car(자동차) 라는 타입을 정의 (선언)하는 클래스 
 * 
 * Car(자동차) 는 자바가 기본 제공하는 타입이 아니다.
 * (기본 제공타입은? : String , Scanner .. )
 * 
 * 클래스 디자인을 할 떄는 추상화작업(Abstraction)이 필요
 * 
 * 속성 : 현재의 속도 (===> 변수) 
 * 기능 : 가속, 정지  (===> 메소드)
 * 
 */
public class Car {
	// 1. 멤버 변수 선언부 : 상태(현재 속도) 저장을 위한 선언 
	int velocity;
	String nickname;
	
	// 2. 생성자 선언부  : 초기화를 위한 선언
	
	// 3. 메소드 선언부 : 사용을 위한 선언
	// (1) 가속 가능 : 가속된 결과 현재 속도가 얼마인지 리턴 
	public int accelerate(int value) {
		velocity += value;
		
		return velocity;
	}
	
	// (2) 정지 기능 : 속도를 완벽히 0으로 설정
	public void stop() {
		velocity = 0;
	}
	
	// (3) 차의 별명을 설정하는 기능 : 
	//	   nickname 필드에 값을 저장 
	public void setNickname(String carNickname) {
		nickname = carNickname;
	}
	
	// (4) 차의 상태(속도)를 알기 위한 출력 
	public void print() {
		System.out.printf("이 차의 현재 속도 : %d km/h \n, 차의 별명 %s \n\n", velocity, nickname);
	}
}
