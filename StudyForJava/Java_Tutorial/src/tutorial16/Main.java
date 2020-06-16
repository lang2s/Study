package tutorial16;

public class Main implements Dog, Cat{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();
		main.crying();
		main.show(); 
		main.one();
		main.two();
	}

	@Override
	public void crying() {
		// TODO Auto-generated method stub
		System.out.println("멍!! 멍!!");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("two");
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub
		System.out.println("one");
	}

}
