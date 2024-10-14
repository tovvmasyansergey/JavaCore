package homework.bracechecker;

public class Stack {
    private char[] chars = new char[10];
    private int size;
    Stack(){
        size = 0;
    }
    public void push(char item){
        if (size == chars.length){
            extend();
        }
        chars[size++] = item;
    }
    public char pop(){
        if (size == 0){
         //   System.out.println("stack is empty");
            return '-';
        } else {
            return chars[--size];
        }
    }
    private void extend(){
        char[] newChar = new char[size + 10];
        int numb = 0;
        for (char c : chars) {
            newChar[numb++] = c;
        }
        chars = newChar;
    }
    public boolean isEmpty(){
        return size == 0;
    }

}
