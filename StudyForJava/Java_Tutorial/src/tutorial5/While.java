package tutorial5;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1 ,sum = 0;
		
		while(i <= 1000) // 조건식이 참일때 계속 실행
		{
			sum += i++;
		}
		System.out.println("1부터 1000까지의 합은"+sum+"입니다");
	}

}
