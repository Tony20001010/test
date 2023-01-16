public class Main {
    public static void main(String[] args) {

        HelloWorld helloworld;
        helloworld = new HelloWorld ("hi");
        helloworld.greet () ;
    }
}
class HelloWorld {
    private String greeting;
    public HelloWorld(String greeting) {
        this.greeting = greeting;
    }
    public void greet() {
        System.out.println(greeting);
    }
}