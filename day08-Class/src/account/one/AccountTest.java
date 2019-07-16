package account.one;
/**
 * 계좌(Account 타입) 클래스의 
 * 인스턴스(객체, 실체) 를 생성하고 
 * 입금, 현재 계좌 상태 출력 기능등을 
 * 테스트하는 클래스 
 * @author Administrator
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		// 1. 선언 
		Account account;
		Account myAccount;
		
		// 2. 초기화 
		
		account = new Account();
		myAccount = new Account();
		
		// 3. 사용 (메소드 호출)
		// (1) 계좌 생성 직후 상태 출력
		System.out.println("account 의 상태");
		account.print();
		
		System.out.println("MyAccount의 상태 ");
		myAccount.print();
		
		System.out.println("=============================");
		
		// (2) 계좌에 10.000원 임급 
		System.out.println("account 10.000원 입금");
		account.deposit(10000);
		
		System.out.println("myAccount 10.0000 입금");
		myAccount.deposit(100000);
		
		System.out.println("=============================");
		
		// (3) 임급 후 상태 출력 
		account.print();
		
		// (4) 계좌에 5.000원 임급 
		account.deposit(5000);
		
		// (5) 입금 후 상태 출력
		System.out.println("account 의 상태");
		account.print();
		
		System.out.println("MyAccount의 상태 ");
		myAccount.print();
		
	}

}
