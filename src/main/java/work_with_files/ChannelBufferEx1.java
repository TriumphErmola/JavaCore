package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
             FileChannel chanel = file.getChannel();) {

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stix = new StringBuilder();

            int byteRead = chanel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read : " + byteRead);

                buffer.flip();

                while (buffer.hasRemaining()) {
                    stix.append((char) buffer.get());
                }

                buffer.clear();
                byteRead = chanel.read(buffer);
            }
            System.out.println(stix);

            String text = "\nThere are only two ways to live your life. " +
                    "One is as though nothing is a miracle. " +
                    "The other is as though everything is.";

//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            chanel.write(buffer2);

            ByteBuffer buffer2= ByteBuffer.wrap(text.getBytes());
            chanel.write(buffer2);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
