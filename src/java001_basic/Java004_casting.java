package java001_basic;

/*
 * Ctrl + / : 한 라인 주석 처리
 * Ctrl + SpaceBar : 자동완성
 * Ctrl + Shift + / : 여러 라인 주석 처리
 * Ctrl + Shift + \ : 여러 라인 주석 해제
 * Ctrl + Shift + F : 자동정렬 (Ctrl + F)
 * 
 */

public class Java004_casting {

	public static void main(String[] args) {
//		byte bNum = 2;
//		short sNum = 4;
//		int xNum = 5;
		long lNum = 6L; // 소문자 대문자 전부 가능
		float fNum = 2.5F; // 대소문자 가능
//		double dNum = 7.4;
//		char cData = 'a';
//		boolean eNum = true;

		System.out.println(lNum);
		System.out.println(fNum);

		// 형변환(casting)
		// 묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생.
		// 명시적 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생.
		long gNum = 6; // int => long
		System.out.println(gNum);

		float tNum = 2.5F; // 명시적 형변환 : double => float
		System.out.println(tNum);

		int x = 0101; // 8진수 0 000
		System.out.println(x);

		int y = 65; // 10진수
		System.out.println(y);

		int z = 0B101; // 2진수 0B 0000
		System.out.println(z);
		
		int k = 0x101; //16진수 0x 00
		System.out.println(k);
		
		// 데이터 손실이 발생되는 경우
		byte data = (byte)128;
		System.out.println(data);
	}

}