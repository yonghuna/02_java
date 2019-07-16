package practice.methods;
/*
 * 메소드 작성 연습 클래스 
 * 
 */
public class VarietyMethods {
	/*
	 * 화면에 hello, world! 를 출력하는 메소드
	   sayHello 를 작성하시오 
	 */
	public void sayHello() {
		System.out.println("hello, world!");		
		}
	/*
	 *   매개변수 
	 *   유명인(명사)의 이름(name) 입력받고
	 *   그 사람이 한 유명한 문구(maxim) 를 입력받아 
	 *   
	 *    000(이)가 말하길 ... 라고 하였다.
	 *    
	 *    라는 문장을 출력하는 메소드 
	 *    maxims 를 정의하여라
	 */

	public void maxims(String name, String maxim) {
		System.out.printf("%s(이)가 말하기 \"%s\"라고 하였다.", name , maxim);
	
	}
	
	/*
	 *  입력된 화씨온도를 섭씨온도로 변환하여 
	 *  변환된 섭씨온도를 리턴하는 메소드 
	 *  fahToCel 을 정의하여라 
	 *  
	 *  변환공식 : 5 / 9 * (F - 32)
	 *  
	 *  @param fah : double 변환할 화씨 온도 값 
	 *  @return 변환된 섭씨 온도 값 
	 */
	public double fahToCel (double fah) {
		return 5.0 / 9 * (fah - 32);
	}
	
	//=========================================================
	/**
	 * (1)
	 * 어떤 사람의 이름, 생년, 출생월을 매겨변수를 받아 
	 * 
	 * 000는 XXXX년 XX월 생입니다 .
	 * 
	 * 라는 문장을 출력하는 메소드 
	 * birthYearMonth  를 정의하시오
	 * @param name : String
	 * @param year : int 
	 * @param month : int
	 */
	public void birthYearMonth(String name, int year, int month) {
		System.out.printf("%s 는 %d 년 %d 월 생입니다\n", name, year,month);
	}
	/**
	 *(2)
	 * 출력할 단의 숫자를 입력받아 
	 * 해당 단의 구구단을 출력하는 메소드 
	 * printNineNineTalbe 을 정의하시오 
	 * 
	 * 출력의 첫 줄에 x 단 이라는 제목을 출력 
	 * 
	 * @param stage : int 
	 */
	public void printNineNineTable(int stage) {
		for(int number = 1; number <= 9; number++) {
			System.out.printf("%d * %d = %d\n", stage, number, stage * number);
		}
	}
	/**
	 * (3)
	 * 출력할 단의 숫자를 가지고 잇는 
	 * int 배열을 매개변수로 입력받아 
	 * 입력된 배열의 원소인 각 숫자에 대해 
	 * 구구단을 출력하는 메소드
	 * printNineNineTableFromArray 를 정의하시오 
	 * 
	 * @param stage : int[]
	 */
	 public void  printNineNineTableFromArray (int [] number) {
		 for()
	 }
	
	/**
	 * (4)
	 * 키 (cm) 몸무게 (kg) 매개변수로 입력받아
	 * BMI 지수를 계산하여 비만도 판정 결과를 리턴하는 메소드 
	 * calBmi 를 정의하시오 
	 *	
	 * 공식 : 몸무게 (kg) / 키 (m) 의 제곱 
	 * 
	 *  15.0 미만  			병적인 저체중 
	 *  15.0 이상 18.5 미만 저체중
	 *  18.5 이상 23.0 미만 정상 
	 *  23.0 이상 27.5 이하 과체중 
	 *  27.5 이상 40.0 이하 비만
	 *  40.0초과		    병적인 비만
	 *  
	 *  @param  height double 
	 *  @param  weigth double 
	 *  @return String 비만도 판정 문자열
	 *  
	 */
	 public void printTenTimes(int input){
		
			for(int num = 0; num < 10; num++){
				input += 10;
				System.out.printf("%d\n", input);
				
			}
		}
	/**
	 *  (5)
	 *  입력된 두 정수 중에서 작은 수를 찾아 리턴하는 메소드 
	 *  min 을 정의하시오 
	 *  
	 *  @param input1 : int
	 *  @param input2 : int
	 *  @return int 입력된 두 값 중 작은 정수 
	 * 
	 */
	
	/**
	 * (6)
	 * 입력된 두 정수 중에서 큰 수를 찾아 리턴하는 메소드 
	 * max 를 정의하시오 
	 * 
	 * @param input1 : int
	 * @param input2 : int
	 * @return int 입력된 두 값 중 큰 정수
	 */
	
	/**
	 * 
	 * (7)
	 * 정수가 저장된 int 배열을 매개변수로 입력받아 
	 * 그 배열의 각 원소의 합을 구하여 리턴하는 메소드 
	 * sumOfArrary를 정의하시오 
	 * 
	 * @param numbers : int[] (int 배열)
	   @return int 배열의 각 원소의 합 
	 */
	
	/**
	 *(8)
	 *정수가 저장된 int 배열을 매개변수로 입력받아 
	 *그 배열의 각 원소의 평균을 구하여 리턴하는 메소드 
	 *avgOfArray 를 구하시오.
	 *
	 *@param numbers : intp[] (int배열)
	 *@return dobule 배열의 각 원소의 평균 
	 */
	
	/**
	 *(9)
	 *char 타입의 연산자와 두 개의 정수를 매개변수로 입력받아 
	 *
	 *입력된 연사자가 '+' 일 떄만 
	 *두 정수의 합을 구하여 출력하는 메소드 
	 *adder 를 정의하시오 
	 *
	 *출력 형태 예) 10 + 20 = 30 
	 *
	 *@param op : char 연산자가 전달되는 변수 
	 *@param x : int 첫번쨰 피연산자
	 *@param y : int 두번쨰 피연산자
	 */
	 
	
}
