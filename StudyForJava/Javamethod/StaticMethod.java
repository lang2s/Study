class Print {

    public String delimeter;

    public void a() {
        System.out.println(this.delimeter);
        System.out.println("a");
        System.out.println("a");
    }

    public void b() {
        System.out.println(this.delimeter);
        System.out.println("b");
        System.out.println("b");
    }

    public static void c(String delimeter) {
        System.out.println(delimeter);
        System.out.println("b");
        System.out.println("b");
    }

}

public class StaticMethod {
    
    public static void main(String[] args) {
        
        // Print.a("-");
        // Print.b("-");
        
        // instance
        Print t1 = new Print();
        t1.delimeter = "-";
        t1.a();
        t1.b();

        // Print.a("*");
        // Print.b("*");

        Print t2 = new Print();
        t2.delimeter = "*";
        t2.a();
        t2.b();

        Print.c("-");
    }
}