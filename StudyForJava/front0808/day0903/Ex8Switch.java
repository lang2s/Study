package StudyForJava.front0808.day0903;

public class Ex8Switch {
    
    public static void main(String[] args) {
        
        // Switch 문을 이용한 예제
        int n = 3;
        // break 가 없을 경우 끝까지 실행

        switch(n)
        {
            case 1:
                System.out.println("n is 1");
            case 2:
                System.out.println("n is 2");
            case 3:
                System.out.println("n is 3");
            default:
                System.out.println("n is >3");
        }

        char ch = 'B';
        switch(ch)
        {
            case 'A':
                System.out.println("apple");
                break;
            case 'B':
                System.out.println("banana");
                break;
            default:
                System.out.println("a,b 가 아니다");
        }

        String msg = "happy";
        // switch 문자열은 jdk 8 부터 가능
        switch(msg)
        {
            case "hello":
                System.out.println("msg is hello");
                break;
            case "happy":
                System.out.println("msg is happy");
                break;
            case "nice":
                System.out.println("msg is nice");
                break;
        }

        int score = 55;
        char grade;
        switch(score/10){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
            }
        System.out.println(score+" => "+grade);
    }

}