package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {

        String s
                = "Ivanov Vasiliy,Russiya,Moscow,Lenin street,51,Flat 48," +
                " email: xramovic@yandex.ru,Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Kristina,Ukraine,Kyev,Stalin street,12,Flat 65," +
                " email: tinderhore@mail.ru,Postcode: BCA329, Phone Number: +987654432;" +
                "Brus Blashkovec,USA,HollyWood,Lenin street,51,Flat 48," +
                " email: chuckkek@gmail.com,Postcode: USA21, Phone Number: +148882144.";

//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{9}");
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
