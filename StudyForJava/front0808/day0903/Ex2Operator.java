package StudyForJava.front0808.day0903;

public class Ex2Operator {
    
    public static void main(String[] args) {
        
        // 산술연산자 +, -, *, /, %
        // 대입연산자 =, +=, -=, *=, /=, %=

        int a = 7, b = 4;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

        // int 로 나눌경우 결과도 int
        System.out.println(a/b);
        // a, b 둘중 하나를 double 로 변환하면 결과도 double
        System.out.println((double)a/b);
        System.out.println(a%b); // 정수형에서만 가능

        a += b; // a = a + b
        System.out.println(a); // 11
        a -= b; 
        System.out.println(a); // 7
        a *= b;
        System.out.println(a); // 28
        a /= b;
        System.out.println(a); // 7
        a %= b;
        System.out.println(a); // 3
    }
}