package JavaCore.Lesson24Interface;

public class Test4 {
    public static void main(String[] args) {

        JumpAble j1 = new Human();
        JumpAble j2 = new Animal();
        j1.jump();
        j2.jump();
    }
}

class Human implements JumpAble {

    @Override
    public void jump() {
        System.out.println("Human jump");
    }
}

class Animal implements JumpAble {

    @Override
    public void jump() {
        System.out.println("Animal jump");
    }
}

interface JumpAble {

    void jump();

}