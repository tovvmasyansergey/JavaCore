package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ','c','a','t',' ',' ',' ' ,' ','b',' ','i','b',' '};
        int start_index = 0;
        int end_index = spaceArray.length - 1;
        while (spaceArray[start_index] == ' '){
            start_index ++;
        }
        while (spaceArray[end_index] == ' '){
            end_index --;
        }

        System.out.println(start_index + " " + end_index);
        char[] result = new char[end_index];
        int new_ind = 0;
        for (int i = start_index; i <= end_index; i++) {
            result[new_ind] = spaceArray[i];
            new_ind++;
        }
        //System.out.println(new_ind);
        for (char i : result) {
            System.out.print(i);

        }
    }
}
