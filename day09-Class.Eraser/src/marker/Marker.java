package marker;

public class Marker {
	boolean isOpened;
	boolean isNew;
	String color;
	
	public Marker(){
		
	}
	
	Marker(boolean isOpened){
		this();
		this.isOpened = isOpened;
	}
	
	Marker(boolean isOpened, boolean isNew){
		this(isOpened);
		this.isNew = isNew;
	}
	
	public Marker(boolean isOpened, boolean isNew, String color){
		this(isOpened,isNew);
		this.color = color;
	}
	/**
	 * ~색의 마커를 사용하고 있습니다.
	 * 라는 문장을 출력하는 메소드
	 */
	public void print() {
		String message = "마커 색상 : %s, %s, %s";
		String openStatus = "";   
		String newStatus = "";
		
		if(isOpened) {
			openStatus = "뚜껑이 열려 있습니다\n";
		}
		else {
			openStatus = "뚜껑이 닫혀 있습니다.\n";
		}
		
		if(isNew) {
			newStatus = "새마커 입니다\n";
		}
		else {
			newStatus = "다 쓴 마커입니다\n";
		}
		
		System.out.printf(message,color,openStatus,newStatus);
	}
	
	public void use() {
		if(this.isNew == true) {
			System.out.printf("%s 색 사용했습니다\n", color);		
		}
		else{
			System.out.printf("%s 색 새거입니다.\n", color);
		}
	}
 
	
}
