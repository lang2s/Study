package StudyForJava.front0808.day0904;

import java.util.Scanner;

public class Ex3WhileContinue {
    
    public static void main(String[] args) {
        
        // continue; 남은 코드를 실행하지않고
        // 조건식으로 돌아간다.

        int n = 0;
        while(++n<=50)
        {
            if(n%2==0)
                continue; // 조건식으로 돌아감
            System.out.println(n+" ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int score;
        int sum = 0;

        // 점수를 입력후 합계를 구하는데
        // 1~100 이 아닌경우는 제외
        // 0 입력하면 빠져나와서 합계출력

        while(true)
        {
            System.out.println("점수를 입력하오");
            score = sc.nextInt();
            if(score==0) // 0이면 빠져나감
                break;
            if(score<0 || score>100)
                continue; // 다시 점수 입력
            sum += score;
        }
        System.out.println("총 합계: "+sum);
    }
}