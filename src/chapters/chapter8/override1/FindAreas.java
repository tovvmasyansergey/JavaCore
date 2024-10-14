package chapters.chapter8.override1;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(1, 2);
        Triangle triangle = new Triangle(3, 4);
        Rectangle rectangle = new Rectangle(5, 6);
        Figure figure = new Triangle(2, 3);
        Figure figure1 = new Rectangle(6,7);
        System.out.println(f.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
        System.out.println(figure.area());
        System.out.println(figure1.area());


    }
}