package Core.Lesson25Necromorphs;

public class Test2 {
    public static void main(String[] args) {
        JumpAble j = new Human();
        Man m = new Man();
        Car c = new Car();
        if (j instanceof JumpAble) {
            System.out.println("J is jumpable");
        }
        if (m instanceof Human) {
            System.out.println("m is Human");
        }
//        if (c instanceof Human) {
//            System.out.println("m is Human");
//        }
        if (c instanceof JumpAble) {
            System.out.println("J is jumpable");
        }
    }
}

interface JumpAble {

}

class Human implements JumpAble {

}

class Man extends Human {

}

class Car {

}
