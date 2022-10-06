package java001_basic;

/*
 *	연산자(Operator) : 어떠한 기능을 수행하는 기호 (+, -, = 등)
 *	피연산자(Operand) : 연산자의 작업 대상 (변수, 상수, 리터널 등) 
 *
 *	연산자의 종류
 *	1. 산술연산자(이항연산자) : + - * / %
 *	2. 비교연산자(이항연산자) : >, <, >=, <=, ==, !=
 *	3. 논리연산자(이항연산자) : &&, ||, !
 *	4. 조건연산자(삼항연산자) : 조건식 ? 참 : 거짓
 *	5. 대입연산자(이항연산자) : =, +=, -=, *=, /=
 *	6. 증감연산자(단항연산자) : ++, --
 */

public class Java006_operators {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		// int = int + int
		int result = x + y;
		
		System.out.println(result);
		
		double avg = 4.5;
		double val = x + avg;
		
		double sum = avg + val;
		System.out.println(sum);
		
		short a = 3;
		short b = 4;
		
		//int 이하 끼리의 연산은 int로 반환된다.
		//Type mismatch: cannot convert from int to short
//		short c = a + b;
		int c = a + b;
		System.out.println(c);
		
		/*
		 * int = short + short
		 * int = byte + byte
		 * int = char + char
		 */
		
		//자바에서 문자는 유니코드를 사용한다.
		char data = '0'; //48
		char alpa = 'A'; //65
		int hap = data + alpa;
		System.out.println(hap);
	}

}
