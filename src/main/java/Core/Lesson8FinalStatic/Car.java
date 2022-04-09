package Core.Lesson8FinalStatic;

public class Car {

    String color = "blue";
    String engine = "v6";

}

class Human {
    String name = "Ivan";
    final Car car = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.car.engine="v8";
        System.out.println(h1.car.engine);

    }
}


