package MasterClass.KeywordsandExpressions;

public class Test4 {
    public static void main(String[] args) {
//        int newScore = calculateScore("Andrey", 500);
//        System.out.println("new score : " + newScore);
//        int newScore1 = calculateScore(1500);
//        System.out.println("new score : " + newScore1);
        calculateScore("Andrey", 150);
        calculateScore(250);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player");
        return 0;
    }


}
