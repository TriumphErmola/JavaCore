package MasterClass.Autoboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] stringArray = new String[10];
        int[] intArray = new int[15];
        double[] doubleArray = {1.2, 1.5, 1.9};

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(1490));

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i = 0;i<=20;i++){
            integerArrayList.add(Integer.valueOf(i));
            System.out.println(i);
        }

        for(int i = 0;i<=20;i++){
            System.out.println(i +" --> "+ integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 88; //Integer.valueOf(88);


    }
}

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
