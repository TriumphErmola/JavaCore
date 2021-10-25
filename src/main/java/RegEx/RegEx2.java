package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABASDASGASDQWEQWABCFGABASGASFabcADAD";
//        Pattern pattern1 = Pattern.compile("ABC");
//        String s1 = "ABDOPAB7OP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");
//        String s1 = "abcd abce abc5aabcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]");
//        String s1 = "abcd abce abc5aabcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");
//        String s1 = "abcd abce abc5aabcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");
//        String s1 = "abcd abce abc5aabcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.");
//        String s1 = "abcd abce abc5aabcg6abch";
//        Pattern pattern1 = Pattern.compile("bch$");
//        String s1 = "abcd a33777743+7+bc345645645";
//        Pattern pattern1 = Pattern.compile("\\w+");
//        String s1 = "privet kak dela      pok  a pog     oda bobo ";
//        Pattern pattern1 = Pattern.compile("\\w+\\S+\\w");
        String s1 = "abcd abcd3 adasdasdas131fdfsdgdfhdhd";
        Pattern pattern1 = Pattern.compile("\\D{2,6}");
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " " + matcher.group());
        }
    }
}
