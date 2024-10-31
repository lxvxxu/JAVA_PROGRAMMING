import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char my_char= '\0';
		
		
		System.out.print("알파벳 소문자 한 글자를 입력하세요 : ");
		my_char = scan.next().charAt(0);
		
		System.out.printf("소문자 %c의 대문자는 %c입니다^^", my_char, my_char + ('A'-'a'));
		
	}
	
	
	
}
