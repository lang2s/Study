package StudyForJava.front0808.day0902;

public class Ex3DataType {
    
    public static void main(String[] args) {
        // 정수형 byte(1), short(2), int(4), long(8)
        // byte: -128 ~ 127

        byte b1 = 120;
        System.out.println(b1);

        // 디모션: 큰값을 작은타입으로 강제형변환, 값손실
        // byte b3 = 129; error
        byte b2 = (byte)129;
        System.out.println(b2);

        int a1 = 12000;
        int a2 = 98;
        System.out.println(a1+", "+a2); // 숫자+문자열 = 문자열
        System.out.println(a1+a2); // 계산되버림
        System.out.println(a2+", "+(char)a2);

        // printf를 이용 %d
        System.out.printf("%d 원\n",a1); // 그대로 출력
        System.out.printf("%10d 원\n",a2); // 10칸중 우측정렬
        System.out.printf("%-10d 원\n",a1); // 10칸중 좌측정렬

        // 실수형
        float f1 = 12.3456789f; // float은 숫자뒤에 f
        double f2 = 12.3456789;
        System.out.println(f1);
        System.out.println(f2);

        // 전체자리수, .소숫점자리수
        System.out.printf("%5.1f\n",f2);
        System.out.printf("%10.2f\n",f2);
        System.out.printf("%-10.2f\n",f2);

    }
}