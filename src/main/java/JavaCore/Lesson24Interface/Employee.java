package JavaCore.Lesson24Interface;

public class Employee {

    public static void main(String[] args) {

        HelpAble helpAble = new Plowec();
        SwimAble swimAble = new Plowec();
        System.out.println(helpAble.a);
        helpAble.pomosh();
        helpAble.tushitpojar("lom");
    }

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
    public void tushitpojar(String b) {
        System.out.println("Спасатель тушит пожар c помощью : "+b);
    }
}

class Plowec extends Employee implements SwimAble, HelpAble {

    void grebet() {

    }

    @Override
    public void swim() {
        System.out.println("Пловец плывёт");
    }


    public void pomosh() {
        System.out.println("Пловец оказывает помощь");
    }


    public void tushitpojar(String s) {
        System.out.println("Пловец тушит пожар c помощью : "+s);

    }
}
