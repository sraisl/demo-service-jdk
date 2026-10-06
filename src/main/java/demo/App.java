package demo;

public final class App {
    private App() {}

    public static String greeting() {
        return "Hallo von demo-service-jdk!";
    }

    public static void main(String[] args) {
        System.out.println(greeting());
    }
}
