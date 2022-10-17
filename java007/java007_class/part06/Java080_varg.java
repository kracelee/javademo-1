package java007_class.part06;
/*
 * 
 * 
 * 
 * 
 */



public class Java080_varg {
	public static void main(String[] args) {
		
		CountVarg cv = new CountVarg();
		cv.addValue(4, 8);
		cv.addValue(2, 7, 5);
		cv.addValue(1.0, 2.0);
		cv.sumValue("홍길동", 70, 80, 65);
		
		
		
	}

}
