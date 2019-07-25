package eraser.two;
/**
 * 칠판 지우개를 정의하는 클래스 
 * ----------------------------------------------------------------
 * 칠판 지우개 속성 정의 => 멤버 변수로 생성 
 * 가로 : width : double 
 * 세로 : height : double
 * 높이 : depth : double 
 * 겹   : layer : int
 * 색상 : color : String
 * @author Administrator
 * ----------------------------------------------------------------
 * 생성자 정의
 * 기본생성자 명시 
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의 
 * 						  : this 키워드를 사용 
 * -----------------------------------------------------------------
 * 기능 정의 : 메소드로 생성
 * 칠판지우기 : erase() : void : "칠판을 지웠습니다." 문자열 출력 
 * 한 겹씩 제거 : peel() : void : 현제 layer 값에서 1씩 감소 0이 될떄까지
 * 지우개 상태 출력 : print() void : 현재 지우개의 가로, 세로, 높이, 겹, 색상등의 상태를 출력
 */
public class Eraser {
	// 1. 멤버변수 선언부 
	/** 지우개 가로 길이  */
	double width;
	/** 지우개 세로 길이  */
	double height;
	/** 지우개 높이 길이  */
	double depth;
	/** 지우개 겹의  수 */
	int layer;
	/** 손잡이 색깔 */
	String color;
	
	// 2. 생성자 선언
	// (1) 기본생성자
	Eraser() {
		width = 0.0;
		height = 0.0;
		depth = 0.0;
		int layer = 0;
		color = "null";
	}
	// (2) 매개변수가 있는 생성자 다섯개의 매개변수를 모두  
	Eraser(double width, double height, double depth, int layer, String color){
		// alt + shift + a
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.layer = layer;
		this.color = color;
	}
	// 3. 메소드 선언
	public void erase() {
		System.out.println("칠판을 지웠습니다");
	}
	public void peel() {
		if(this.layer - 1 >= 0) {
			this.layer--;
		}
	}
	public void print() {
		System.out.printf("가로 : %4.2f 세로 : %4.2f 높이 : %4.2f 층 :%d 색 : %s\n",width,height,depth,layer,color);
	}

}
