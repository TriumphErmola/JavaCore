package MasterClass.Encapsulation;

public class EnhancedPlayer {

    private String name;
    private int hitPoints =100;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;

        if(hitPoints >0 && hitPoints <=100){
            hitPoints = hitPoints;
        }

        weapon = weapon;
    }

    public void loseHealth(int damage){
        hitPoints = hitPoints -damage;
        if(hitPoints <=0){
            System.out.println("player knocked out");
        }
    }
    public int getHitPoints(){
        return hitPoints;
    }
}
