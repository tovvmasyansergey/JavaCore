package chapters.chapter14.generick.statsgen;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<>(inums);
        double average = iob.average();
        System.out.println("mid value = " + average);
        Double dnums[] = {1.1,2.2,3.3,4.4};
        Stats<Double> iob1 = new Stats<>(dnums);
        double average1 = iob1.average();
        System.out.println("mid value = " + average1);
    }
}
