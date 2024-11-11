package chapters.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Character,Integer> count = new HashMap<>();
        String word = "new javaa";
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (count.get(charArray[i]) != null){
                int numb = count.get(charArray[i]);
                count.put(charArray[i],++numb);
            } else if (count.get(charArray[i]) == null) {
                count.put(charArray[i],1);
            }
        }
        System.out.println(count);
    }
}
