package chapters.chapter12.answer;

import java.util.Random;

public class Questions {
    Random random = new Random();

    Answers ask() {
        int p = random.nextInt();
        if (p < 15) {
            return Answers.MAYBE;
        } else if (p < 30) {
            return Answers.NO;
        } else if (p < 60) {
            return Answers.YES;
        } else if (p < 75) {
            return Answers.LATER;
        } else if (p < 90) {
            return Answers.SOON;
        } else {
            return Answers.NEVER;
        }
    }
}