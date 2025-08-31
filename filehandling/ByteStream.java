package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

    public static void readFile() {

        String path1 = "\\E:\\FullStack Course\\Java\\FileHandling\\file1.txt";
        try{
            FileInputStream fis1 = new FileInputStream(path1);
            int data;
            while((data = fis1.read()) != -1) {
                System.out.print((char)data);
            }
        }
        catch (FileNotFoundException f) {
            System.out.println(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Text Copy Process Completed");
        }

    }

    public static void copyFile() {

        String path1 = "\\E:\\FullStack Course\\Java\\FileHandling\\file1.txt";
        String path2 = "\\E:\\FullStack Course\\Java\\FileHandling\\file2.txt";
        String path3 = "\\E:\\FullStack Course\\Java\\FileHandling\\file3.txt";
        try{
            FileInputStream fis1 = new FileInputStream(path1);
            FileInputStream fis2 = new FileInputStream(path2);
            FileOutputStream fos = new FileOutputStream(path3);
            int data;
            while((data = fis1.read()) != -1) {
                fos.write(data);
            }
            fos.write(10);
            while((data = fis2.read()) != -1) {
                fos.write(data);
            }
        }
        catch (FileNotFoundException f) {
            System.out.println(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Text Copy Process Completed");
        }

    }
    public static void copyImage() {
        String path1 = "\\E:\\FullStack Course\\Java\\FileHandling\\img1.jpg";
        String path2 = "\\E:\\FullStack Course\\Java\\FileHandling\\img2.jpg";
        String path3 = "\\E:\\FullStack Course\\Java\\FileHandling\\img3.jpg";
        try{
            FileInputStream fis1 = new FileInputStream(path1);
            FileInputStream fis2 = new FileInputStream(path2);
            FileOutputStream fos = new FileOutputStream(path3,true);
            int data;
            while((data = fis1.read()) != -1) {
                fos.write(data);
            }
            fos.write(10);
            fos.write(32);
            while((data = fis2.read()) != -1) {
                fos.write(data);
            }
        }
        catch (FileNotFoundException f) {
            System.err.println(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Image Copy Process Completed");
        }
    }
    public static void copyAudio() {
        String path1 = "\\E:\\FullStack Course\\Java\\FileHandling\\Aud1.mp3";
//        String path2 = "\\E:\\FullStack Course\\Java\\FileHandling\\Aud2.mp3";
        String path3 = "\\E:\\FullStack Course\\Java\\FileHandling\\Aud2.mp3";
        try{
            FileInputStream fis1 = new FileInputStream(path1);
//            FileInputStream fis2 = new FileInputStream(path2);
            FileOutputStream fos = new FileOutputStream(path3);
            int data;
            while((data = fis1.read()) != -1) {
                fos.write(data);
            }
//            while((data = fis2.read()) != -1) {
//                fos.write(data);
//            }
        }
        catch (FileNotFoundException f) {
            System.err.println(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Audio Copy Process Completed");
        }
    }
    public static void copyVideo() {
        String path1 = "\\E:\\FullStack Course\\Java\\FileHandling\\Vid1.mp4";
        String path2 = "\\E:\\FullStack Course\\Java\\FileHandling\\Aud1.mp3";
        String path3 = "\\E:\\FullStack Course\\Java\\FileHandling\\Vid3.mp4";
        try{
            FileInputStream fis1 = new FileInputStream(path1);
            FileInputStream fis2 = new FileInputStream(path2);
            FileOutputStream fos = new FileOutputStream(path3, true);
            int data;
            while((data = fis1.read()) != -1) {
                fos.write(data);
            }
            int data1;
            while((data1 = fis2.read()) != -1) {
                fos.write(data1);
            }
        }
        catch (FileNotFoundException f) {
            System.err.println(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Video Copy Process Completed");
        }
    }

    public static void main(String[] args) {
        readFile();
//        copyFile();
//        copyImage();  // not working
//        copyAudio();  // working
//        copyVideo();    // not working

    }
}
