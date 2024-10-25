package classwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExample {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        System.out.println(sdf.format(date));
        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));
        System.out.println(sdf3.format(date));
        // date to string
        String format = sdf4.format(date);
        System.out.println(format);

        System.out.println("Please input date(14-02-2023)");
        Scanner scanner = new Scanner(System.in);
        String myDateStr= scanner.nextLine();
        Date parse = sdf.parse(myDateStr);
        System.out.println(parse);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(simpleDateFormat.format(date));
    }
}
