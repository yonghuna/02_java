package api.string.test;

public class StringApiTest {

	public static void main(String[] args) {
		// 1. 선언 
		// (1) char[] 선언
		char[] data = {'a', 'b', 'c'};
		
		// (2) String 변수 선언 
		String str1 = new String(data);
		String str2 = "def";
		String str3 = "xyz";
		
		// 3. String 클래스의 메소드들 사용 
		// (1) charAt(int) : 특정 인덱스의 문자 1개를 얻어냄
		System.out.println(str1.charAt(2)); // c 
		
		// (2) concat(String) : 문자열을 붙인 결과 리턴 
		System.out.println(str1.concat(str2)); // abcdef
		
		// (3) substring(int) : 입력된 인덱스에서 마지막문자 까지 
		System.out.println(str3.substring(1));
		
		// (4) substring(int, int)
		//     abcdefxyz
		System.out.println(str1.concat(str2).concat(str3).substring(2, 5));
		
		// (5) replace(char , char)
		// => : 앞의 매개변수 문자를 뒤 매개변수 문자로 치환
		System.out.println(str1.replace('a', 'x')); // xbc
		
		// (6) toUpperCase() : 대문자로 변경 
		System.out.println(str1.toUpperCase()); // ABC
		
		// (7) toLowerCase() : 소문자로 변경 
		System.out.println(str3.toUpperCase()); // xyz
		
		// (8) lenght() : 문자열 의 길이 를 정수로 리턴 
		System.out.println(str2.length());
		System.out.println(str1.concat(str2).concat(str3).length()); // 9
	}

}
