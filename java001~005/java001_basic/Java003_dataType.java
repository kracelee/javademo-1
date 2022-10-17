package java001_basic;

/*
 * 리터널(literal) : 그 자체의 값. 수, 문자, boolean 등
 * 변수(variable) : 임의의 값을 저장하는 메모리 공간
 * 자바에서 제공하는 데이터 타입
 * 
 * 	1. primitive DataType (기본 데이터 타입)
 *		문자 - char(2byte)
 *		숫자 - 정수 - byte(1byte) short(2byte) int(4byte) long(8byte)
 *			 - 실수 - float(4byte) double(8byte)
 *	    논리 - boolean(1byte)
 *
 *	2. Reference DataType (참조데이터 타입)
 *		Array, Class, Interface
 *
 *	시스템에서 인식하는 데이터 타입 크기
 *	byte < char < short < int < long < float < double
 *	
 */

public class Java003_dataType {
	public static void main(String[] args) {
		
		// 선언
		int data; // 데이터타입 변수명
		// 할당
		data = 3; // 변수에 3값 할당
		// int data = 3;
		
		System.out.println(data);
		
		data = 10;
		System.out.println(data);
		
//		double avg = 4;
		// Type mismatch: cannot convert from double to int
//		int num = 4.0;
		
//		long ko = 4.0F;
	}
}	
