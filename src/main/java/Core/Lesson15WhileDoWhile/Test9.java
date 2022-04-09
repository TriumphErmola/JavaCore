package Core.Lesson15WhileDoWhile;

public class Test9 {
    public static void main(String[] args) {

        int chas = 0;
        OUTHER:
        do {
            int minuta = 0;
            INNER:
            while (minuta < 60) {
                if(minuta==20){
                    break OUTHER;
                }
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
            chas++;
        } while (chas < 24);
    }
}
