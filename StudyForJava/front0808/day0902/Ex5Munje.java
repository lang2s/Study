package StudyForJava.front0808.day0902;

public class Ex5Munje {
    
    public static void main(String[] args) {
        
    /*    이름이 “강호동”(String), 혈액형이 A형(char)이고 나이가 23(int),키가 187.9(double)

        위의 각 데이타를 적당한 타입과 변수로 저장후 출력
        2가지 방법으로 출력하기

        1.	println 으로 출력
            이름 : 강호동
            혈액형 : A형
            나이 :23세
            키 : 187.9cm

        2. 위와 같이 나오도록 printf 를 이용해서 출력
    */

    String name = "강호동";
    char blood = 'A';
    int age = 23;
    double height = 187.9;

    // println
    System.out.println("이름: "+name);
    System.out.println("혈액형: "+blood+"형");
    System.out.println("나이: "+age+"세");
    System.out.println("키: "+height+"cm");

    // printf
    System.out.printf("이름: %s\n",name);
    System.out.printf("혈액형: %c형\n",blood);
    System.out.printf("나이: %d세\n",age);
    System.out.printf("키: %.1fcm\n",height);
    }
}