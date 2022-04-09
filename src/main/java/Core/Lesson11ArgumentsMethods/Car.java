package Core.Lesson11ArgumentsMethods;

public class Car {
    String color;
    String engine;
    int doorcount;

    public Car(String color, String engine, int doorcount) {
        this.color = color;
        this.engine = engine;
        this.doorcount = doorcount;
    }

}


class CarTest {
//    public static int method1(Car car) {
//        int c = car.doorcount + 5;
//        return c;
//    }

    void changedoorcount(Car car, int doorcount) {
        car.doorcount = doorcount;
    }

    void changeColor(Car car1, Car car2) {
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
    }

    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        Car car1 = new Car("black", "V8", 2);
        Car car2 = new Car("red", "V8", 2);
        carTest.changedoorcount(car1, 5);
        System.out.println(car1.doorcount);
        carTest.changeColor(car1, car2);
        System.out.println(car1.color);
        System.out.println(car2.color);


    }
}
