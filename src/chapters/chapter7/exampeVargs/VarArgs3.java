package chapters.chapter7.exampeVargs;

public class VarArgs3 {
    static void vaTest(int ...v){
        for (int i : v) {
            System.out.println(i);
        }
    }
    static void vaTest(boolean ...v){
        for (boolean b : v) {
            System.out.println(b);
        }
    }
    static void vaTest(String msg,int ...v){
        System.out.println(msg);
        for (int i : v) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        vaTest(1,2,3,4);
        vaTest(true,true,false,false);
        vaTest("java",1,2,3,4);
    }
}
