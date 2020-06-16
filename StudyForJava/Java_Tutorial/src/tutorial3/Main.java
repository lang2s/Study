package StudyForJava.Java_Tutorial.src.tutorial3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(char i='a';i<='z';i++) {
			System.out.print(i+" ");
		}
		
		int a =200;
		
		System.out.println("10진수: " + a);
		System.out.format("8진수: %o\n" ,a);
		System.out.format("16진수: %x\n", a);
		
		String name = "John Doe";
		System.out.println(name);
		
		// 0부터 1번째 전 까지의 문자 출력
		System.out.println(name.substring(0,1));
		// 0부터 3번째 전 까지의 문자 출력
		System.out.println(name.substring(0,3));
		// 3부터 5 전 까지의 문자 출력
		System.out.println(name.substring(3,5));
	}

}
