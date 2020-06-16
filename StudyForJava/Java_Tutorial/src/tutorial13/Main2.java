package tutorial13;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("총 몇 명의 학생이 존재합니까? ");
		int number = sc.nextInt();
		Student[] students = new Student[number];
		
		for(int i=0;i<number;i++) 
		{
			String name;
			int age;
			double height;
			double weight;
			String studentID;
			int grade;
			double gPA;
			System.out.println("학생의 이름을 입력하세요: ");
			name = sc.next();
			System.out.println("학생의 나이를 입력하세요: ");
			age = sc.nextInt();
			System.out.println("학생의 키 입력하세요: ");
			height = sc.nextInt();
			System.out.println("학생의 몸무게 입력하세요: ");
			weight = sc.nextInt();
			System.out.println("학생의 학생번호룰 입력하세요: ");
			studentID = sc.next();
			System.out.println("학생의 학년 입력하세요: ");
			grade = sc.nextInt();
			System.out.println("학생의 학점을 입력하세요: ");
			gPA = sc.nextDouble();
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
			
		}
		for(int i=0;i<number;i++)
		{
			students[i].show();
		}
	}

}
