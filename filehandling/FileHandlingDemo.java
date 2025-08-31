package filehandling;

import javax.annotation.processing.Filer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String[] args) {

//        createFile();
//        writeReadFile();
//        readFileUsingScanner();
//        updateFile();
//        deleteFile();
    }

    public static void createFile() {
        try {
            File f = new File("E:\\FullStack Course\\Java\\FileHandling\\NewFold\\NewFolder1");
            f.mkdirs();

            f = new File("E:\\FullStack Course\\Java\\FileHandling\\NewFold\\file1.txt");
            f.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeReadFile() {
        try {
            File f = new File("E:\\FullStack Course\\Java\\FileHandling\\NewFold\\file1.txt");

            FileWriter fw = new FileWriter(f);
            fw.write("Java is a high level object oriented programming language");
            fw.flush();

            FileReader fr = new FileReader(f);

            System.out.println("Written content: ");
            int temp;
            while((temp = fr.read()) != -1) {
                System.out.print((char) temp);
            }
            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFileUsingScanner() {
        try {
            File f = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\file1.txt");

            System.out.println("Read Using Scanner: ");
            Scanner scan = new Scanner(f);
            while(scan.hasNext()) {
                System.out.print(scan.next() + " ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateFile() {
        try {
            File f = new File("E:\\FullStack Course\\Java\\FileHandling\\NewFold\\file1.txt");

            FileWriter fw = new FileWriter(f, true);
            fw.append(" and Java is platform independent");
            fw.flush();

            FileReader fr = new FileReader(f);

            System.out.println("\nUpdated Content: ");
            int temp;
            while((temp = fr.read()) != -1) {
                System.out.print((char) temp);
            }
            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }

    public static void deleteFile() {
        try {
            File f = new File("E:\\FullStack Course\\Java\\FileHandling\\NewFold\\temp.txt");
            f.createNewFile();
            if(f.exists()) System.out.println("New File Created Successfully");

            System.out.println("File Name: " + f.getName());
            System.out.println("File Path    : " + f.getPath());
            System.out.println("File Abs Path: " + f.getAbsolutePath());
            System.out.println("Can Read: " + f.canRead());
            System.out.println("Can Write: " + f.canWrite());
            System.out.println("Can Execute: " + f.canExecute());

            f.delete();
            if(!f.exists()) System.out.println("File Deleted Successfully");
//            f.deleteOnExit();
//            if(f.exists()) System.out.println("File Deleted Successfully");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
