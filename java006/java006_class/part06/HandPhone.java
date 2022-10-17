package java006_class.part06;
/*
 * 
 * 		생성자
 * 			1. 객체의 초기값 할당
 *			2. 생성자명은 클래스명하고 같다.
 * 			3. 생성자는 클래스에서 1개이상 존재한다.
 * 			4.  클래스에 정의된 생성자가 없으면 JVM에서 기본 생성자를 제공한다.
 * 			
 * 		[ 기본 생성자 ]
 * 		클래스의 접근페이지(modifier)하고 파라미터가 없는 구조타입				
 * 
 * 
 */








public class HandPhone {
	// 멤버변수
	String name;
	String number;
	
	// 기본 생성자 ( 클래스명과 같게 호출 )
//	public HandPhone() {
//		
//	}
	
	HandPhone() {
		
	}
	
	HandPhone(String name) {
		this.name = name;
	}
	
	HandPhone(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	
	//메소드
	void display() {
		System.out.printf("%s %s\n", name, number);
	}
}
