package StudyForJava.front0808.day0903;

import java.util.Scanner;

public class Ex9Switch {
    
    public static void main(String[] args) {
            /*
               문제
               숫자를 입력받아
               2일경우 "28" 일 또는 29일까지 있습니다
               4, 6, 9, 11 입력시
                   "30일까지 있습니다"
               1, 3, 5, 7, 8, 10, 12 입력시
                   "31일까지 있습니다"
               그 이외의 숫자 입력시
                   "존재하지 않는 달입니다"
               Scanner 와 switch 문을 이용하여 푸세요
       
           */
           Scanner sc = new Scanner(System.in);
           int month;
           System.out.println("월을 입력해주세요");
           month = sc.nextInt();
       
           switch(month)
           {
               case 2:
                   System.out.println("28일 또는 29일까지 있습니다");
                   break;
               case 4:
               case 6:
               case 9:
               case 11:
                   System.out.println("30일까지 있습니다");
               case 1: case 3: case 5: case 7:
               case 8: case 10: case 12:
                   System.out.println("31일까지 있습니다");
                   break;
               default:
                   System.out.println("존재하지 않는 달입니다");
                   break;
           }
    }
}