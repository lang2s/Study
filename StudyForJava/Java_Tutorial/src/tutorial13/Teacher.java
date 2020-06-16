package StudyForJava.Java_Tutorial.src.tutorial13;

public class Teacher extends Person{
	
	private String teacherId;
	private int monthSalary;
	private int workedYear;
	
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	public int getWorkedYear() {
		return workedYear;
	}
	public void setWorkedYear(int workedYear) {
		this.workedYear = workedYear;
	}
	
	public Teacher(String name, int age, double height, double weight, String teacherId, int monthSalary,
			int workedYear) {
		super(name, age, height, weight);
		this.teacherId = teacherId;
		this.monthSalary = monthSalary;
		this.workedYear = workedYear;
	}
	
	public void show() {
		System.out.println("=====================================");
		System.out.println("선생님 이름: "+getName());
		System.out.println("선생님 나이: "+getAge());
		System.out.println("선생님 키: "+getHeight());
		System.out.println("선생님 몸무게: "+getWeight());
		System.out.println("선생님 번호: "+getTeacherId());
		System.out.println("선생님 월급: "+getMonthSalary());
		System.out.println("선생님 연차: "+getWorkedYear());
	}
	
	

}
