package chapters.chapter9.varinterfance;

import java.util.Random;

public class Question implements SharedConstant {
    Random random = new Random();

    int ask() {
        int a = random.nextInt();
        if (a < 30) {
            return NO;
        } else if (a < 60) {
            return YES;

        } else {
            return MAYBE;
        }
    }
}
