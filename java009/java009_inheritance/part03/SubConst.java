package java009_inheritance.part03;

public class SubConst extends SuperConst{
	
	int x =50;
	
	public SubConst() {
		super(10, 40);
	}  
}		// 50이라는 변수부터 먼저 찾음.  >  (10, 40) 찾는건 나중.
