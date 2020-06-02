package StudyForJava.front0808.day0904;

public class Ex2While {
    
    public static void main(String[] args) {
        
        // A~Z 까지 출력(아스키코드값: 65~90)
        
        int n = 65;
        while(n<=90)
        {
            // System.out.printf("%3c",n++)
            System.out.println((char)n++ +"");
        }
        System.out.println();

       char ch = 'A';
        while(true)
        {
            System.out.printf("%2c",ch++);
                if(ch>'Z')
                    break;
        }
        System.out.println();

        ch = 'A';
        do{
            System.err.printf("%2c",ch++);
        }while(ch<='Z');
    }
}