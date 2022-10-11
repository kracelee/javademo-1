package java004_array;

/*
 *    1  2  3  4  5
 *    6  7  8  9 10
 *   11 12 13 14 15
 *   16 17 18 19 20
 * 
 *   num배열에서 아래와 같이 출력이 되도록 구현
 *   
 *    1  2  *  4  5
 *    *  7  8  * 10
 *   11  * 13 14 *
 *   16 17  * 19 20
 * 
 */




public class Java046_array {
	public static void main(String[] args) {
		int[][] num = {{1, 2, 3, 4, 5},
						{6, 7, 8, 9, 10},
						{11, 12, 13, 14, 15},
						{16, 17, 18, 19, 20}};
				
		
//		num[0][0] = 1;
//		num[0][1] = 2;
//		num[0][2] = 3;
//		num[0][3] = 4;
//		num[0][4] = 5;
//		num[1][0] = 6;
//		num[1][1] = 7;
//		num[1][2] = 8;
//		num[1][3] = 9;
//		num[1][4] = 10;
//		num[2][0] = 11;
//		num[2][1] = 12;
//		num[2][2] = 13;
//		num[2][3] = 14;
//		num[2][4] = 15;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				if(num[i][j]%3==0) {
//					System.out.printf("%4c", '*');
					System.out.printf("%4s", '*');
				} else {
					System.out.printf("%4d", num[i][j]);
				}
			}
			System.out.printf("     \n");
		}
		
		
		} // end main()
	}






