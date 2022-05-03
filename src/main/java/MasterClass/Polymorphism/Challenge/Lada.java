package MasterClass.Polymorphism.Challenge;

public class Lada extends Car{

    public Lada(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Lada -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Lada -> accelerate()";
    }

    @Override
    public String brake() {
        return "Lada -> brake()";
    }
}
