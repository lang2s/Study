package StudyForJava.front0808.day0904;

public class Ex4For {
    
    public static void main(String[] args) {
        
        for(int i=0;i<=10;i++)
            System.out.println(i+" ");
        System.out.println();
        for(int i=10;i>=1;i--)
            System.out.println(i+" ");
        System.out.println();
        for(int i=1;i<=50;i+=3)
            System.out.println(i+" ");
        System.out.println();
        for(int i=1;i<=20;i++)
        {
            // 5의 배수는 빼고 출력
            if(i%5==0)
                continue; // i++로 이동
            System.out.println(i+" ");
        }
        System.out.println();
    }
}