package MasterClass.ControlFlowStatement.Switch;

public class Test1 {
    public static void main(String[] args) {
        int value = 1;
        switch (value) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("3 or 4 or 5");
                break;
            default:
                System.out.println("not 1 or 2");
        }
        System.out.println("kek");

    }
}
