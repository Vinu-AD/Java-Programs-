package filehandling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileHandlingTaskNew {

    private static void copyFile() {

        Path path1 = Paths.get("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\file1.txt");
        Path path2 = Paths.get("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\file2.txt");

        try {
            Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void combineFile() {

        File path1 = new File("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\file1.txt");
        File path2 = new File("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\file2.txt");

        try {
            FileInputStream fos1 = new FileInputStream(path1);
            FileInputStream fos2 = new FileInputStream(path2);
            FileOutputStream fw = new FileOutputStream("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\combines.txt", true);

            int data1, data2;
            while((data1 = fos1.read()) != -1) {
                fw.write(data1);
            }
            fw.write(10);
            while((data2 = fos2.read()) != -1) {
                fw.write(data2);
            }
            fw.write(10);
            System.out.println("Files copied");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void combineFileSimul() {

        File path1 = new File("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\file1.txt");
        File path2 = new File("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\file2.txt");

        try {
            Scanner scan1 = new Scanner(path1);
            Scanner scan2 = new Scanner(path2);
            FileWriter fw = new FileWriter("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\simul_combine.txt");

            while(scan1.hasNextLine() || scan2.hasNextLine()) {
                fw.write(scan1.nextLine() + '\n');
                fw.write(scan2.nextLine() + '\n');
            }
            fw.flush();
            System.out.println("Files copied simultaneously");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void nFileCopy() {

        File folder = new File("E:\\FullStack Course\\Java\\FileHandling\\Path Interface");
//        File path2 = new File("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\file2.txt");

        File[] files = folder.listFiles();

        try {
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isFile()) {
                        Scanner scan = new Scanner(files[i]);
                        FileWriter fw = new FileWriter("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\nFileContent\\nFileContent.txt", true);

                        while (scan.hasNextLine()) {
                            fw.write(scan.nextLine() + '\n');
                        }
                        fw.flush();
                    }
                }
                System.out.println("All files copied successfully");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void retrieveTextFile() {
        File path = new File("E:\\FullStack Course\\Java\\FileHandling\\Path Interface");
        File[] files = path.listFiles();
        if(files == null) return;
        File[] fileList = new File[files.length];
        int size = 0;
        for (File file : files) {
            if (file.isFile()) {
                fileList[size++] = file;
            }
        }
        for(int i = 0; i < size; i++) {
            System.out.println(i+1 + " => " + fileList[i]);
        }
    }

    private static void retrieveUserTypeFile() {
        File path = new File("E:\\FullStack Course\\Java\\FileHandling\\Path Interface");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file extension");
        String input = scan.next();
        File[] files = path.listFiles();
        if(files == null) return;
        File[] fileList = new File[files.length];
        int size = 0;
        for (File file : files) {
            String s = file.getAbsolutePath();
            if (s.endsWith(input))
                fileList[size++] = file;
        }
        if(fileList.length == 0) {
            System.out.println("No files in this extension");
            return;
        }
        for(int i = 0; i < size; i++) {
            System.out.println(i+1 + " => " + fileList[i]);
        }
    }

    private static void retrieveUserSizeFile() {
        File path = new File("E:\\FullStack Course\\Java\\FileHandling\\Path Interface");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file size in bytes");
        long input = scan.nextLong();
        File[] files = path.listFiles();
        if(files == null) return;
        File[] fileList = new File[files.length];
        int size = 0;
        for (File file : files) {
            if(file.isDirectory()) continue;

            if (file.length() <= input)
                fileList[size++] = file;
        }
        if(size == 0) {
            System.out.println("No files with this size");
            return;
        }
        for(int i = 0; i < size; i++) {
            System.out.println(i+1 + " => " + fileList[i]);
        }
    }

    private static void moveFile() {
        Scanner scan = new Scanner(System.in);
        String sourcePath = "E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\file1.txt";
        String destinationPath = "E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\New folder";
        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);
        if(!sourceFile.exists() || !destinationFile.exists()) {
            System.out.println("Invalid path");
            return;
        }
        if(destinationFile.isFile()) {
            System.out.println("Invalid directory path");
            return;
        }

        String[] fileList = null;
        int option = -1;

        File copyFile = sourceFile;
        if(sourceFile.isDirectory()) {
            fileList = sourceFile.list();
            if (fileList == null || fileList.length == 0) {
                System.out.println("empty folder cannot be moved");
                return;
            }
            int i;
            for (i = 0; i < fileList.length; i++) {
                System.out.println(i + 1 + ". " + fileList[i]);
            }
            System.out.print("Enter the file number: ");
            option = scan.nextInt();
            if(option < 1 || option > fileList.length)
                throw new IllegalFileNumberException("Provide valid file number");
            copyFile = new File(sourcePath + File.separator + fileList[option - 1]);
        }
        try {
            File newFile = new File(destinationPath + File.separator + copyFile.getName());
            newFile.createNewFile();
            FileInputStream fis = new FileInputStream(copyFile);
            FileOutputStream fos = new FileOutputStream(newFile);
            int data;
            while((data = fis.read()) != -1) {
                fos.write(data);
            }
            fos.close();
            fis.close();
            System.out.println("Moved successfully");
        } catch (IOException e) { throw new RuntimeException(e); }
        copyFile.delete();
    }

        public static void main(String[] args) {
//        copyFile(); // task 1
//        combineFile(); // task 2
//        combineFileSimul(); // task 3
//        nFileCopy(); // task 4
//        retrieveTextFile(); // task 5
//        retrieveUserTypeFile(); // task 6
//        retrieveUserSizeFile(); // task 7

            moveFile(); // task 8

    }
}
