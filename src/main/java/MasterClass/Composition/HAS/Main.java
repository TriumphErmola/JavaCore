package MasterClass.Composition.HAS;

public class Main {
    public static void main(String[] args) {


        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27inch", "Acer", 27, new Resolution(25, 25));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 6, 4, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.powerUp();


    }
}
