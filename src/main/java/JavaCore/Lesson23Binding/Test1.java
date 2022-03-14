package JavaCore.Lesson23Binding;

public class Test1 {
    void abc(Animal a) {
        System.out.println("A");
    }
    void abc(Maus m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Animal animal1 = new Maus();
        test1.abc(animal1);
        animal1.getName();

    }

}

class Animal {
    void getName() {
        System.out.println("Animal");
    }
}

class Maus extends Animal {
    void getName() {
        System.out.println("Maus");
    }
}
