package unicode.names;

public class App {
    public String getGreeting() {
        return "Hello World, "+new Aplicación().what();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
