package chapters.chapter8.abstractfigure;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,2);
        Triangle triangle = new Triangle(1,2);
        Rectangle rectangle1 = new Rectangle(2,3);
        Figure figure;
        figure = new Rectangle(1,56);
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
        System.out.println(figure.area());
    }
}
