package tutorial6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("Input.txt");
		String me = new File(".").getAbsolutePath();   // file 불러오는 경로 확인
		try {
			Scanner sc = new Scanner(file);	
			while(sc.hasNextInt())
			{
				System.out.println(sc.nextInt()*100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다");
			System.out.println(me);
		}
		
		
		
	}

}
