package Core.Lesson13Switch;

public class Test2 {

    public static void main(String[] args) {
        final int a = 11;
        final int b = 25;

        switch (11*25) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("rabota do 17");
                break;
            case 6:
                System.out.println("rabota do 14");
                break;
            case 7:
                System.out.println("vihodnoy den");
                break;
            case a * b:
                System.out.println("a*b");
                break;
            default:
                System.out.println("nevernie infa");
        }
    }
}
