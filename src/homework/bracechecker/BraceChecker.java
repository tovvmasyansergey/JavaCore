package homework.bracechecker;

public class BraceChecker {

    Stack stack = new Stack();
    private String text;

    BraceChecker(String text) {
        this.text = text;
    }

    public void checker() {
        char[] charArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            char c = charArray[i];
            char lastSim;
            switch (c) {
                case '[':
                case '{':
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    lastSim = stack.pop();
                    if (lastSim == '-') {
                        System.out.println("closed )" + "but not opened " + i);
                    } else if (lastSim != '(') {
                        System.out.println("opened " + lastSim + "but closed )" + i);
                    }
                    break;
                case ']':
                    lastSim = stack.pop();
                    if (lastSim == '-') {
                        System.out.println("closed ]" + "but not opened " + i);
                    } else if (lastSim != '[') {
                        System.out.println("opened " + lastSim + "but closed ]" + i);
                    }
                    break;
                case '}':
                    lastSim = stack.pop();
                    if (lastSim == '-') {
                        System.out.println("closed }" + "but not opened " + i);
                    } else if (lastSim != '{') {
                        System.out.println("opened " + lastSim + "but closed }" + i);
                    }
                    break;
            }

        }
    }
}
//        for (int i = 0; i < 34; i++) {
//            System.out.println(stack.pop());
//        }
//    char c = '[';
//    char c1 = c;
//    System.out.println((int)c);