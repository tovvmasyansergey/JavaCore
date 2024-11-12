package w3resource.exceptions;

public class StringCheck {
    public static void main(String[] args) {

        String text = "xzccaaaz";
        try {
            check(text);
        } catch (VowelsException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void check(String str) throws VowelsException{
        boolean conteins = true;
        char[] charArray = str.toCharArray();
        String vowels = "aeyuioAEYUIO";
        for (char c : charArray) {
            if (vowels.contains(String.valueOf(c))){
                conteins = false;
                break;
            }
        }
        if (conteins){
            throw new VowelsException("does not exist vowels");
        }
    }
}
