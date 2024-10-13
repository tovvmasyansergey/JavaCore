package chapters.chapter8.superExample6;

public class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment shipment) {
        super(shipment);
        cost = shipment.cost;
    }

    Shipment(double w, double h, double d, double c, double m) {
        super(w, h, d, m);
        cost = c;

    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m,double c) {
        super(len,m);
        cost = c;
    }
}
