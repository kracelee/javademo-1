package java009_inheritance.part01;
/*
 *  상속(inheritance) : 기본 클래스가 가지고 있는 멤버들을 새로 만들 클래스에서 직접 만들지 않고
 *  					상속을 받음으로써 새 클래스가 자신의 멤버처럼 사용할 수 있게
 * 						만든 기술이다.
 * 
 * 	상속(inheritance)
 * 		1. 기본 클래스를 재사용해서 새로운 클래스를 정의하는 것이다.
 * 		2. 두 클래스를 조상과 자손 관계를 맺어주는 것. ( extends )
 * 		3. 상속을 해주는 클래스 : 수퍼클래스(super), 부모클래스, 기본클래스
 * 			상속을 받는 클래스 : 서브클래스(sub), 자식클래스, 유도클래스
 * 		4. 자식(손)의 조상의 모든 자원을 상속받는다. (생성자, static{ }은 제외)
 * 		5. 자식(손)의 자원은 부모보다 크거나 같아야 한다.
 * 		6. 상속을 할 때 사용되는 키워드 : extends
 * 			클래스에 클래스를 상속: extends(단일상속), 인터페이스에 인터페이스 상속: extends(다중 상속)
 * 			
 * 			class A{ }
 * 			class B extends A{ }
 * 			=> 자식클래스 B extends 부모클래스 A
 * 
 * 
 * 			A는 B에게 상속한다.
 * 			B는 A이다.	(상속관계의 클래스를 is a 관계라 한다.)
 * 
 * 			class 도형{ }
 * 			class 삼각형 extends 도형{ }
 * 			삼각형은 도형이다.
 * 
 */


public class Java092_inheritance {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("b= " + child.b);
		System.out.println("a= " + child.a);
		
		child.display();
		System.out.println(child.toString());
	}
}


// 생성자는 상속 안됨.
// private int c = 10; 선언되면 이것도 상속 안됨.  5번째줄에
// c멤버변수 private가 선언되어 있기 때문에 상속이 안된다.
// 


// println("c= " + child.c) // 오류발생.  10번째줄.









