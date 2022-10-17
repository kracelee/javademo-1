package java011_casting.part02;

public class Employee{
	String name;
	String code; 
	
	public Employee() {
		
	}
	
	public Employee(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	
	@Override
	public String toString() {
		return String.format("name:%s code:%s", name, code);
	}
	
	public String pay() {
		return String.format("%s님의 급여는 %d입니\n", name, 5000);
	}
	
	public String display() {
		return String.format("%s님의 근무지역은 %s입니다.", name, "Seoul");
	}
	
	
	
}
