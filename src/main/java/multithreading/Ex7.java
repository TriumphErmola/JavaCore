package multithreading;

public class Ex7 {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 5;i>0;i--){
            System.out.println(i);
            Thread.sleep(2000);
        }
        System.out.println("Smaj meny i poehali");

    }
}
