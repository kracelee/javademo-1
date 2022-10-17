package java011_casting.part04;

public class SamsungTv2 extends HomeTv {
	public SamsungTv2() {
		
	}
	
	public SamsungTv2(String maker) {
		super(maker);
	}
	
	public void call() {
		System.out.println("Samsung call");
	}
	
	public void move() {
		System.out.println("LG movee");
	}
}
