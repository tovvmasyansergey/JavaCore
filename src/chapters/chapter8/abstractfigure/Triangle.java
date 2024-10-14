package chapters.chapter8.abstractfigure;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("square triangle");
        return dim1 * dim2 / 2;
    }
}
