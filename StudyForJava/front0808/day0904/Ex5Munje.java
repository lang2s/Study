package StudyForJava.front0808.day0904;

public class Ex5Munje {
    
    public static void main(String[] args) {
        
    //     1!=1
    //     2!=2
    //     3!=6
    //       .
    //       .
    //       .
    //     10! 까지 출력
    //    1~10 까지 팩토리알 구하기

        int result = 1;
        System.out.println("합계를 구할 숫자는?");
        for(int i=1;i<10;i++)
        {
            result *= i;
        System.out.println(i+"!="+result);
        }
    }
}