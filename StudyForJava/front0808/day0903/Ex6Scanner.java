package StudyForJava.front0808.day0903;

import java.util.Scanner;

public class Ex6Scanner {
    
    public static void main(String[] args) {
        
        // 숫자 다음 문자를 입력받으면 버퍼의 문자를
        // 먼저 읽어오는 현상때문에
        // nextLine() 으로 읽어서 변환하는 방법을 쓰기도한다.

        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double height;

        System.out.println("나이 입력");
         // 숫자형태의 문자열을 int 로 변환
         age = Integer.parseInt(sc.nextLine());
         System.out.println("키 입력");
         // 숫자형태의 문자열을 double 로 변환
         height = Double.parseDouble(sc.nextLine());
         System.out.println("이름 입력");
         name = sc.nextLine();

         System.out.println(name+"님은 "+age+"세 입니다");
         System.out.println("내 키는 "+height+" cm 입니다");
    }
}