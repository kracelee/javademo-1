package java010_abstract_interface.part01;

/*
 *	 클래스 종류 : 클래스, 추상클래스, 인터페이스
 * 	 메소드 정의 : 메소드 선언부 + 메소드 구현부
 * 		 	public void prn(){};
 * 
 *  추상 메소드 : 선언부만 정의되어 있는 메소드이다.
 *  abstract public void prn();
 *  
 *   추상 클래스 : 추상 메소드를 가지고 있는 클래스이다. 
 * 	 	abstract public class Test{ } 
 * 
 * 		추상 클래스 제공 목적 : 추상 메소드를 강제적으로 오버라이딩하고 
 * 							객체생성할수있도록 하기 위해서
 * 
 * 
 * 
 */


public class Java102_abstract {
	
	public static void main(String[] args) {

//			CarAbs car = new CarsAbs(); // 추상클래스는 객체생성을 할 수 없다.
		
		SenndaAbs sa = new SenndaAbs();
		sa.work();
		
		TruckAbs ta = new TruckAbs();
		ta.work();
	}

}
