package classwork.chapter6;

public class FigurePainter {
    void figure1(int lineNumber, char c) {
        for (int i = 0; i < lineNumber; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figure2(int lineNumber, char c) {
        for (int i = 0; i < lineNumber; i++) {
            for (int j = lineNumber - i; j > 1; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figure3(int lineNumber, char c) {
        for (int i = 0; i < lineNumber; i++) {
            for (int j = lineNumber - i; j > 0; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figure4(int lineNumber, char c) {
        for (int i = 0; i < lineNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = lineNumber - i; j > 0; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figure5(int lineNumber, char c) {
        for (int i = 0; i < lineNumber; i++) {
            for (int j = lineNumber - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < lineNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = lineNumber - i; j > 0; j--) {
                System.out.print(c + " ");

            }
            System.out.println();
        }
    }
}

