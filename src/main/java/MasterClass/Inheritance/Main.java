package MasterClass.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Cat", 1, 1, 1, 10);
        Dog dog = new Dog("Bobik", 2, 15, 2, 4, 2, 3, "gav-gav");
        animal1.eat();
        animal1.move();
        dog.eat();
        dog.move();
        dog.chew();
    }
}
