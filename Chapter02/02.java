import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String main_dish = "", source = "", beverage = "";
		
		System.out.print("주문 도와드리겠습니다, 손님.\n메인요리는 고르셨습니까 : ");
		main_dish = scan.next();
		
		System.out.print("소스는 어떻게 할까요 : ");
		source = scan.next();
		
		System.out.print("음료는 무엇으로 준비할까요 : ");
		beverage = scan.next();
		
		System.out.printf("메인요리는 %s, 소스는 %s, 음료는 %s를 선택하셨습니다.\n준비하겠습니다. 잠시만 기다려 주십시오.", main_dish, source, beverage);
		
	}
}
