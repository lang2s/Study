class Greeting {

    // public, protected, default, private 
        public static void hi() {
            System.out.println("hi");
        }
}

public class Public {

    public static void main(String[] args) {
        Greeting.hi();
    }
}