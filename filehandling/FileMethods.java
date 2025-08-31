package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileMethods {
    public static void main(String[] args) {
//        createFolder();
//        createFiles();
//        renameFolder();
//        fileMethods();
        method1();

    }

    private static void method1() {
        File file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\File Class\\vijay.txt");
        //            if(file.createNewFile()) System.out.println("FILE created");
//            else System.out.println("File already exist");

//        file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\File Class\\Gokul\\Hari\\Vijay\\Vinu");
//        if(file.mkdirs()) System.out.println("Folder created");
//        else System.out.println("Folder not created");

//            file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\File Class\\Gokul\\Hari\\Vijay\\Vinu\\newFile.txt");
//        try {
//            if(file.createNewFile()) System.out.println("File created");
//            else System.out.println("File not created");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\File Class\\Gokul\\Hari\\Vijay\\Vinu");
//        file.delete();
//            if(file.delete()) System.out.println("Deleted");

//        file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\File Class\\Gokul\\Hari\\Vijay\\Vinu\\newFile.txt");
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.canExecute());
//        System.out.println(file.setReadable(false));
//        System.out.println(file.setWritable(false));
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());

        file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\File Class\\Gokul\\Hari\\Vijay\\Vinu\\newFile2.txt");
        try {
            file.createNewFile();
            System.out.println(file.canExecute());
            System.out.println(file.setExecutable(false));
            System.out.println(file.canExecute());

            FileReader fr = new FileReader(file);
            while(fr.ready()) {
                System.out.print((char)fr.read());
            }
            System.out.println("Reading process completed");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void createFolder() {
        String path1 = "E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder";
        File file = new File(path1);
        System.out.println(file.mkdirs()?"Folder Created: " + file.getPath() : "Folder Not Created");

        String path2 = "E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\file1.txt";
        file = new File(path2);
        try {
            System.out.println(file.createNewFile()?"File Created: " + file.getPath() : "File Not Created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void createFiles() {
        try {
            File file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\file1.txt");
            file.createNewFile();
            file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\file2.txt");
            file.createNewFile();
            file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\file3.txt");
            file.createNewFile();
            file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\file4.txt");
            file.createNewFile();
            file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\file5.txt");
            file.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void renameFolder() {
        String path = "E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\file1.txt";

        File file = new File(path);
        file.renameTo(new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\file2.txt"));
    }

    public static void fileMethods() {
        String path = "E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder";

        File file = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\file1.txt");
        File file2 = new File("E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\New Folder\\file2.txt");
//        System.out.println(file.delete()?"Deleted":"Not Deleted");
        System.out.printf("Size of the file1 is: %d Bytes%n", file.length());
        System.out.println("Last modified: " + file.lastModified());
        System.out.println("Compare To: " + file2.compareTo(file));

        file = new File(path);
        System.out.println(file.delete()?"Folder Deleted":"Folder Not Deleted");

        String[] fileList = file.list();
        File[] files = file.listFiles();
        System.out.println(Arrays.toString(fileList));
        for(File f : files)
            System.out.printf("%s, size: %d Bytes%n", f, f.length());

    }

}
