package RegEx;

import java.util.Arrays;

public class RegEx3 {
    public static void main(String[] args) {
        String s1
                = "Ivanov Vasiliy,Russiya,Moscow,Lenin street,51,Flat 48," +
                " email: xramovic@yandex.ru,Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Kristina,Ukraine,Kyev,Stalin street,12,Flat 65," +
                " email: tinderhore@mail.ru,Postcode: BCA329, Phone Number: +987654432;" +
                "Brus Blashkovec,USA,HollyWood,Lenin street,51,Flat 48," +
                " email: chuckkek@gmail.com,Postcode: USA21, Phone Number: +148882144.";
        String s2 = "chuckkek@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String[] array = s1.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
