package StudyForJava.front0808.day0904;

import java.util.Scanner;

public class Ex7Munje_for_while {
    
    // 구구단을 입력후 해당 단을 출력하기(반복적으로 입/출력)
    // 단,2~9가 아니면 다시 입력,
    // 0 이면 while 문 종료

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan;
        while(true)
        {
            System.out.println("구구단 입력");
            dan = sc.nextInt();

            if(dan==0)
            {
                System.out.println("시스템을 종료합니다");
                    break;
            }
            if(dan<2 || dan>9)
            {
                System.out.println("다시 입력해주세요");
                continue;
            }

            System.out.println("** "+dan+"단 **");
            
            for(int i=1;i<=9;i++)
            {
                System.out.println(dan+" x "+i+" = "+dan*i);
            }
            System.out.println();
        }
    }
}