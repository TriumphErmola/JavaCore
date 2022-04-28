package MasterClass.Classes;

public class Car {

    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setDoor(int door) {
        this.door = door;
    }

    public int getDoor() {
        return door;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("panamera") || validModel.equals("911")) {
            this.model = model;
        }else {
            this.model="Unknown";
        }
    }

    public String getModel(){
        return model;
    }


}
