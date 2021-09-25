package nestedClasses.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "My car : {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
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
        Car car = new Car("Black", 4);
        Car.Engine engine = car.new Engine(250);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);
//        Car.Engine engine1 = new Car("Red", 2).new Engine(200);
    }
}

