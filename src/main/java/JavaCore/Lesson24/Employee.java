package JavaCore.Lesson24;

public class Employee {

    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("принимает пищу");
    }

    void sleep() {
        System.out.println("отдыхает");
    }

}

class Spasatel extends Employee implements HelpAble {

    void drive() {

    }


    @Override
    public void pomosh() {
        System.out.println("Спасатель оказывает помощь");

    }

    @Override
    public void tushitpojar() {
        System.out.println("Спасатель тушит пожар");
    }
}

class Plowec extends Employee implements SwimAble, HelpAble {

    void grebet() {

    }

    @Override
    public void swim() {
        System.out.println("Пловец плывёт");
    }

    @Override
    public void pomosh() {
        System.out.println("Пловец оказывает помощь");
    }

    @Override
    public void tushitpojar() {
        System.out.println("Пловец тушит пожар");

    }
}
