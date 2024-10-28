package chapters.chapter12.enumConstructor;

public enum Apple {


    JONATHAN(3),

    GOLDEN_DEL(3),

    RED_DEL,

    WINESAP(3),

    CORTLAND(3);
    private int price;

    Apple(int price) {
        this.price = price;
    }
    Apple(){
        this.price = -1;
    }

    int getPrice() {
        return price;
    }
}
