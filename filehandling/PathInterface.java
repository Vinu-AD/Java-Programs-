package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathInterface {
    public static void main(String[] args) {

//        Path path = Paths.get("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\New folder\\newfile.txt");
//        System.out.println(path.getFileName());
//        System.out.println(path.getParent());
//        System.out.println(path.getRoot());

//        System.out.println(path.toAbsolutePath());
//        System.out.println(path.normalize());



//        Path source = Paths.get("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\Paths\\file2.txt");
//        Path target = Paths.get("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\New folder\\file2.txt");
//        if(Files.exists(source)) System.out.println("exit s");
//        if(Files.exists(target)) System.out.println("exit t");
//        try {
////            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
//            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
//            System.out.println("Copied");
//        } catch (IOException e) {
//            System.out.println(e);
//        }


//        System.out.println(path.resolve("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\Paths"));
//        System.out.println(path.startsWith("E:\\"));
//        System.out.println(path.endsWith("face"));

//        Path path = Paths.get("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\Paths\\fileData.txt");
        Path path = Paths.get("E:\\FullStack Course\\Java\\FileHandling\\Path Interface\\Paths");
        try {
            Files.delete(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
