package MasterClass.KeywordsandExpressions;

public class Test2 {

    public static void otobrajenieRaitinga(String playerName, int positonHighScoreTable) {
        System.out.println("Игроку : " + playerName + ", удалось достигнуть позиции : " + positonHighScoreTable + "!");
    }

    public static int ItogPoOchkam(int playerScore) {
        if (playerScore > 1000) {
            System.out.println("1 место");
            return 1;

        } else if (playerScore > 500 && playerScore < 1000) {
            System.out.println("2 место");
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            System.out.println("3 место");
            return 3;
        } else {
            System.out.println("В тройку лидеров не зашёл игрок.");
            return -1;
        }
    }

    public static void main(String[] args) {
        int kolivhestvoBallov = ItogPoOchkam(1500);
        otobrajenieRaitinga("Andrey", kolivhestvoBallov);

        kolivhestvoBallov = ItogPoOchkam(600);
        otobrajenieRaitinga("Egor", kolivhestvoBallov);

        kolivhestvoBallov = ItogPoOchkam(450);
        otobrajenieRaitinga("Victor", kolivhestvoBallov);

        kolivhestvoBallov = ItogPoOchkam(100);
        otobrajenieRaitinga("Oleg", kolivhestvoBallov);


    }
}
