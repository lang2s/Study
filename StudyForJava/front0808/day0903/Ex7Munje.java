package StudyForJava.front0808.day0903;

import java.util.Scanner;

public class Ex7Munje {
    
    public static void main(String[] args) {
        
        // 이름과 국어, 영어, 수학 점수를 입력후
        // 총점과 평균을 출력하고 평균이 80이상이면 "참 잘했어요"
        // 70 이상이면 "좀더 노력하세요", 나머지는 "불합격" 출력

        // 선언-->입력-->계산-->출력

        // 1.선언
        Scanner sc = new Scanner(System.in);
        int mat, eng, kor;
        String name;

        // 2.입력
        System.out.println("이름을 입력하세요");
        name = sc.next();
        System.out.println("수학 점수입력");
        mat = sc.nextInt();
        System.out.println("영어 점수입력");
        eng = sc.nextInt();
        System.out.println("국어 점수입력");
        kor = sc.nextInt();

        // 3.계산
        int total = mat + eng + kor;
        double avg = total/3;

        // 4.출력
        System.out.println(" ");
        System.out.println("이름: "+name);
        System.out.println("수학: "+mat+"점");
        System.out.println("수학: "+eng+"점");
        System.out.println("수학: "+kor+"점");
        System.out.println("총점: "+total);
        System.out.println("평균: "+avg);
        System.out.println("평가: "+(avg>=80? "참 잘했어요":"불합격"));
    }
}