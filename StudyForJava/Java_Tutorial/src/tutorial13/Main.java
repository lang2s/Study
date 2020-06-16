package StudyForJava.Java_Tutorial.src.tutorial13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Student student = new Student("홍길동", 20, 123.2, 87.2, "29193", 1, 4.5);
		
		// student.show();
		
		Student[] students = new Student[100]; 
		for(int i = 0; i < 100; i++) {
			students[i] = new Student("홍길동", 20, 123.2, 87.2, i+"", 1, 4.5);
			students[i].show();
		}
		
		Teacher teacher = new Teacher("유재석", 45, 160.3, 67, "0234234", 2000000, 4);
		
		teacher.show();
	}

}
