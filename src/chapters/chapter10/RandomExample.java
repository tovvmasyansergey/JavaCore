package chapters.chapter10;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 23; i++) {
            try {
              int  b = random.nextInt();
              int a = b / i;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
                System.out.println(e);
                int a = 0;
            }
            System.out.println(i);
        }
    }
}
