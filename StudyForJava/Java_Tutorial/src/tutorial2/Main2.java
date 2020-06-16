package tutorial2;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 형변환
		// int a = 0.5; 오류
		int  a = (int)0.5;
		System.out.println(a);
		
		double b = 0.5;	
	 // int a2 = b+0.5;  // 오류
		
		int a2 = (int) (b+0.5);
		System.out.println(a2);
		
		double a3 = 10.3;
		double b3 = 9.6;
		double c3 = 10.1;
		
		System.out.println((a3 + b3 + c3)/3);
		
	}

}
