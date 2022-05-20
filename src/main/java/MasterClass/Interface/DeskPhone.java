package MasterClass.Interface;

public class DeskPhone implements ITelephone {

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    private int myNumber;
    private boolean isRinging;

    @Override
    public void powerOn() {
        System.out.println("Никаких действий не принято, настольный телефон не имеет кнопки питания");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Сейчас звонит : " + phoneNumber + " на настольнйы телефон");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Ответ на стационарный телефон");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
