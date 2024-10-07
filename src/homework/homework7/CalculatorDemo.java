package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(3,2));
        System.out.println(calculator.plus(3,2));
        System.out.println(calculator.minus(3,2));
        System.out.println(calculator.multiply(3,2));
        System.out.println(calculator.divide(2,0));
    }
}
