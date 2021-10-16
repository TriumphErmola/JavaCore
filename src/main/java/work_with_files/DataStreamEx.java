package work_with_files;

import java.io.*;

public class DataStreamEx {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(
                new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(
                     new FileInputStream("my_test.bin"));
        ) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(512);
            outputStream.writeLong(121_211_251_212L);
            outputStream.writeFloat(12.21F);
            outputStream.writeDouble(62.44);
            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
