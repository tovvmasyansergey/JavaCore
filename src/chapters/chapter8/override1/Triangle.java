package chapters.chapter8.override1;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("square triangle");
        return dim1 * dim2 / 2;
    }
}
