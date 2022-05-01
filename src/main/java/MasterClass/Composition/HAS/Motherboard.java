package MasterClass.Composition.HAS;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSloats;
    private int cardSloats;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSloats, int cardSloats, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSloats = ramSloats;
        this.cardSloats = cardSloats;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program "+programName + "is now loading");

    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSloats() {
        return ramSloats;
    }

    public int getCardSloats() {
        return cardSloats;
    }

    public String getBios() {
        return bios;
    }
}
