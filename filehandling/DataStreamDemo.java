package filehandling;

import java.io.*;
import java.util.Arrays;

public class DataStreamDemo {

    private static void writeData() {
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\FullStack Course\\Java\\FileHandling\\Serialization\\DataObjects.txt"))) {
            dos.writeByte(10);
            dos.writeBytes("97");
            dos.writeShort(100);
            dos.writeInt(1000);
            dos.writeLong(5574804);
            dos.writeFloat(4852034.8f);
            dos.writeDouble(9752.525);
            dos.writeChar('V');
            dos.writeBoolean(true);
            dos.writeChars("Vinu");
            dos.writeUTF("I am a full stack developer");
            dos.flush();
        }
        catch (IOException e) { System.out.println(e); }
    }

    private static void readData() {
        try(DataInputStream dos = new DataInputStream(new FileInputStream("E:\\FullStack Course\\Java\\FileHandling\\Serialization\\DataObjects.txt"))) {
            System.out.println("Byte: " + dos.readByte());
            System.out.println("Bytes: " + Arrays.toString(dos.readNBytes(2)));
            System.out.println("Short: " + dos.readShort());
            System.out.println("Int: " + dos.readInt());
            System.out.println("Long: " + dos.readLong());
            System.out.println("Float: " + dos.readFloat());
            System.out.println("Double: " + dos.readDouble());
            System.out.println("Char: " + dos.readChar());
            System.out.println("Boolean: " + dos.readBoolean());

            System.out.print("Chars: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(dos.readChar());
            }
            System.out.println();

            System.out.println("String: " + dos.readUTF());
        }
        catch (IOException e) { System.out.println(e); }

    }

    public static void main(String[] args) {
        writeData();
        readData();
    }
}
