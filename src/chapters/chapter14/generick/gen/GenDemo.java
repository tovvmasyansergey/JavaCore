package chapters.chapter14.generick.gen;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<>(67);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("v = " + v);
        Gen<String> stringGen = new Gen<>("text");
        String ob = stringGen.getOb();
        System.out.println(ob);
    }
}
