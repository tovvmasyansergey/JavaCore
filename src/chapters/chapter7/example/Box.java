package chapters.chapter7.example;

public class Box {
    double width;
    double height;
    double depth;
    Box(Box ob){
        width = ob.width;
        depth = ob.depth;
        height = ob.height;
    }
    Box(double w,double d, double h){
        width = w;
        depth = d;
        height = h;
    }
    Box(){
        width = depth = height = -1;
    }
    double volume(){
        return width * depth * height;
    }
}
