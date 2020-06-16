package StudyForJava.Java_Tutorial.src.tutorial5;

public class For {

	final static int N = 30;
	final static int M = 15;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for문: 초기화부분, 조건부분, 연산부분
		for(int i = N;i>0;i--) 
		{	
			// 2중 for문
			for(int j = i;j>0; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
		
		// 원 만들기    x^2 + y^2 = r^2
		for(int i = -M;i <= M;i++)
		{		
			for(int j = -N;j <= N;j++)
			{
				if(i * i + j * j <= M*M)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
