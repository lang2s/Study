package StudyForJava.Java_Tutorial.src.tutorial15;

public class Main extends Parent{
	
	// 함수의 재정의
	public void show() {
		
		System.out.println("hello");  // Parent에서 정의된 hi가 다시 재정의됨
	}
	// final 때문에 재정의 안됨 
//	public void show2() {
//		
//		System.out.println("hello"); //
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int number = 10;
		System.out.println(number);
		//  number = 5;  오류 final이 있으면 변하지 않음
		
		Main main = new Main();
		
		main.show();
		main.show2();
		
		
		
		
	}

}
