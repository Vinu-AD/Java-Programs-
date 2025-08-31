package filehandling;

import java.io.*;

public class CharStream {
    public static void main(String[] args) {
//        readFile();
//        writeFile();
//        bufferedReadFile();
        bufferedWriteFile();

    }

    public static void readFile() {
        String path = "\\E:\\FullStack Course\\Java\\FileHandling\\file1.txt";
        try {
            FileReader fr = new FileReader(path);
            while(fr.ready()) {
                System.out.print((char)fr.read());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFile() {
        String path1 = "\\E:\\FullStack Course\\Java\\FileHandling\\file1.txt";
        String path2 = "\\E:\\FullStack Course\\Java\\FileHandling\\newFile1.txt";
        try {
            FileReader fr = new FileReader(path1);
            FileWriter fw = new FileWriter(path2, true);
//            fw.write("Hi I am 1st programmer");
            while(fr.ready()) {
                fw.write(fr.read());
            }
            int i = 21;
            while(i <= 30) {
                fw.write((char)10);
                fw.write(String.valueOf(i++));
//                fw.write((char)i++);
            }
            fw.append("====================== End of the line ===============");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void bufferedReadFile() {
        String path = "\\E:\\FullStack Course\\Java\\FileHandling\\buffile1.txt\\";
        try {
            FileReader fr = new FileReader(path);
            BufferedReader bw = new BufferedReader(fr);
            while(bw.ready()) {
//                System.out.print((char)bw.read());
                System.out.println(bw.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void bufferedWriteFile() {
        String path = "\\E:\\FullStack Course\\Java\\FileHandling\\buffile1.txt\\";
        try {
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append("Java's contents include its core concepts, like object-oriented programming (OOP) principles (encapsulation, ");
            bw.append("inheritance, polymorphism, abstraction), and key features like multithreading and exception handling. " );
            bw.newLine();
            bw.newLine();
            bw.append("It also encompasses the Java Virtual Machine (JVM), Java Runtime Environment (JRE), and Java Development Kit (JDK)," );
            bw.append("which are fundamental to Java's architecture. ");
            bw.newLine();
            bw.newLine();
            bw.append("Furthermore, Java has a rich set of libraries organized into packages, including the Collections Framework.");
            bw.newLine();
            bw.append("-------------------------------------------------------");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
