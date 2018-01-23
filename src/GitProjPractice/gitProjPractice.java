package GitProjPractice;

import java.util.Scanner;

public class gitProjPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕?");
		
		// 입력
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("숫자를 재입력하세요.");
		int b = sc.nextInt();
		
		// 출력
		System.out.println("첫 번째 숫자 : " + a + "   두 번째 숫자 : " + b);
	}
}