package JavaCore.Lesson25Necromorphs;

public class Test3 {
    public static void main(String[] args) {
        Employees emp1 = new Stomatolog();
        Employees emp2 = new Mentor();
        Employees emp3 = new Voditel();
        Employees emp4 = new Employees();
        Stomatolog st1 = (Stomatolog) emp1;
        Voditel vod1 = (Voditel) emp3;
        System.out.println(st1.spesialization);
        System.out.println(vod1.carName);
        System.out.println(((Stomatolog) emp1).spesialization);

        HelpAble h1 = new Stomatolog();
        h1.help();
        System.out.println(((Stomatolog) h1).spesialization);
        ((Stomatolog) h1).lechit();

        Employees[] array = {emp1, emp2, emp3, emp4};

        for (Employees emp : array) {
            if (emp instanceof Voditel) {
                System.out.println(((Voditel) emp).carName);
                ((Voditel) emp).voditCar();
            }
        }

    }
}


class Employees {
    double salary = 100;
    String name = "Andrey";
    int age;
    int experience;

    void eat() {
        System.out.println("Employees kuchac");
    }

    void sleep() {
        System.out.println("Employees otdihaet");
    }
}

class Stomatolog extends Employees implements HelpAble {
    String spesialization = "dantist";

    void lechit() {
        System.out.println("Stomatolog lechit");
    }

    @Override
    public void help() {
        System.out.println("Stomatolog okazivaet pomosh");
    }
}

class Mentor extends Employees {
    int students;

    void uchit() {
        System.out.println("Mentor uchit");
    }
}

class Voditel extends Employees {
    String carName = "PANAMERA";

    void voditCar() {
        System.out.println("Voditel vodit");
    }
}