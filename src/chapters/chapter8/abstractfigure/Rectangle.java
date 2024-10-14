package chapters.chapter8.abstractfigure;

public class Rectangle extends Figure{
    Rectangle(double a,double b){
        super(a,b);
    }

    @Override
    double area() {
        System.out.println("square rectangle");
        return dim1 * dim2;
    }
}
