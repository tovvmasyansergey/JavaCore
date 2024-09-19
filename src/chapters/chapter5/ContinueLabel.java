package chapters.chapter5;

public class ContinueLabel {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j*i + " ");
            }
            System.out.println();
        }
    }
}
