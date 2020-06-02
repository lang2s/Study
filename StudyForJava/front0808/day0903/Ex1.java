package StudyForJava.front0808.day0903;

public class Ex1 {
    
    public static void main(String[] args) {
        
        // 증감연산자 ++: 1증가 --: 1감소
        // 변수앞에 전치, 뒤에 후치라 한다
        // 단항일경우에는 전치던 후치던 상관없이 1증가 1감소
        // 수식에서 사용할경우에는 전치일경우에는 1순위, 후치일경우 끝순위

        var a = 5;
        int b = 5;
        // 단항인경우

        ++a; // 전치 증가
        b++; // 후치 증가
        System.out.println(a+" , "+b);

        int m, n;
        a = b = 5;
        m = ++a; // 먼저 a 증가후 대입
        n = b++; // 먼저 대입후 증가
        System.out.println(a+" , "+b);
        System.out.println(m+" , "+n);

        a = b = 5;
        n = ++a+b--*m++; //  먼저 (후치이므로 원래값으로 곱합)

        System.out.println(a+" , "+b);
        System.out.println(m+" , "+n);

        a = 5;
        System.out.println(a++); // 5출력후 증가
        System.out.println(++a); // 7증가후 출력
    }
}