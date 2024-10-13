package chapters.chapter8.example3;

public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        depth = ob.depth;
        height = ob.height;
    }

    Box(double w, double h, double d) {
        width = w;
        depth = d;
        height = h;
    }
    Box(){
        width = -1;
        depth = -1;
        height = -1;
    }
    double volume(){
        return depth * height * width;
    }
}
