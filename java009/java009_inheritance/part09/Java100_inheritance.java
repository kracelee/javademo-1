package java009_inheritance.part09;

/*

[출력 결과]
삼성		SHY-E2505		200000
삼성		SHV-E1605		180000
아이폰	A1586			250000


삼성 SHY-E2505 200000
삼성 SHY-E1605 180000
아이폰 A1586 250000
아이폰 A1524 220000
LG LG-F700L 190000
LG LG-F650L 180000
***************
010-2534-2532 SK
010-2534-2532 LG
010-2534-2532 KT
010-2534-2532 LG





*/
public class Java100_inheritance {
	public static void main(String[] args) {
		HandPhone[] hPhone = new HandPhone[6];
		hPhone[0] = new HandPhone("삼성", "SHY-E2505", 200000);
		hPhone[1] = new HandPhone("삼성", "SHY-E1605", 180000);
		hPhone[2] = new HandPhone("아이폰", "A1586", 250000);
		hPhone[3] = new HandPhone("아이폰", "A1524", 220000);
		hPhone[4] = new HandPhone("LG", "LG-F700L", 190000);
		hPhone[5] = new HandPhone("LG", "LG-F650L", 180000);

		for (HandPhone hh : hPhone) {

			System.out.println(hh.toString());
		}
		System.out.println("***************");
		/////////////////////////////////////////////////
		
		SmartPhone[] sPhone = new SmartPhone[4];
		sPhone[0] = new SmartPhone("삼성", "SHV-E2505", 200000, "010-2534-2532", "SK");
		sPhone[1] = new SmartPhone("아이폰", "A1524", 250000, "010-2534-2532", "LG");
		sPhone[2] = new SmartPhone("LG", "SHV-E2505", 180000, "010-2534-2532", "KT");
		sPhone[3] = new SmartPhone("아이폰", "A1524", 220000, "010-2534-2532", "LG");
		for (SmartPhone ss : sPhone) {
			System.out.println(ss.toString());
		}
 
	}

}
