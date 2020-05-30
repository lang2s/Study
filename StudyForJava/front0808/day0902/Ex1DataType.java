package StudyForJava.front0808.day0902;

public class Ex1DataType {
    
    public static void main(String[] args) {
        
        // 한줄만 주석처리할때 ctrl+/

    /*    
        여러줄 주석 ctrl+shift+/
                풀기 ctrl+shift+\
    */
    System.out.println("Hello"); // syso쓴 상태에서 ctrl+space
    System.out.println("안녕하세요");
    System.out.print("apple"); // print는 개행안됨
    System.out.print("orange");

    // 제어문자열: \n: 개행 \t: 탭 \b: back
    // \를 출력하고싶을때 \\
    // "출력하고싶을때 \"
    
    System.out.println("\napple\norange\n");
    System.out.println("red\tblue\tgreen");
    System.out.println("c:\\java\\test.txt");
    // "red", "blue" 라고 출력해보세요
    System.out.println("\"red\",\"blue\"");
    }
}