package chapters.chapter8.superExample6;

public class Box {
    private double width;
    private double height;
    private double depth;
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w,double h,double d){
        width = w;
        depth = d;
        height = h;
    }
    Box(){
        width = depth = height = -1;
    }
    Box(double len){
        depth = width = height = len;
    }
    double volume(){
        return depth * height * width;
    }


}
