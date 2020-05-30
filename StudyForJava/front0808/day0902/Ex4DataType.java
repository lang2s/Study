package StudyForJava.front0808.day0902;

public class Ex4DataType {

    public static void main(String[] args) {
        
        // 레퍼런스타입(즉 클래스타입이라는 말)
        
        // 방법 1
        String str1 = "hello";
        
        // 방법 2
        String str2 = new String("hello");

        System.out.println(str1);
        System.out.println(str2);

        // printf에서 출력시 변환기호 %s
        System.out.printf("%s\n",str1);
        System.out.printf("%20s\n",str1);
        System.out.printf("%-20s\n",str1);

        // 논리형
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
    }
    
}