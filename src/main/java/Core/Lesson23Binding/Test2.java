package Core.Lesson23Binding;

public class Test2 {
    public static void main(String[] args) {
        Mauss a = new Mauss();
        a.showInfOAboutAnimal();
        a.showInfOAboutMouse();
    }

}

class Animall{
     String showName(){
        return "some Animall";
    }

    void showInfOAboutAnimal(){
        System.out.println("Name of animal : "+ showName());
    }
}

class Mauss extends Animall{

     void showInfOAboutMouse(){
        System.out.println("Name of mouse : "+ showName());
    }

     String showName(){
        return "Jerry";
    }

}
