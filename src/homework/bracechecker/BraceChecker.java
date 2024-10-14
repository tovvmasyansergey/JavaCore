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
                        System.out.println("closed )but not opened " + i);
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

        while (!stack.isEmpty()) {
            System.out.println("Error opened" + stack.pop() + "but not closed");
        }
    }
}
