import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] local = {"서울", "춘천", "대전", "광주", "부산", "제주"};
		int num = local.length;
		int[] temp_max = new int[num];
		int[] temp_min = new int[num];
		String name, warn, day;
		int Mon, day_int;
		
		System.out.print("오늘의 기상특보는 무엇인가요 : ");
		name = scan.next();
		
		System.out.print("오늘의 주의사항은 무엇인가요 : ");
		warn = scan.next();
		
		System.out.print("오늘은 무슨 요일인가요 : ");
		day = scan.next();
		
		System.out.print("오늘은 몇 월인가요 : ");
		Mon = scan.nextInt();
		
		System.out.print("오늘은 몇 일인가요 : ");
		day_int = scan.nextInt();
		
		
		for(int i = 0; i < num;i++)
		{
			System.out.print(local[i] + " 최저기온은 몇 도인가요 : ");
			temp_min[i] = scan.nextInt();
		}
		
		for(int i = 0; i < local.length; i++)
		{
			System.out.print(local[i] + " 최고기온은 몇 도인가요 : ");
			temp_max[i] = scan.nextInt();
		}
		
		
		System.out.print("아침 최저기온은 ");
		
		for(int i = 0; i < num; i++)
		{
			if(i != num-1)
				System.out.printf("%s %d도, ", local[i], temp_min[i]);
			else
				System.out.printf("%s %d도", local[i], temp_min[i]);
		}
		
		System.out.print("로 예상됩니다.\n낮 최고기온은 ");
		
		for(int i = 0; i < num; i++)
		{
			if(i != num-1)
				System.out.printf("%s %d도, ", local[i], temp_max[i]);
			else
				System.out.printf("%s %d도", local[i], temp_max[i]);
		}
		
		System.out.printf("로 예상됩니다.\n일부 지방에 %s가 발효중입니다. 출근길 %s 운전에 유의해야 합니다.\n이상 날씨였습니다.", name, warn);
		
	}
}
