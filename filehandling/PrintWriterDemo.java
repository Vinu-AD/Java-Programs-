package filehandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        try {
        PrintWriter pw = new PrintWriter("E:\\FullStack Course\\Java\\FileHandling\\PrintWriter\\newFile.txt");
            pw.println("Hello Everyone, ");
//            pw.write('I');
            pw.write("Hello, ");
            pw.printf("I'm %s born in %d\n", "Vinu", 2003);
            pw.println("I am a java fullstack developer. ");
            pw.print("I have a strong foundation in Java and Java core ");
            pw.print("and also in Java Springboot framework.");

            PrintWriter pwc = new PrintWriter(System.out);
            pwc.println("Console content");
            pwc.println("Second line Console content");

            pwc.flush();

            pw.flush();
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            PrintWriter pw = null;
            try {
                pw = new PrintWriter(new FileWriter("E:\\FullStack Course\\Java\\FileHandling\\PrintWriter\\newFile.txt", true));
                e.printStackTrace(pw);
                pw.flush();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
