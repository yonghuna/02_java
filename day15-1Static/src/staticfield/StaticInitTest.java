package staticfield;

/**
 * static < - > non-satic 
 * 사이의 호출관계를 
 * 서로 다른 클래스에서 테스트하는 클래스
 * @author Administrator
 *
 */
public class StaticInitTest {

	// main 메소드는 static 메소드
	
	public static void main(String[] args) {
		// 다른 클래스의 static 필드 대한 사용
		// ==> 선언 , 초기화, 사용의 순서가 필요없음 
		//     바로 사용 가능 
		// 1. StaticInit 클래스의 static 변수 사용 
		// =>클래스이름.메소드
		System.out.println("StaticInit.count=" + StaticInit.count);
		
		// 2. StaticInit 클래스의 static 메소드 사용 
		StaticInit.increaseCount();
		System.out.println("StaticInit.count = " + StaticInit.count);
		
		//다른 클래스의 non-static 필드 사용에 관한 순서 
		// non-static 필드 사용에 관한 순서 
		// 1. 선언 // 2. 초기화  
		StaticInit init = new StaticInit();
		// 3. 사용
		init.setMemberCnt(10);
		System.out.println("memberCnt + count = " + init.addCount());
	}

}
