package Core.Lesson26EqualsToString;

public class Test7 {
    public static void main(String[] args) {
        Animal animal = new Mammal();
    }
}

class Animal {
    Animal() {
        System.out.println("Constr Animal");
    }

    static {
        System.out.println("static init in Animal");
    }

    {
        System.out.println("non-static init Animal");
    }
}

class Mammal extends Lion {
    Mammal() {
        System.out.println("Constr Mammal");
    }

    static {
        System.out.println("static init in Mammal");
    }

    {
        System.out.println("non-static init Mammal");
    }
}

class Lion extends Animal {
    Lion() {
        System.out.println("Constr Lion");
    }

    static {
        System.out.println("static init in Lion");
    }

    {
        System.out.println("non-static init Lion");
    }
}