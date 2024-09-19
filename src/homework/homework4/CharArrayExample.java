package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int char_count = 0;
        for (char x : chars) {
            if (x == c) {
                char_count++;
            }
        }
        System.out.println("the count of o " + char_count);
        System.out.println("the middle elements are " + chars[chars.length / 2 - 1] + " " + chars[chars.length / 2]);
        if (chars[chars.length - 1] == 'e' && chars[chars.length - 2] == 'v') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        char[] text = {' ',' ','b','a','r','e','v',' '};
        for (char x : text){
            if (x != ' '){
                System.out.print(x);
            }
        }
    }

}
