package tutorial5;

public class If {

	public static void main(String[] args) {

		// 조건문 & 반복문
		
		// if 
		String a = "I Love you";
		if(a.contains("Love")) {
			// a에 Love가 포함되면 실행
			System.out.println("Me too.");
		}else {
			// a에 Love가 포함안되면 실행
			System.out.println("I Hate you");
		}
		
		int score = 95;
		if(score >= 90) {
			System.out.println("A 입니다");
		}else if(score >= 80){
			System.out.println("B 입니다");
		}else if(score >= 70) {
			System.out.println("C 입니다");
		}else {
			System.out.println("F 입니다");
		}
		
		String a2 ="Man";
		int b2 = 0;
		
		// 자바는 String을 비교할때 equal()을 이용한다
		// 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문이다.
		if(a2.equals("Man")) {
			System.out.println("남자입니다");
		}else {
			System.out.println("남자가 아닙니다");
		}
		
		if(b2 == 3) {
			System.out.println("b2는 3입니다");
		}else {
			System.out.println("b2는 3이 아닙니다");
		}
		
		if(a2.equalsIgnoreCase("man")) {  // 대소문자 구분없이 비교
			System.out.println("남자입니다");
		}else {
			System.out.println("남자아닙니다");
		}
		
		if(a2.equalsIgnoreCase("man") && b2 == 0) {
			System.out.println("참입니다");
		}else {
			System.out.println("거짓입니다");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
