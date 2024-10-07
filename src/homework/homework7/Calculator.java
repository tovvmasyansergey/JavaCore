package homework.homework7;

public class Calculator {
    double plus(double num1,double num2){
        return num1 + num2;
    }
    double minus(double num1,double num2){
        return num1 - num2;
    }
    double multiply(double num1, double num2){
        return num1 * num2;
    }
    double divide( double num1,double num2){
        if (num2 != 0){
            return num1/num2;
        }else {
            System.out.println("number cannot = 0");
            return -1;
        }
    }
}
