package java005_method;

/*
 * method (메소드 정의)
 * 1. 값을 계산하기 
 * 2. 객체의 동작을 처리하기 위한 기능이다.
 * 
 * method 정의  : 선언부 + 구현부
 * 반환 자료형 메소드명(데이터타입 매개변수)		 => 메소드 선언부
 *  {
 * 		메소드가 호출될 때 실행 구문;			=> 메소드 구현부
 * 		return 값;
 *  }
 *  
 *  /////////////////////////////////////
 *  
 *  매개변수 = parameter
 *  인수 = argument
 *  
 *  
 *  
 *  1. 리턴값이 없고 매개변수도 없는 형태
 *  	 void add( ) { 
 *  		int x = 10;
 *  		int y = 20;
 *  		if(x<0)
 *  			return;
 *  		System.out.println(x+y); 
 *      }
 *      
 *      add( );  
 *  
 * 	2. 리턴값은 있고 매개변수 없는 형태 
 * 		double avg( ){
 * 			int x = 10;
 *  		int y = 20;
 *  		return (x+y)/2;      // double avg = (x+y)/2;
 *  	} 
 *  
 *  3. 리턴값이 없고 매개변수는 있는 형태 	
 *  	void plus(int x, int y){
 *  		System.out.println(x+y);
 *  	}
 *  
 *  	plus(10, 20);
 *   
 *  4. 리턴값이 있고 매개변수도 있는 형태
 *		double avg(int x, int y){  
 *  		return (x+y)/2.0;
 * 		}
 * 
 * 		avg(10, 20);
 * 
 * 
 */


public class Java052_method {
	
	/*
	 *  프로그램을 실행하면
	 *  JVM(자바가상머신-JAVA Virtual Machine)에서
	 *  main스레드가 main( )메소드를 호출한다.
	 *  
	 *  JVM은 현재 운영체제에 특화된 코드로 변환하여 실행한다.
	 *  즉 JAVA프로그램 실행환경을 만들어 주는 소프트웨어이다.
	 *  
	 */
	
	public static void main(String[] args) {
				
//		String str=null;
//		str.toCharArray(); // null값이라서 array구문을 못찾는다.
//			//exception in thread "main" java.lang.NullPointerException
//		
		
		System.out.println("main start");
		makeTest();
		System.out.println("main end");
		
		
	}// end main()
		
	public static void makeTest() {
		System.out.println("makeTest");  // "분업하게 시작하도록 명령어 내림."		
	}
	 // 변수 정의와 실행이 안되듯이
	 // 메소드도 정의해놓고 호출을 안하면 메소드 실행이 안됨.
	
}
