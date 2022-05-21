package MasterClass.Interface;

public class MobilePhone implements ITelephone {
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Мобильный телефон включился");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Сейчас звонит : " + phoneNumber + " на мобильный телефон");
        } else{
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Ответ на мобильный телефон");
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
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
