package homework.fileHomework;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // fileSearch();
        // contentSearch();
        // findLines();
      //  printSizeOfPackage();
 //   createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Please input folder path");
        String folderPath = scanner.nextLine();
        System.out.println("Please input filename");
        String fileName = scanner.nextLine();
        boolean flag = true;
        File directory = new File(folderPath);
        if (!directory.isDirectory()) {
            System.out.println("path is wrong");
            return;
        }
        File[] files = directory.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getName().contains(fileName)){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
// 1 - path թե որ ֆոլդերում ենք փնտրելու
// 2 - keyword - ինչ որ բառ
// Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
// մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("Please input folder path");
        String dirPath = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyWord = scanner.nextLine();
        boolean flag = true;
        File directory = new File(dirPath);
        if (!directory.isDirectory()) {
            System.out.println("path wrong");
            return;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                try (BufferedReader inputStream = new BufferedReader(new FileReader(file.getPath()))) {
                    String line = "";
                    while ((line = inputStream.readLine()) != null) {
                        if (line.contains(keyWord)) {
                            System.out.println(file.getName());
                            flag = false;
                            break;
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (flag) {
            System.out.println("wrong keyword or not exist");
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
// 1 - txtPath txt ֆայլի փաթը
// 2 - keyword - ինչ որ բառ
// տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("Please input file path");
        String dirPath = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyWord = scanner.nextLine();
        boolean flag = true;
        File file = new File(dirPath);
        if (!file.isFile() || !file.getName().endsWith(".txt")) {
            System.out.println("path wrong or not txt");
            return;
        }
        try (BufferedReader inputStream = new BufferedReader(new FileReader(file.getPath()))) {
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                if (line.contains(keyWord)) {
                    System.out.println(line);
                    flag = false;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (flag) {
            System.out.println("file not contest keyword");
        }
    }



    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
// 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
// ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input dir path");
        String dirPath = scanner.nextLine();
        boolean flag = true;
        File dir = new File(dirPath);
        if (!dir.isDirectory()) {
            System.out.println("directory not found");
            return;
        }
        double count = 0.0;
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                count += file.length();
            }
        }
        System.out.println("size of dir " + count/1024);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
// 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
// 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
// 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
// որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("Please input dir path");
        String dirPath = scanner.nextLine();
        System.out.println("Please input filName");
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();
        boolean flag = true;
        File directory = new File(dirPath);
        if (!directory.isDirectory()) {
            System.out.println("path wrong");
            return;
        }
        File file = new File(dirPath + File.separator + fileName);
        if (file.exists()){
            System.out.println("File is exist");
            return;
        }
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dirPath + File.separator + fileName))) {
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}