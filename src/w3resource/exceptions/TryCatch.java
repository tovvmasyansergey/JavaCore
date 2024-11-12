package w3resource.exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try {
            devide(3.0, 0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static double devide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("You use 0");
        }
        return a / b;
    }
}
