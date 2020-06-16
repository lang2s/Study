package tutorial17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Fruit fruit = new Peach();
		
		fruit.show();
		
		Fruit fruit2 = new Banana();
		
		fruit2.show();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("바나나: 1, 복숭아 : 2");
		int input = sc.nextInt();
		
		Fruit sale;
		if(input == 1) {
			sale = new Banana();
			sale.show();
		}
		else if(input == 2){
			sale = new Peach();
			sale.show();
		}
		
	}

}
