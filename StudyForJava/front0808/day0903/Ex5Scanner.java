package StudyForJava.front0808.day0903;

import java.util.Scanner;

public class Ex5Scanner {
    
    public static void main(String[] args) {
        
        // 키보드로부터 입력을 받기 위해서
        // Scanner 클래스를 선언
        // 기본 패키지(java.lang) 가 아니므로
        // import 가 되어야 한다

        Scanner sc = new Scanner(System.in); // 기본 형식
        String msg;
        int score;
        double height;

        System.out.println("점수입력");
        score = sc.nextInt();
        System.out.println("입력받은 점수는"+score+"점입니다");

        // 키보드 버퍼에 있는 문자를 처리한다
        sc.nextLine();

        System.out.println("메세지 입력");
        msg = sc.nextLine(); // 입력후 엔터를 누르면 한줄을 읽어온다.
        System.out.println("메세지: "+msg); 

        System.out.println("키 입력");
        height = sc.nextDouble();
        System.out.println("나의 키는 "+height+" cm 입니다");
    }
}