package chapters.chapter14.generick.twoGen;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> integerStringTwoGen = new TwoGen<>(23,"java");
        integerStringTwoGen.showTypes();
        System.out.println(integerStringTwoGen.getOb1());
        System.out.println(integerStringTwoGen.getOb2());
    }
}
