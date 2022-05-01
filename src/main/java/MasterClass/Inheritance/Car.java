package MasterClass.Inheritance;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear += currentGear;
        System.out.println("Car.changeGear(): change to " + this.currentGear + "gear");

    }

    public void changeVelocity(int speed, int direction) {
        moving(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
    }

    @Override
    public void stop() {
        super.stop();
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
