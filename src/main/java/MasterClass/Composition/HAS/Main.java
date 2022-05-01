package MasterClass.Composition.HAS;

public class Main {
    public static void main(String[] args) {


        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27inch", "Acer", 27, new Resolution(25, 25));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 6, 4, "v2.44");

        PC pc = new PC(theCase, monitor, motherboard);
        pc.getMonitor().drawPixelAt(125, 30, "Black");
        pc.getTheCase().pressPowerButton();
        pc.getMotherboard().loadProgram("Steam");
        String model = pc.getMotherboard().getModel();
        System.out.println(model);


    }
}
