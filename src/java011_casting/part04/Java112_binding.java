package java011_casting.part04;


public class Java112_binding {

	// 결합도가 (의존도가) 낮아졌다.
	public static void process(HomeTv tv) {
		tv.turnOn();
		tv.soundUp();

		if (tv instanceof SamsungTv2) {
			SamsungTv2 stv = (SamsungTv2) tv;
			stv.move();
		} else if (tv instanceof LgTv2) {
			LgTv2 ltv = (LgTv2) tv;
			ltv.call();
		}

	}

	public static void main(String[] args) {
		LgTv2 lg = new LgTv2("LG");
		process(lg);

		SamsungTv2 ss = new SamsungTv2("SAMSUNG");
		process(ss);

	}

}
