package MasterClass.Abstraction;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Sharik");

        dog.eat();
        dog.breathe();
        dog.getName();

        System.out.println("===============");

        Parrot parrot = new Parrot("Kurlic");
        parrot.eat();
        parrot.breathe();
        parrot.getName();

        System.out.println("===============");

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
