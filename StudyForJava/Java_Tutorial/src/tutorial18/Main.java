package StudyForJava.Java_Tutorial.src.tutorial18;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Archer archer1 = new Archer("궁수1","상");
		Archer archer2 = new Archer("궁수1","상");
		System.out.println(archer1 == archer2);
		System.out.println(archer1.equals(archer2));
	}

}
