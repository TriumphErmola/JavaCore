package MasterClass.KeywordsandExpressions;

public class Test1 {
    public static void main(String[] args) {
        calculatedScore(false, 250, 21, 1500);
    }


    public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score : " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }
}
