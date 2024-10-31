import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dis = 0, amount = 0, count = 0;
		
		System.out.print("택시의 이동거리(m)를 입력하세요 : ");
		dis = scan.nextInt();
		count = dis- 1600;
		
		amount = 4800 + ((count%131 == 0) ? count/131 : count/131 + 1) * 100;
		
		System.out.printf("%dm 이동시 택시요금은 %d원입니다.", dis, amount);
		
	}
}
