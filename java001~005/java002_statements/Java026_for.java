package java002_statements;

public class Java026_for {
	
	public static void main(String[] args) {

		int sum = 0;
		int i;

		for (i = 1;; i++) {
			sum = sum + i;
			System.out.printf("i=%d, sum=%d\n", i, sum);
			if (sum >= 15) {
				break; // for문 탈출
			}
			
			System.out.printf("1번 %d\n", i);
		}
		
		
		System.out.printf("2번 %d\n", sum);
	}
	
}
