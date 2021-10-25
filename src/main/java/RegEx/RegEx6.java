package RegEx;

import java.util.regex.Pattern;

public class RegEx6 {
    void checkIp(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip+" is OK? "+ Pattern.matches(regex,ip));
    }


    public static void main(String[] args) {
        String ip1="255.38.192.99";
        String ip2="182.262.192.99";
        RegEx6 regEx6 = new RegEx6();
        regEx6.checkIp(ip1);
        regEx6.checkIp(ip2);

    }
}
