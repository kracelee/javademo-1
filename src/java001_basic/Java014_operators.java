package java001_basic;

/*
 *	조건연산자 : 식의 결과에 리턴해주는 값이 여러개 일때 사용한다.
 *	식 ? 참 : 거짓
 *	int res = 식 ? 1 : 0
 *	char res = 식 ? 'a' : 'A'
 */

public class Java014_operators { 
	public static void main(String[] args) {
		int total = 23;
		int recode = 5;
		int res = total % recode == 0 ? (total / recode) : (total / recode + 1);
		System.out.println(res);
	}
}
