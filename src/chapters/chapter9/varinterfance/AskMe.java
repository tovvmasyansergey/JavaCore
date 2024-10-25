package chapters.chapter9.varinterfance;

public class AskMe implements SharedConstant{
   static void answer(int result){
        switch (result){
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }

    public static void main(String[] args) {
        answer(1);
        Question question = new Question();
        System.out.println(question.ask());
        System.out.println(question.ask());
        System.out.println(question.ask());
        System.out.println(question.ask());
        answer(question.ask());
    }
}
