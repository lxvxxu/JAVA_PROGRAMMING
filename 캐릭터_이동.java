import java.util.Scanner;
public class Main
{
	public static void main( String[] args ) {
		
		Scanner scan = new Scanner( System.in );
		char my_input = '\0';
		int a = 8, b = 9;
			
		do
		{
			System.out.println("\033[44m                 \033[0m");
			System.out.println("\033[44m \033[0m                \033[44m \033[0m");
			System.out.println("\033[44m \033[0m                \033[44m \033[0m");
			System.out.println("\033[44m \033[0m                \033[44m \033[0m");
			System.out.println("\033[44m \033[0m                \033[44m \033[0m");
			System.out.println("\033[44m \033[0m                \033[44m \033[0m");
			System.out.println("\033[44m \033[0m                \033[44m \033[0m");
			System.out.println("\033[44m \033[0m                \033[44m \033[0m");
			System.out.println("\033[44m                 \033[0m");
			System.out.print("\033[" + a + ";" + b + "f옷");
			System.out.print("\033[10;1fWASD를 입력 후 Enter 입력 (종료:q) : ");
			my_input = scan.nextLine().charAt(0);
			
			if((my_input == 'a' || my_input == 'A') && (b-1 > 1))
				b--;
			if((my_input == 'd' || my_input == 'D') && (b+1 < 17))
				b++;
			if((my_input == 'w' || my_input == 'W') && (a-1 > 1))
				a--;
			if((my_input == 's' || my_input == 'S') && (a+1 < 10))
				a++;
			
		} while(!(my_input == 'q') && !(my_input == 'Q'));
	}
}
