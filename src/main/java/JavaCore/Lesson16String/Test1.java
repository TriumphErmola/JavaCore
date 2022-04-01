package JavaCore.Lesson16String;

public class Test1 {
    public static void main(String[] args) {

//        String str1 = "Privet";
//        int length1 = str1.length();
//        System.out.println("Длина " + str1 + " = " + length1);
//        System.out.println("**********************************");
//        char ch1 = str1.charAt(3);
//        System.out.println(ch1);
//        System.out.println("**********************************");
//        int index1 = str1.indexOf("t");
//        System.out.println(index1);
//        System.out.println("**********************************");
//        int index2 = str1.indexOf("Priv");
//        System.out.println(index2);
//        System.out.println("**********************************");
//
//        float floatVar = 25.21F;
//        int intVar = 21;
//        String stringVar = "kek";
//
//        String fs;
//        fs = String.format("Значение переменной float = " +
//                "%f, пока значение integer " +
//                "переменная = %d, и string " +
//                "= %s", floatVar, intVar, stringVar);
//        System.out.println(fs);
//        System.out.println("**********************************");
//        System.out.printf("Значение переменной float = " +
//                "%f, пока значение integer " +
//                "переменная = %d, и string " +
//                "= %s", floatVar, intVar, stringVar);

//        String str1488 = "All robots speak Java";
//        int result = str1488.length();
//        System.out.println(result);

        String str = " Inside Main";
        String subs = str.substring(0, 6);
        long n = subs.trim().length();
        System.out.println(n);



    }
}
