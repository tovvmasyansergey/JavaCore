package chapters.chapter12.wraper.boxingunboxing;

public class AutoBox2 {
    static int m(Integer v){
        return v;
    }
    public static void main(String[] args) {
        Integer Iob = m(100);
        System.out.println(Iob);
    }
}
