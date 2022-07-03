package MasterClass.Concurrency.Messanger;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();

    }
}

class Message {
    private String message;
    private boolean isEmpty = true;

    public synchronized String readMessage() {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException exp) {

            }
        }
        isEmpty = true;
        notifyAll();
        return message;

    }

    public synchronized void writeMessage(String message) {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException exp) {

            }
        }
        isEmpty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String messages[] = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };

        Random random = new Random();

        for (int i = 0; i < messages.length; i++) {
            message.writeMessage(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException exp) {

            }
        }
        message.writeMessage("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for (String lateMessage = message.readMessage(); !lateMessage.equals("Finished");
             lateMessage = message.readMessage()) {
            System.out.println(lateMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException exp) {

            }
        }
    }
}































