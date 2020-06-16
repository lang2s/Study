package tutorial4;

public class Main {

	final static int SECOND = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "분"+second+"초");
		
		// 증감연산자
		int a = 10; 
		System.out.println("헌재의 a는 " + a + "입니다"); // a = 10
		a++;						
		System.out.println("헌재의 a는 " + a + "입니다"); // a = 11
		System.out.println("현재의 a는 "+ ++a + "입니다"); // a = 12
		System.out.println("헌재의 a는 " + a++ + "입니다"); // a = 12
		System.out.println("헌재의 a는 " + a + "입니다");  // a = 13
		
		int i = 20;
		i++;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);
		i += 1;
		
		// 나머지
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int a2 = 50;
		int b2 = 50;
		
		// 논리연산자
		System.out.println("a2와 b2가 같은가요? "+(a2 == b2));
		System.out.println("a2가 b2보다 큰가요? "+(a2 > b2));
		System.out.println("a2가 b2보다 작은가요? "+(a2 < b2));
		System.out.println("a2가 b2와 같으면서 a2 가 30보다 큰가요? "+(a2 == b2 || a2 > 30));
		System.out.println("a2가 50이 아닌가요? "+!(a2 == 50));
	}

}
