package java006_class.part09;

public class Song {
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	
	public Song() {
		
	}
	
	public Song(String title, String artist, String album, 
					String[] composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
	}
	
	
	public void show() {
		
		System.out.printf("노래제목 : %s\n", title);
		System.out.printf("가 수 : %s\n", artist);
		System.out.printf("앨 범 : %s\n", album);
		
		System.out.printf("작 곡 가 :  ");
		for(int i=0; i<composer.length; i++) {
			

			
			char chk = (i<composer.length - 1) ? ',' : ' '; 
			System.out.printf("%s%c%c", composer[i], chk, ' ');
	
			
//			System.out.printf("%s%c", composer[i], ',' , "%3s");
		}
		
//		System.out.println("\n");
		
		
		
		System.out.printf("년 도 : %d\n", year);
		System.out.printf("트 랙 : %d\n", track);
		
		
		
		
//		System.out.printf("노래제목 : " + title +  '\n' + 
//							"가 수 :  " + artist + '\n' + 
//							);
	}
}
