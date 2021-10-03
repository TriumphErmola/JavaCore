package multithreading;

public class Ex4 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("Moy_potok");
//        myThread5.setPriority(Thread.MAX_PRIORITY);
        myThread5.setPriority(10);
        System.out.println("Name of myThread5 = " + myThread5.getName() +
                " Priority myThread5 = " + myThread5.getPriority());

    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Privet");
    }
}
