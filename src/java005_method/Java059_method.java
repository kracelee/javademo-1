package java005_method;

/*
 *  [출력결과]
 *  10일때 => 10은 짝수입니다.
 *  9일때 =>  9는(은) 홀수입니다.
 */


public class Java059_method {
	public static void main(String[] args) {
		
// 1	
		int data = 11;
		if(process(data)) {
			System.out.printf("%d은(는) 짝수입니다. \n", data);
		} else {
			System.out.printf("%d는(은) 홀수입니다. \n", data);
		}
	
		
// 2
//  int data = 9;
//	String result = process(data) ? "짝수" : "홀수";
//	System.out.printf("%d는(은) %s입니다. \n", data, result);
	
		
// 3		
//	int data = 9;
//	System.out.printf("%d는(은) %s입니다. \n", data, 
//			process(data) ? "짝수" : "홀수" );
	
		
		
// bonus
//
		int a = 11;
	System.out.printf("%d %d %d\n", ++a, ++a, ++a);
	System.out.printf("%d %d %d\n", a++, a++, a++);
	
		
	
	}// end main()
	
	public static boolean process(int data) {
		// data매개변수의 값이 짝수면 true,
		// 홀수이면 false를 리턴하는 메소드 구현

// 1		
//		if(data%2==0)
//			return true;
//		else		
//			return false;
		
		return (data % 2 == 0) ? true : false;
		
		
		
	}// end process()
	
}



