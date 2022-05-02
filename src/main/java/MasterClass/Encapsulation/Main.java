package MasterClass.Encapsulation;

public class Main {
    public static void main(String[] args) {

//        Player player1 = new Player();
//        player1.name = "Andrey";
//        player1.health = 25;
//        player1.weapon = "sword";
//
//        int damage = 10;
//
//        player1.lostHealth(damage);
//        System.out.println("remaining helth = "+player1.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Andrey",250,"sword");
        System.out.println("Initial health is "+player.getHitPoints());
    }
}
