package Core.Lesson26EqualsToString;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        Car c1 = new Car("Red", "V8");
        Car c2 = new Car("Black", "V6");
        Car c3 = new Car("Blue", "V4");
        ArrayList<Car> arrayList = new ArrayList<>();
        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(c3);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        Car c4 = new Car("Blue", "V4");
        arrayList.add(c4);
        System.out.println(arrayList.contains(c4));
        System.out.println(c4);
        System.out.println(c2);
        System.out.println(c1);
        System.out.println(arrayList);
    }
}

class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        } else {
            return false;
        }
    }

    public String toString() {
        return "Машина цвета - " + color + " Объём двигателя - " + engine;
    }
}
