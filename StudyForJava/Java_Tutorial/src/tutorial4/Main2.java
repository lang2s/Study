package StudyForJava.Java_Tutorial.src.tutorial4;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 50;
		int y = 60;
		
		System.out.println("최대값은 "+max(x,y)+"입니다");
		
		double a = Math.pow(3.0, 20.0);
		System.out.println("3의 20제곱은 "+(int)a+"입니다");
	}
	
	// 함수 (반환형 , 함수이름, 매개변수)
	static int max(int a,int b) {
		// 삼항연산자
		int result = (a > b) ? a : b; 
		return result;
	}
}
