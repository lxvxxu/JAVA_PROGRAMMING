import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sec = 0, hour = 0, min = 0, mi_sec = 0;
		
		System.out.print("초를 입력하세요 : ");
		sec = scan.nextInt();
		
		hour = sec / (60 * 60 );
		min = (sec % (60 * 60)) / 60;
		mi_sec = (sec % 60);
		
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.", sec, hour, min, mi_sec);
		
	}
}
