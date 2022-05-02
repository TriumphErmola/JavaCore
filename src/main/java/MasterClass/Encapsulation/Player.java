package MasterClass.Encapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void lostHealth(int damage){
        this.health = this.health-damage;
        if(this.health <=0){
            System.out.println("player knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }


}
