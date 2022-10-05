package java1005_basic;

public class Java005_print {

	public static void main(String[] args) {
		byte bNum = 2;
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; // 소문자 대문자 전부 가능
		float fNum = 2.5F; // 대소문자 가능
		double dNum = 7.4;
		char cData = 'a';
		boolean eNum = true;
		String sData = "java";
		
		System.out.println(bNum + "," + sNum);
		
		/*
		 * System.out.printf('출력형식', 값1, 값2, 값 ...)
		 *  출력기호
		 *  %d : 정수(byte, short, int, long)
		 *  %f : 실수(float, double)
		 *  %b : 논리(boolean)
		 *  %c : 문자(char)
		 *  %s : 문자열(String)
		 *  %% : %
		 *  \n : 줄바꿈
		 *  \t : 탭
		 *  
		 */
		
		System.out.printf("%d %d %d %d %f %f %b %c %s\n", bNum, sNum, xNum, lNum, fNum, dNum, eNum, cData, sData);
		System.out.printf("%d %% %d = %d\n", 5,2,(5%2));
		
		System.out.print("java");
		System.out.print("programing"); // 줄바꿈 안됨
		System.out.println();
		System.out.println("jsp");
		System.out.println("test"); // 줄바꿈 자동
	}

}
