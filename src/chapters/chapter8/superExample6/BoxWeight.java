package chapters.chapter8.superExample6;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight boxWeight) {
        super(boxWeight);
        weight = boxWeight.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;

    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }

}
