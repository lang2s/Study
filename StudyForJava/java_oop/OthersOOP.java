import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
    
    public static void main(String[] args) throws IOException {
        
        // class --> System, Math, FileWriter
        // instance --> f1, f2

        // Math class
        System.out.println(Math.PI); // PI --> 변수
        System.out.println(Math.floor(1.8)); // floor --> 매소드
        System.out.println(Math.ceil(1.8)); // floor --> 매소드

        // FileWriter class
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" Java");
        f1.close();

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write(" Java2");
        f2.close();
        
    }
}