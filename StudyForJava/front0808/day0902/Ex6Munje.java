package StudyForJava.front0808.day0902;

public class Ex6Munje {
    
    public static void main(String[] args) {
        
        /*
            이름과 3과목의 점수(100점만점) 를 타입선언후 초기값으로 지정후
            (“이영자”,89,79,92)
            합계와 평균을 출력(println,printf,평균은 소숫점 한자리까지만 출력)
            (타입이랑 변수명은 임의로 알아서 선언해주세요)
        */

        String name = "이영자";
        int eng = 89;
        int kor = 79;
        int mat = 92;
        int total = eng+kor+mat;
        double avg = total/3;

        // println
        System.out.println("이름: "+name);
        System.out.println("영어점수: "+eng+"점");
        System.out.println("국어점수: "+kor+"점");
        System.out.println("수학점수: "+mat+"점");
        System.out.println("총점: "+total);
        System.out.println("평균: "+avg);

        // printf
        System.out.printf("이름: %s\n",name);
        System.out.printf("영어점수: %d점\n",eng);
        System.out.printf("국어점수: %d점\n",kor);
        System.out.printf("수학점수: %d점\n",mat);
        System.out.printf("총점: %d점\n",total);
        System.out.printf("평균: %.1f점\n",avg);
    }
}