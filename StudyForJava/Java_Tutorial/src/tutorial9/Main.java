package StudyForJava.Java_Tutorial.src.tutorial9;

public class Main {

	// 반복함수로 구하기
	public static int factorial(int number) {
		int sum = 1;
		System.out.println("factorial:"+number);
		for(int i = 2;i <= number; i++) 
		{
				sum*=i;
		}
		return sum;
	}
	
	// 재귀함수(자기함수안에 또 자기가 들어가있는함수)로 구하기 
	public static int factorial2(int number) {
		if(number == 1)
				return 1;
		else
			System.out.println("factorial2: "+number);
				return number * factorial2(number -1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("factorial: 10팩토리얼은? \n"+factorial(10));
		System.out.println("factorial2: 10팩토리얼은? \n"+factorial2(10));
		
	}

}
