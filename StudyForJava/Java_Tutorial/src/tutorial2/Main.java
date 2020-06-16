package tutorial2;

public class Main {
	
	// 상수
	final static double PI = 3.141592;
	// int 크기의 최대값
	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수
		int inType = 100;
		double doubleType = 150.5;
		String stringType = "나동빈";
		
		System.out.println(inType);
		System.out.println(doubleType);
		System.out.println(stringType);
		
		int r = 30;
		System.out.println(r*r*PI);
		
		int a = INT_MAX;
		System.out.println(a+1); // 최대값보다 커지면 최소값으로 돌아감
		
		int a2 = 1;
		int b2 = 2;
		
		// 사칙연산
		System.out.println("a2 + b2 = "+(a2+b2));
		System.out.println("a2 - b2 = "+(a2-b2));
		System.out.println("a2 * b2 = "+(a2*b2));
		System.out.println("a2 / b2 = "+(a2/b2));
	}

}
