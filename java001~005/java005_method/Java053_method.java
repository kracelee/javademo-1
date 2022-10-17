package java005_method;

/*
 * 	 [출력결과]
 *   홍길동님은 회원입니다.
 *   3,000포인트가 적립되었습니다.
 * 
 */

public class Java053_method { 
	public static void main(String[] args) { // 1
		member("홍길동", true);// 2// 스트링값, 불린값
		plus(3000); //6
	} // 10
	
	//회원여부
	public static void member(String name, boolean chk){ // 3
		if(chk) {
			System.out.printf("%s님은 회원입니다. \n", name); // 4
		} else {
			System.out.printf("%s님은 비회원입니다. \n", name);
		}
		
		// 포인트에 대한 마무리 등등 명령어
		
		
	} // end member // 5
	
	public static void plus(int point) { // 7
		System.out.printf("%d포인트가 적립되었습니다. \n", point);// 8
	}// 9 // end plus 
	
	

	
	
	
	
}









