package StudyForJava.front0808.day0902;

public class Ex2DataType {
    
    public static void main(String[] args) {
        
        // 기본자료형
        // 문자: char, 정수: byte, short, int, long
        // 실수: float, double, 논리형: boolean
        
        // 레퍼런스자료형
        // 문자열: string
        
        // 1. char: 2byte: 1글자 저장할수있는 타입(한글 한글자포함)
        char ch1 = 'A';
        char ch2 = '가';
        // print 출력문: jdk5.0에서 추가
        // 변환기호를 이용해서 출력
        // 문자: %c, 문자열: %s, 정수: %d, 실수: %f
        System.out.printf("ch1=%c, ch2=%c\n", ch1, ch2);

        char ch3 = 66; // 정수형으로 줄경우 아스키코드표의 문자로 나온다.
        System.out.println(ch3);

        char ch4 = 0x42; // 4*16+2 0x로 시작하면 16진수, 0으로 시작하면 8진수
        System.out.println(ch4);
        System.out.println((int)ch4); // int 정수타입으로 변환출력

        char ch5 = 0106; // 8진수
        System.out.println((int)ch5); // 10진수로 출력
        System.out.println(ch5);

        // 문자+숫자: char+int = int
        System.out.println('A'+2);
        
        // (char) 강제형 변환연산자(cast 연산자)
        System.out.println((char)('A'+2));
    }
}