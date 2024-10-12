package chapters.chapter7.exampeVargs;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.println(msg);
        for (int i : v) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
     VarArgs2.vaTest("java",1,2,3,4,5);
    }
}

