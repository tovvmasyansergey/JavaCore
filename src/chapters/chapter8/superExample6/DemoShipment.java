package chapters.chapter8.superExample6;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment = new Shipment();
        Shipment shipment1 = new Shipment(23,23,23);
        Shipment shipment2 = new Shipment(1,2,3,4,5);
        Shipment shipment3 = new Shipment(shipment1);
        Box box = new Box();
        Box box1 = new Box(shipment1);
        System.out.println(shipment1.volume());
    }
}
