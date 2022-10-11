package java005_method;

/*
 *   [ 출 력 결 과 ]
 *   java test
 *   tset avaj
 *   java test
 * 
 */

public class Java064_method {
	public static void main(String[] args) {
		char[] arr = {'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't'};
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
	}
	
	// shallow copy : 주소 복사
	// deep copy : 요소 복사
	public static char[] reverse(char[] data) {
		// data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현
		// 기존 가리키던 배열을 취소하고 새로운 배열을 가리켜야 할 필요성 있음.
		
		char[] arr = new char[data.length];
//		arr[0] = data[8];
//		
//		arr[1] = data[7];
//		arr[8] = data[0];

		for(int i=0; i<data.length; i++) {
			arr[i] = data[data.length-1-i];
		}
		
		return arr;
		
	} 
	
	
}
