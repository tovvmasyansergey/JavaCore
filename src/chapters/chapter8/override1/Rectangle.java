package chapters.chapter8.override1;

public class Rectangle extends Figure{
    Rectangle(double a,double b){
        super(a, b);
    }
    double area(){
        System.out.println("square of rectangle");
        return dim1 * dim2;
    }

}
