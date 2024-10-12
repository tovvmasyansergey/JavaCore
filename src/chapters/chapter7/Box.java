package chapters.chapter7;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        depth = d;
        height = h;
    }

    Box() {
        width = depth = height = -1;
    }

    Box(double len) {
        depth = width = height = len;
    }

    double volume() {
        return width * depth * height;
    }
}
