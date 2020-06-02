package StudyForJava.front0808.day0903;

import java.util.Scanner;

public class Ex12If {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int kor, eng, mat;
        double avg;
        System.out.println("3 과목의 점수입력하기");
        kor = sc.nextInt();
        eng = sc.nextInt();
        mat = sc.nextInt();
        avg = (kor+eng+mat)/3.0;

        if(kor>=40 && eng>=40 && mat>=40 && avg>=60)
            System.out.println("합격");
        else
            System.out.println("불합격");
    }
}