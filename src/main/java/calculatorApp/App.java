package calculatorApp;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 4); // 6
        System.out.println(result);
    }
}
