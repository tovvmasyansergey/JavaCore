package homework.homework1;

public class FigurePainter {
    public static void main(String[] args) {
        //figure 1
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //figure 2
//        for (int i = 0; i < 5; i++) {
////            for (int j = 5 - i; j > 1; j--) {
////                System.out.print("  ");
////            }
////            for (int j = 0; j <= i; j++) {
////                System.out.print("* ");
////            }
////            System.out.println();
////        }
        //figure 3
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
