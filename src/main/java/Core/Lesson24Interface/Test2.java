package Core.Lesson24Interface;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStooron);
        f1.plochad1();
        f1.plochad();
        f1.perimeter();
    }

}

abstract class Figura {

    int kolichestvoStooron = 0;

    public void showFigure() {
        System.out.println("Eto figure");
    }

    abstract void perimeter();


    abstract void plochad();

    static void plochad1() {
        System.out.println("Compile time binding");
    }

    ;

}

class Kvadrat extends Figura {

    int storona = 10;
    int kolichestvoStooron = 4;

    @Override
     void perimeter() {
        int P = storona * kolichestvoStooron;
        System.out.println("Периметр квадрата : " + P);
    }




    @Override
    void plochad() {
        int S = storona * storona;
        System.out.println("Площадь квадрата : " + S);
    }
}

class Prymougolnik extends Figura {

    int storona1 = 8;
    int storona2 = 4;
    int kolichestvoStooron = 4;

    @Override
    void perimeter() {
        int P = (storona1 + storona2) * 2;
        System.out.println("Периметр прямоугольника : " + P);
    }


    @Override
    void plochad() {
        int S = storona1 * storona2;
        System.out.println("Площадь прямоугольника : " + S);
    }

}

class Okrujnost extends Figura {

    int radious = 3;


    @Override
    void perimeter() {

        System.out.println("Периметр окружности : " + 2 * 3.14 * radious);
    }

    @Override
    void plochad() {
        System.out.println("Площадь прямоугольника : " + 3.14 * radious * radious);
    }
}
