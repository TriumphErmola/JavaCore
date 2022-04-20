package MasterClass.ControlFlowStatement.Switch;

public class Test2 {
    public static void main(String[] args) {

        char charVariable = 'E';
        switch (charVariable) {
            case 'A': {
                System.out.println("found - A");
                break;
            }
            case 'B': {
                System.out.println("found - B");
                break;
            }
            case 'C': {
                System.out.println("found - C");
                break;
            }
            case 'D': {
                System.out.println("found - D");
                break;
            }
            case 'E': {
                System.out.println("found - E");
                break;
            }
            default: {
                System.out.println("Char not found");
            }

        }
    }
}
