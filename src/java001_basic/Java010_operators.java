package java001_basic;

public class Java010_operators {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;

		j = ++i;
		System.out.printf("i=%d, j=%d\n", i, j);
 
		i = 5;
		j = 0;

		//대입된 후 증가
		j = i++;
		System.out.printf("i=%d, j=%d", i, j);
	}

}
