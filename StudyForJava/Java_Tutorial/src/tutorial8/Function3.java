package StudyForJava.Java_Tutorial.src.tutorial8;

public class Function3 {

	public static char function(String input) {
		
		return input.charAt(input.length()-1);
	}
	
	public static int max(int a,int b) {
		
		return (a > b) ?  a : b;
	}
	
	public static int number(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World의 마지막 단어는? \n"+ function("Hello World"));
		
		System.out.println("(345, 567, 789) 중에서 가장 큰값은? \n"+number(345, 567, 789));
	}

}
