package nestedClasses.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        Car.Engine e = new Car.Engine(250);
        System.out.println(e.horsePower);
    }

    interface i {

    }

    @Override
    public String toString() {
        return "My car : {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My engine : {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

}

class Test {
    public static void main(String[] args) {
        Car.Engine engineCar = new Car.Engine(256);
        System.out.println(engineCar);
        Car car = new Car("red", 2, engineCar);
        System.out.println(car);
    }
}
