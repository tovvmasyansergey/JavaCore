package chapters.chapter7.exampeVargs;

public class VarArgs4 {
    static void vaTest(int ...v){
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void vaTest(boolean ...v){
        for (boolean b : v) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true,true,true);
    }
}
