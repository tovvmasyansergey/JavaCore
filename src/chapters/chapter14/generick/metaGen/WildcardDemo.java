package chapters.chapter14.generick.metaGen;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double average = iob.average();
        System.out.println("mid value iob = " + average);
        Double dnums[] = {1.1, 2.2, 3.3, 4.4};
        Stats<Double> iob1 = new Stats<Double>(dnums);
        double average1 = iob1.average();
        System.out.println("mid value iob1 = " + average1);
        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F,5.0F};
        Stats<Float> iob3 = new Stats<Float>(fnums);
        double average2 = iob3.average();
        System.out.println("mid value iob3 = " + average2);
        System.out.println("iob and iob1");
        if (iob.sameAvg(iob1)) {
            System.out.println("true");
        } else {
            System.out.println("different");
        }
        System.out.println("iob and iob3");
        if (iob.sameAvg(iob3)) {
            System.out.println(true);
        } else {
            System.out.println("different");
        }
        System.out.println(average + " " + average1 + " " + average2);
    }
}
