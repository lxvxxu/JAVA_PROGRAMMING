import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score_kr = 0, score_eng = 0 , score_math = 0;
		double sum = 0, avg = 0;
		
		System.out.print("0점 ~ 100점 사이의 국어 점수를 입력하세요 : ");
		score_kr = scan.nextInt();
		
		System.out.print("0점 ~ 100점 사이의 영어 점수를 입력하세요 : ");
		score_eng = scan.nextInt();
		
		System.out.print("0점 ~ 100점 사이의 수학 점수를 입력하세요 : ");
		score_math = scan.nextInt();
		
		sum = score_kr + score_eng + score_math;
		avg = (double)sum / 3;
		
		System.out.printf("국어 %d점, 영어 %d점, 수학 %d점의 평균은 %.2f점입니다.", score_kr, score_eng, score_math, avg);
		
	}
}
