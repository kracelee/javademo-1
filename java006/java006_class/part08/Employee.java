package java006_class.part08;

/*
 *  사원 중에 부서가 결정되지 않은 경우
 *  부서는 "보류", 급여는 3000으로 기본값에 설정한다. 
 *  
 * 
 * 
 */
public class Employee {
	String name;
	String dept;
	int salary;
	
	public Employee() {
		
	}
	
	public Employee(String name) {
		this("보류", 3000);
		this.name = name;
	}
	
	public Employee(int salary) {
		this.salary = salary;
	}
	
	public Employee(String dept, int salary) {
		this.dept = dept;
		this.salary = salary;
	}
	
	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("%s %s %d\n", name, dept, salary);
				}
	
}
