package chapters.chapter12.enums.language;

import java.util.Scanner;

public class UserDemo {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        User user = new User();
        user.name = "poxos";
        user.surname = "poxosyan";
        user.language = Language.HY;
        String name = user.language.name();
        System.out.println(name);
        Language language = Language.ENG;
        System.out.println(user.language.getCountry());
        Language[] languages = Language.values();
        for (Language language1 : languages) {
            System.out.println(language1);
        }
        String strLanguage = scanner.nextLine();
        try {
            user.language = Language.valueOf(strLanguage);
        }catch (IllegalArgumentException e){
            System.out.println("Language is wrong");
        }
        System.out.println(Language.RU.ordinal());
    }
}
