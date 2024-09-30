package chapters.chapter6.box4;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    double volume() {
        return width * depth * height;
    }
}
