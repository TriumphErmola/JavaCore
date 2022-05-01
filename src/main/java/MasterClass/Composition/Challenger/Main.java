package MasterClass.Composition.Challenger;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, "Red");
        Bed bed = new Bed("Modern", 2, 15, 20, 30);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("AndreyBedRoom", wall1, wall2, wall3, wall4, ceiling, lamp, bed);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }
}
