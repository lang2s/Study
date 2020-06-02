package StudyForJava.front0808.day0903;

public class Ex3Operator {
    
    public static void main(String[] args) {
        
        // 관계연산자 ==, !=, >, >=, <, <=
        // 논리연산자 &&(and), ||(or), !(not)
        // 결과는 true, false 조건문이나 반복문에서 사용
        int a = 78, b = 90, c = 78;
        System.out.println(a==b); // false
        System.out.println(a>b || b>c); // true
        System.out.println(a>b && b>c); // false
        System.out.println(!(a==b)); // true
        System.out.println(a!=b || b==c); //true
        System.out.println(c>=a && b>c); // true
    }
}