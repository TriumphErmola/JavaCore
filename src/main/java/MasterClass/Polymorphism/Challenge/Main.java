package MasterClass.Polymorphism.Challenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2, "Solaris");
        Mitsubishi mitsubishi = new Mitsubishi(4, "Lancer");
        Lada lada = new Lada(2,"Priora");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("==================");
        System.out.println(mitsubishi.getCylinders());
        System.out.println(mitsubishi.getName());
        System.out.println(mitsubishi.getWheels());
        System.out.println("==================");
        System.out.println(lada.startEngine());
        System.out.println(lada.accelerate());
        System.out.println(lada.brake());
        System.out.println(lada.getName());
        System.out.println(lada.getCylinders());
        System.out.println(lada.getCylinders());
        System.out.println(lada.isEngine());
        System.out.println("==================");


    }
}
