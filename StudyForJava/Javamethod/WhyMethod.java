import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
    
    // 함수 method
    public static void printTwoTimesA(){
        System.out.println("-");
        System.out.println("A");
        System.out.println("A");
    }

    public static void printTwoTimesB(){
        System.out.println("-");
        System.out.println("B");
        System.out.println("B");
    }
                                        // 매개변수(parameter)
    public static void printTwoTimesC(String text){
        System.out.println("-");
        System.out.println(text);
        System.out.println(text);
    }

    public static void printTwoTimesD(String text, String delimiter){
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }

    public static void writeTwoTimesC(String text, String delimeter) throws IOException {
        File fw = new FileWriter("output.txt");
        fw.write(delimeter+"\n");
        fw.write(text+"\n");
        fw.write(text+"\n");
        fw.close();
    }

    public static String twoTimes(String text, String delimeter) {
        String out = "";
        out = out + delimeter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        
        return out;
    }

    public static void main(String[] args) {
        
     //   100000000
        System.out.println("-");
        System.out.println("A");
        System.out.println("A");
     //    100000000
        System.out.println("-");
        System.out.println("A");
        System.out.println("A");
     //    100000000

            // 100000000
            printTwoTimesA();
            // 100000000
            printTwoTimesB();
            // 100000000    // 인지(argument)
            printTwoTimesC("C");
            // 100000000
            printTwoTimesD("D", "@");
            // 100000000
            System.out.println(twoTimes("twoTimes", "-"));
            // 1000000000
            File fw = new FileWriter("out.txt");
            fw.write(twoTimes("twoTimes", "*"));
            fw.close();

        // Email.send("egoing.com","two time a",twoTimes("twoTimes", "*"));


    }
}