package java009_inheritance.part02;

public class MyChild extends MyFather {
	public MyChild() { 
		super(); // 자손에서 부모로 호출할 때
		System.out.println("MyChild");
	}
}
