package filehandling;

import java.io.*;
import java.util.Scanner;

class IllegalFileTypeException extends RuntimeException {
    IllegalFileTypeException(String msg) {
        super(msg);
    }
}
class IllegalFileNumberException extends RuntimeException {
    IllegalFileNumberException(String msg) {
        super(msg);
    }
}

public class BigTask {
    private static Scanner scan = new Scanner(System.in);
    private static String path = null; // "E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\BigTask";

    private static void start() {
        while(true) {
            System.out.println("Enter the folder path to perform operations");
            path = scan.nextLine();
            File file = new File(path);
            if(file.isDirectory()) break;
            else System.out.println("Enter the correct folder path: ");

        }
    }
    private static String extension(String path) {
        String ext = "";
        int ind = path.length() - 1;
        while(ind >= 0) {
            ext = path.charAt(ind) + ext;
            if(path.charAt(ind) == '.') break;
            ind--;
        }
        return ext;
    }

    private static void createFiles() {
//        System.out.println("Enter your folder path to create files");
//        path = scan.nextLine(); // "E:\\FullStack Course\\Java\\FileHandling\\File Class\\File Handling\\BigTask";
        try {
            File file = new File(path + File.separator + "file1.txt");
            file.createNewFile();
            file = new File(path + File.separator + "file2.txt");
            file.createNewFile();
            file = new File(path + File.separator + "file1.docx");
            file.createNewFile();
            file = new File(path + File.separator + "file2.docx");
            file.createNewFile();
            file = new File(path + File.separator + "excel.xlsx");
            file.createNewFile();
            file = new File(path + File.separator + "pdfFile.pdf");
            file.createNewFile();
            System.out.println("Files created successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void chooseFileToWrite() {
        File file = new File(path);
        int option = -1;
        String[] fileList = file.list();
        if (fileList == null || fileList.length == 0)
            System.out.println("empty folder");
        else {
            for (int i = 0; i < fileList.length; i++) {
                System.out.println(i + 1 + ". " + fileList[i]);
            }
            System.out.print("Enter file number to write content: ");
            option = scan.nextInt() - 1;

            String ext = extension(fileList[option]);
            if (!ext.equals(".txt"))
                throw new IllegalFileTypeException("we cannot edit this file");
            else {
                try {
                    String newPath = path + File.separator + fileList[option];
                    File newfile = new File(newPath);
                    if (newfile.isDirectory())
                        throw new IllegalFileTypeException("We cannot add content to the folder");
                    FileWriter fw = new FileWriter(newPath, true);
                    fw.write("""
                            Java programming content typically covers the fundamentals of the Java language, 
                            object-oriented programming principles, and various Java APIs and frameworks. 
                            It also delves into topics like exception handling, multithreading, and database connectivity. 
                            Learning Java can lead to building web applications, mobile apps, and enterprise software systems
                            """);
                    fw.flush();
                    System.out.println("Content added");

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println();
        }
    }

    private static void chooseFileToShow() {
        File file = new File(path);
        int option = -1;
        String[] fileList = file.list();
        if (fileList == null || fileList.length == 0)
            System.out.println("empty folder");
        else {
            for (int i = 0; i < fileList.length; i++) {
                System.out.println(i+1 + ". " + fileList[i]);
            }
            System.out.print("Enter file number to read content: ");
            option = scan.nextInt() - 1;
            try {
                FileReader fr = new FileReader(path + File.separator + fileList[option]);
                BufferedReader br = new BufferedReader(fr);
                System.out.println();
                while(br.ready()) {
                    System.out.print(br.readLine());
                    System.out.println();
                }
            } catch (IOException e) { throw new RuntimeException(e); }
        }
    }

    private static void modifyAndShowDetails() {
        File file = new File(path);
        int option = -1;
        String[] fileList = file.list();
        if (fileList == null || fileList.length == 0)
            System.out.println("empty folder");
        else {
            for (int i = 0; i < fileList.length; i++) {
                System.out.println(i+1 + ". " + fileList[i]);
            }
            System.out.print("Enter file number to modify content: ");
            option = scan.nextInt() - 1;
            int lineCount = 0;
            try {
                FileReader fr = new FileReader(path + File.separator + fileList[option]);
                BufferedReader br = new BufferedReader(fr);
                while(br.ready()) {
                    lineCount++;
                    br.readLine();
                }
                fr.close();
            } catch (IOException e) { throw new RuntimeException(e); }
            String[] lines = new String[lineCount];
            int ind = 0;
            try {
                FileReader fr = new FileReader(path + File.separator + fileList[option]);
                BufferedReader br = new BufferedReader(fr);
                while(br.ready()) {
                    lines[ind] = br.readLine();
                    System.out.println(lines[ind]);
                    ind++;
                }
            } catch (IOException e) { throw new RuntimeException(e); }
            System.out.print("Which line do you want to modify from " + 1 + " to " + lineCount + ": ");
            int changeLine = scan.nextInt() - 1;
             scan.nextLine();
            System.out.print("Enter your content: ");
            lines[changeLine] = scan.nextLine();
            try {
                FileWriter fw = new FileWriter(path + File.separator + fileList[option]);
                BufferedWriter bw = new BufferedWriter(fw);
                ind = 0;
                while(ind < lineCount) {
                    bw.write(lines[ind] + "\n");
                    ind++;
                }
                bw.flush();
            } catch (IOException e) { throw new RuntimeException(e); }

            System.out.println();
            System.out.println("After modification...");
            try {
                FileReader fr = new FileReader(path + File.separator + fileList[option]);
                BufferedReader br = new BufferedReader(fr);
                while(br.ready())
                    System.out.println(br.readLine());

            } catch (IOException e) { throw new RuntimeException(e); }

        }
    }

    private static void appendContent() {
        File file = new File(path);
        int option = -1;
        String[] fileList = file.list();
        if (fileList == null || fileList.length == 0)
            System.out.println("empty folder");
        else {
            for (int i = 0; i < fileList.length; i++) {
                System.out.println(i+1 + ". " + fileList[i]);
            }
            System.out.print("Enter file number to modify content: ");
            option = scan.nextInt() - 1;
            scan.nextLine();

            System.out.print("Enter your content to append: ");
            String content = scan.nextLine() + "\n";
            try {
                FileWriter fw = new FileWriter(path + File.separator + fileList[option], true);
                fw.append(content);
                fw.flush();
            } catch (IOException e) { throw new RuntimeException(e); }

            System.out.println();
            System.out.println("After modification...");
            try {
                FileReader fr = new FileReader(path + File.separator + fileList[option]);
                BufferedReader br = new BufferedReader(fr);
                while(br.ready()) {
                    System.out.print(br.readLine());
                    System.out.println();
                }
            } catch (IOException e) { throw new RuntimeException(e); }

        }
    }

    private static void renameFile() {
        File file = new File(path);
        int option = -1;
        String[] fileList = file.list();
        if (fileList == null || fileList.length == 0)
            System.out.println("empty folder");
        else {
            for (int i = 0; i < fileList.length; i++) {
                System.out.println(i + 1 + ". " + fileList[i]);
            }
            System.out.print("Enter file number to rename: ");
            option = scan.nextInt() - 1;
            scan.nextLine();
            File original = new File(path + File.separator + fileList[option]);
            String ext = extension(fileList[option]);
            System.out.print("Enter the new file name: ");
            String newName = scan.next();
            File dummy = new File(path + File.separator + newName + ext);
            if(original.renameTo(dummy)) System.out.println("\nFile renamed");
            else System.out.println("\nFile not renamed");

        }
    }

    private static void deleteFile() {
        File file = new File(path);
        int option = -1;
        String[] fileList = file.list();
        if (fileList == null || fileList.length == 0)
            System.out.println("empty folder");
        else {
            for (int i = 0; i < fileList.length; i++) {
                System.out.println(i + 1 + ". " + fileList[i]);
            }
            System.out.print("Enter file number to delete: ");
            option = scan.nextInt() - 1;
            scan.nextLine();
            File delFile = new File(path + File.separator + fileList[option]);
            if(delFile.delete()) System.out.println(fileList[option] + " file deleted");
            else System.out.println(fileList[option] + " file not deleted");
        }
    }

    private static void moveFile() {
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

    private static void displayFiles() {
        File file = new File(path);
        String[] fileList = file.list();
        if (fileList == null || fileList.length == 0)
            System.out.println("empty folder");
        else {
            for (int i = 0; i < fileList.length; i++) {
                System.out.println(i + 1 + ". " + fileList[i] + " => [" + file.getPath() + File.separator + fileList[i] + "]");
            }
        }
    }

    public static void display() {
        System.out.println("\nSelect the option which you want to perform.");
        System.out.println("1. Create files");
        System.out.println("2. Add content");
        System.out.println("3. Show details");
        System.out.println("4. Modify content");
        System.out.println("5. Append content");
        System.out.println("6. Rename File");
        System.out.println("7. Delete File");
        System.out.println("8. Move File");
        System.out.println("9. Display all files");
        System.out.println("10. Exit");
    }

    public static void execute() {
        start();
        while(true) {
            display();
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    createFiles();
                    break;
                case 2:
                    chooseFileToWrite();
                    break;
                case 3:
                    chooseFileToShow();
                    break;
                case 4:
                    modifyAndShowDetails();
                    break;
                case 5:
                    appendContent();
                    break;
                case 6:
                    renameFile();
                    break;
                case 7:
                    deleteFile();
                    break;
                case 8:
                    moveFile();     // pending (excel)
                    break;
                case 9:
                    displayFiles();
                    break;
                case 10:
                    System.out.println("Exited...");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid option.");
            }
        }
    }

    public static void main(String[] args) {
        execute();
    }
}
