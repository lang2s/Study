package tutorial6;

import java.util.Scanner;

public class Input_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int i = sc.nextInt();
		System.out.println("입력된 정수는 "+i+"입니다");
		sc.close();
	}

}
