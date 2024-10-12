package chapters.chapter7.exampeVargs;

public class VarArgs {
    static void vaTest(int ...v){
        System.out.println(v.length);
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
      VarArgs.vaTest(2,3,3,4,4,5);
    }
}
