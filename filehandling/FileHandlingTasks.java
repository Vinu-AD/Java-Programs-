package filehandling;

import java.io.*;
import java.util.Scanner;

public class FileHandlingTasks {
    public static void main(String[] args) {
//        fileOrDirectory(); // task 1
//        wordCharacterCount();  // task 2
//        fileRename();  // task 3
//        deleteFile(); // task 4
//        fileDetails(); // task 5
//        listFileOrDirectory(); // task 6
//        updateFile(); // task 7
//        combineFile(); // task 8
//        moveFile(); // task 9
//        mergeFiles(); // task 10
//        reverseFileContent(); // task 11
//        checkPermission(); // task 12
//        changePermission(); // task 13

    }
    static Scanner scan = new Scanner(System.in);
    private static void fileOrDirectory() {
//        1.Check the user given path is file or directory?
        System.out.println("Enter your path to check if it is file or directory: ");
        String path = scan.nextLine();
        File file = new File(path);
        if (file.isFile()){
            System.out.println("\"" + file.getPath()+"\" is a file");
        }
        if (file.isDirectory()){
            System.out.println("\"" + file.getPath()+"\" is a directory");
        }
    }
    private static void wordCharacterCount() {
//        2.Count the Word and Character in a File?
        System.out.println("Enter your path to find word and character count: ");
        String path = scan.nextLine();
        File file = new File(path);

        int charCount = 0;
        int wordCount = 0;
        try {
            Scanner sc = new Scanner(file);
            FileReader fr = new FileReader(file);
            while (fr.read() != -1)
                charCount++;
            while(sc.hasNext()) {
                sc.next();
                wordCount++;
            }
        }
        catch (IOException e) { System.out.println(e); }
        System.out.println("Total Character count is: " + charCount);
        System.out.println("Total Word count is: " + wordCount);
    }
    private static void fileRename() {
//        3.Ask path and filename then rename a file?
        System.out.println("Enter the file path to rename: ");
        String path = scan.nextLine();
        System.out.println("Enter the file name to change: ");
        String fileName = scan.nextLine();

        File file = new File(path);
        File dummy = new File(file.getParent()+"\\"+fileName+".txt");
        if (file.renameTo(dummy)){
            System.out.println("Renamed the file");
        }else {
            System.out.println("Failed to Renamed the file");
        }
    }
    private static void deleteFile() {
//        4.Ask path and filename then delete a file?
        System.out.println("Enter the directory path to delete the file: ");
        String path = scan.nextLine();
        System.out.println("Enter the file name to delete: ");
        String fileName = scan.nextLine();
        File folder = new File(path);
        if(folder.isDirectory()) {
            File file = new File(path + "\\" + fileName + ".txt");
            if(file.isFile()) {
                if(file.delete())
                    System.out.println("File deleted");
            } else System.out.println("File not deleted. Check the file name and try again.");
        }
        else
            System.out.println("Enter the directory path");
    }
    private static void fileDetails() {
//        5.Ask filename and return the file details (name, path, size, permissions)?
        System.out.println("Enter the file path to get the file details: ");
        String path = scan.nextLine();
        File file = new File(path);
        if(file.isFile()) {
            System.out.println("File Details are...");
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getPath());
            System.out.println("Size: " + file.length() + " Bytes");
            System.out.println("Read: " + file.canRead() + ", Write: " + file.canWrite() + ", Execute: " + file.canExecute());
        }
        else System.out.println("Enter the proper file path");
    }
    private static void listFileOrDirectory() {
//        6.List all the files in the given path or directory?
        System.out.println("Enter the path to list the files or directories: ");
        String path = scan.nextLine();
        File file = new File(path);

        if(file.isDirectory()) {
            String[] files = file.list();
            if(files == null || files.length == 0) { System.out.println("Empty folder"); }
            else
                for (int i = 0; i < files.length; i++)
                    System.out.println(i+1 + ". " + files[i]);
        }
        else System.out.println("Enter the proper path.");
    }
    private static void updateFile() {
//        7.Ask file path and update (append text to a file) the user given String?
        System.out.println("Enter the file path to append content: ");
        String path = scan.nextLine();
        File file = new File(path);
        if(!file.isFile()) {
            System.out.println("Enter the valid file path.");
            return;
        }
        System.out.println("Enter your content to append: ");
        String content = scan.nextLine();

        try {
            FileWriter fr = new FileWriter(path, true);
            fr.append("\n").append(content);
            fr.flush();
            System.out.println("Content added successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private static void combineFile() {
//        8.Ask both paths to copy text from one file to another?
        System.out.println("Enter the source file path: ");
        String path1 = scan.nextLine();
        File file1 = new File(path1);
        if(!file1.exists()) {
            System.out.println("Invalid path");
            return;
        }
        System.out.println("Enter the destination file path: ");
        String path2 = scan.nextLine();
        File file2 = new File(path2);
        if(!file2.exists()) {
            System.out.println("Invalid path");
            return;
        }
        try {
            Scanner sc = new Scanner(file1);
            FileWriter fw = new FileWriter(path2, true);
            fw.append("\n");
            while(sc.hasNext())
                fw.append(sc.next());

            fw.flush();
            System.out.println("source file content copied to destination file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void moveFile() {
//        9.Move a file or folder from one directory to another directory?
        System.out.println("Enter the file path to move");
        String sourcePath = scan.nextLine();
        System.out.println("Enter the destination directory path");
        String destinationPath = scan.nextLine();

        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);
        if(!sourceFile.exists() || !destinationFile.exists()) {
            System.out.println("Enter the correct path");
            return;
        }
        if(destinationFile.isFile()) {
            System.out.println("Enter the directory path");
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
    private static void mergeFiles() {
//        10.Ask three details to Merge Two Files into another single File?
        System.out.println("Enter the destination file path: ");
        String destinationPath = scan.nextLine();
        File destination = new File(destinationPath);
        if(!destination.exists()) {
            System.out.println("Invalid path");
            return;
        }
        System.out.println("Enter the source file1 path: ");
        String path1 = scan.nextLine();
        File file1 = new File(path1);
        if(!file1.exists()) {
            System.out.println("Invalid path");
            return;
        }
        System.out.println("Enter the destination file2 path: ");
        String path2 = scan.nextLine();
        File file2 = new File(path2);
        if(!file2.exists()) {
            System.out.println("Invalid path");
            return;
        }
        try {
            Scanner scan1 = new Scanner(file1);
            Scanner scan2 = new Scanner(file2);
            FileWriter fw = new FileWriter(destination, true);
            fw.append("\n");
            while (scan1.hasNextLine()) {
                fw.append(scan1.nextLine());
                fw.append("\n");
            }
            while (scan2.hasNextLine()) {
                fw.append(scan2.nextLine());
                fw.append("\n");
            }
            fw.flush();
            System.out.println("Source file 1 and 2 copied to destination file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void reverseFileContent() {
//        11.Ask path and filename to read and reverse File Content?
        System.out.println("Enter the file path to check the permissions: ");
        String path = scan.nextLine();
        File file = new File(path);
        int count = 0;
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                count++;
                sc.nextLine();
            }

            StringBuilder[] lines = new StringBuilder[count];
            int index = 0;
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                count++;
                lines[index++] = new StringBuilder(sc.nextLine());
            }

            FileWriter fw = new FileWriter(path);
            index--;
            while(index >= 0) {
                fw.write(String.valueOf(lines[index].reverse()));
                fw.write("\n");
                index--;
            }
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Successfully reversed");
    }
    private static void checkPermission() {
//        12.Check file permissions (read, write, execute)?
        System.out.println("Enter the file path to check the permissions: ");
        String path = scan.nextLine();
        File file = new File(path);
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());
    }
    private static void changePermission() {
//        13.Change the file permissions (read, write, execute)?
        System.out.println("Enter the file path to change the permissions: ");
        String path = scan.nextLine();
        File file = new File(path);
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getAbsolutePath());
        System.out.println();
        System.out.println("Before permission change...");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());

        System.out.println(file.setReadable(true));
        System.out.println(file.setWritable(true));
        System.out.println(file.setExecutable(true));

        System.out.println();
        System.out.println("After permission change...");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());
    }
}
