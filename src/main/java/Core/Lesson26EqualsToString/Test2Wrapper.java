package Core.Lesson26EqualsToString;

import java.util.ArrayList;

public class Test2Wrapper {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        int a = arrayList.get(0);
        Long l = 50L;

        String s1 = "50";
        int i1 = Integer.parseInt(s1);
        double d1 = Double.parseDouble(s1);
        System.out.println(d1);
        String s2 = "true";
        boolean b1 = Boolean.parseBoolean(s2);
        String s3 = "3.14";

        Integer i3 = Integer.valueOf(10);
        System.out.println(i3);
        Double d2 = Double.valueOf(s3);
        System.out.println(d2);
        Byte b10 = (byte) 10;
        Integer int10 = 5;
    }
}
