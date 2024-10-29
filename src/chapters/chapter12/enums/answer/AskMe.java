package chapters.chapter12.enums.answer;

public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println(Answers.NO);
                break;
            case YES:
                System.out.println(Answers.YES);
                break;
            case MAYBE:
                System.out.println(Answers.MAYBE);
                break;
            case SOON:
                System.out.println(Answers.SOON);
                break;
            case LATER:
                System.out.println(Answers.LATER);
                break;
            case NEVER:
                System.out.println(Answers.NEVER);
                break;
        }
    }

    public static void main(String[] args) {
        Questions questions = new Questions();
        answer(questions.ask());
    }
}
