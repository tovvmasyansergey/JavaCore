package classwork.stack;

public class Stack {
    int[] array = new int[10];
    int tos;

    Stack() {
        tos = 0;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else {
            array[tos++] =item;
        }
    }
    int pop(){
        if (tos < 0){
            System.out.println("Stack is empty");
            return 0;
        }else {
            return array[tos--];
        }
    }
}
