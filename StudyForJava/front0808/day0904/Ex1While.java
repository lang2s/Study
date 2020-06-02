package StudyForJava.front0808.day0904;

public class Ex1While {
    
    public static void main(String[] args) {
        
        // 1부터 10까지 반복출력
        int n = 0;
        while(n<10)
        {
            n++;
            System.out.printf("%4d",n);
        }
        System.out.println(); // 라인넘김

        // 다른 방법들
        n = 0;
        while(n<10)
        {
            System.out.printf("%4d",++n);
        }
        System.out.println(); // 라인넘김

        n = 0;
        while(++n<=10)
        {
            System.out.printf("%4d",n);
        }
        System.out.println(); // 라인넘김

        n = 0;
        while(true)
        {
            System.out.printf("%4d",++n);
                if(n==10)
                    break;
        }
        System.out.println(); // 라인넘김
        System.out.println("정상종료");
    }
}