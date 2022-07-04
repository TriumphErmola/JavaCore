package MasterClass.Concurrency.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static MasterClass.Concurrency.Consumer.Main.EOF;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();
        MyProducer producer = new MyProducer(buffer, ThreadColors.ANSI_GREEN);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColors.ANSI_BLUE);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColors.ANSI_RED);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();

    }

}

class MyProducer implements Runnable {
    private List<String> buffer;
    private String color;

    public MyProducer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] nums = {"1","2","3","4","5","6","7","8","9"};
        for (String num : nums) {
            try {
                System.out.println(color + " Adding..." + num);
                synchronized (buffer) {
                    buffer.add(num);
                }
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException exp) {
                System.out.println("Producer was interrupted");
            }
        }
        System.out.println(color + " Adding EOF and exiting...");
        synchronized (buffer) {
            buffer.add("EOF");
        }

    }
}

class MyConsumer implements Runnable {
    private List<String> buffer;
    private String color;

    public MyConsumer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (buffer) {
                if (buffer.isEmpty()) {
                    continue;
                }
                if (buffer.get(0).equals(EOF)) {
                    System.out.println(color + "Exiting");
                    break;
                } else {
                    System.out.println(color + "Removed" + buffer.remove(0));
                }
            }
        }
    }
}
