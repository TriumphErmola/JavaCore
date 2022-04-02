package JavaCore.Lesson12IfElse;

public class Test2 {
    public static void main(String[] args) {
        Car car1 = new Car(1, 5);
        Car car2 = new Car(2, 4);
        if (car1.engine > car2.engine) {
            if (car1.doorCount > car2.doorCount) {
                System.out.println("Мощность мотора и кол-во дверей у первой машины больше");
            } else {
                System.out.println("Мощность мотора у первой машины больше,но количество дверей меньше");
            }
        } else {
            System.out.println("Мощность мотора  у первой машины меньше");

        }
    }
}

class Car {
    int engine;
    int doorCount;

    public Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}
