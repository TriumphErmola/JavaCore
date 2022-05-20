package MasterClass.Interface;

public class Main {
    public static void main(String[] args) {

        ITelephone andreyTelephone = new DeskPhone(652220);
        andreyTelephone.powerOn();
        andreyTelephone.callPhone(652220);
        andreyTelephone.answer();
    }
}
