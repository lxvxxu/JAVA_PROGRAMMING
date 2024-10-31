import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name = "", job = "" , hobby = "", color = "";
		
		System.out.print("안녕? 넌 이름이 뭐야 : ");
		name = scan.next();
		System.out.println("만나서 반가워, " + name);
		
		System.out.print("넌 주로 뭐하고 살아 : ");
		job = scan.next();
		System.out.println(job + "? 나도 마찬가지야 ㅎㅎ");
		
		System.out.print("그럼 심심할 때 뭐하니 : ");
		hobby = scan.next();
		System.out.println(hobby + "? 나랑 똑깥네.");
		
		System.out.print("혹시 좋아하는 색은 뭐야 : ");
		color = scan.next();
		System.out.println(color + "이라구? 와! 이것도 나랑 똑같네.\n앞으로 우리 친하게 지내자.");
		
		scan.close();
	}
}
