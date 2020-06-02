package StudyForJava.front0808.day0903;

public class Ex4Operator {
    
    public static void main(String[] args) {
        
        // 삼항(조건) 연산자
        // 조건식? 참일때값 : 거짓일때값
        // 장점: 출력문안에서 직접 사용이 가능
        // html 일 경우에는 태그안에서 사용이 가능

        int m, n, max;
        m = 10;
        n = 70;

        // 두 숫자중 더 큰값을 max에 저장
        max = m>n?m:n;
        System.out.println(max);
        
        int score = 79;
        String msg;
        // msg 에 90 이상이면 "A", 80 이상이면 "B"
        // 70 이상이면  "C", 60 이상이면 "D", 나머지는 "F"

        msg = score>=90? "A":score>=80? "B":score>=70? "C":score>=60? "D":"F";
        System.out.println(msg);

        // 80이상이면 "합격" 아니면 "불합격"
        System.out.println("점수가"+score+"점이면"+(score>=80? "합격":"불합격")+"이네요");

    }
}