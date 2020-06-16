package tutorial9;

public class Main2 {
	
	// 반복함수
	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		
		if(number == 1)
		{
			return one;
		}
		else if(number == 2)
		{
			return two;
		}
		else
		{
			for(int i = 2; i < number; i++)
			{
				result = one+two;
				one = two;
				two = result;
			}
		}
		return	result; 
	}
	
	// 재귀함수
	public static int fibonacci2(int number) {
		if(number == 1)
		{
			return 1;
		}
		else if(number == 1)
		{
			return 1;
		}
		else
		{
			return fibonacci(number - 1) + fibonacci(number-2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("피보나치 수열의 10번째 원소는 "+fibonacci(10)+"입니다");
		System.out.println("피보나치2 수열의 10번째 원소는 "+fibonacci2(10)+"입니다");

	}

}
