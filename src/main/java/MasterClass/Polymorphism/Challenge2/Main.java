package MasterClass.Polymorphism.Challenge2;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.99, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.55);
        hamburger.addHamburgerAddition2("Lettuce", 1.55);
        hamburger.addHamburgerAddition3("Chesse", 0.75);
        hamburger.addHamburgerAddition4("Bacon", 2.55);
        System.out.println("Total burger price : " + hamburger.itemizeHamburger());
        System.out.println("===============");
        HealthyBurger healthyBurger = new HealthyBurger("Not meat",5.55);
        healthyBurger.addHamburgerAddition1("Chesse",1.44);
        healthyBurger.addHealthyAddition1("Lentils",5.55);
        System.out.println("Total burger price : " + healthyBurger.itemizeHamburger());

    }
}
