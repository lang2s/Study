package StudyForJava.front0808.day0904;

import java.util.Scanner;

public class Ex6Munje {
    
    // 숫자 n을 입력하면 1부터 n 까지의 합계를 구해서 출력하기

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.println("합계를 구할숫자는?");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
            sum += i;
            sc.close();
        System.out.println("1부터"+n+"까지의 합= "+sum);
    }
}