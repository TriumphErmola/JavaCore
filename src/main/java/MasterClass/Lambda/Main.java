package MasterClass.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Printing from the Runnable");

        }).start();

        Comrade andrey = new Comrade("Andrey Ermolenko", 28);
        Comrade ivan = new Comrade("Ivan Ivanov", 32);
        Comrade tony = new Comrade("Tony Montano", 45);
        Comrade jim = new Comrade("Jim Raynor", 36);

        List<Comrade> comrades = new ArrayList<>();
        comrades.add(andrey);
        comrades.add(ivan);
        comrades.add(tony);
        comrades.add(jim);

        KakoytoClass kakoytoClass = new KakoytoClass();
        String s = kakoytoClass.doSomething();
        System.out.println(s);


//        Collections.sort(comrades, new Comparator<Comrade>() {
//            @Override
//            public int compare(Comrade comrade1, Comrade comrade2) {
//                return comrade1.getNameOfComrade().compareTo(comrade2.getNameOfComrade());
//            }
//        });
//        Collections.sort(comrades, (comrade1, comrade2) ->
//                comrade1.getNameOfComrade().compareTo(comrade2.getNameOfComrade()));
//
//
//        for (Comrade comrade : comrades) {
//            System.out.println(comrade.getNameOfComrade());
//        }
//
//     1.  new Thread(new SimpleClass()).start();
//
//     2.   new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the Runnable");
//            }
//        }).start();

//        String stillString = stuffDoString(new ConcatAndUpper() {
//                                               @Override
//                                               public String concatAndUpper(String str1, String str2) {
//                                                   return str1.toUpperCase() + str2.toUpperCase();
//                                               }
//                                           },
//                comrades.get(0).getNameOfComrade(), comrades.get(1).getNameOfComrade());
//        System.out.println(stillString);
        ConcatAndUpper cu = (str1, str2) -> {
            String result = str1.toUpperCase() + str2.toUpperCase();
            return result;
        };
        String sillyString = stuffDoString(cu, comrades.get(0).getNameOfComrade(), comrades.get(1).getNameOfComrade());
        System.out.println(sillyString);

    }

    public final static String stuffDoString(ConcatAndUpper uc, String str1, String str2) {
        return uc.concatAndUpper(str1, str2);
    }
}

class Comrade {
    private String nameOfComrade;
    private int ageOfComrade;

    public Comrade(String nameOfComrade, int ageOfComrade) {
        this.nameOfComrade = nameOfComrade;
        this.ageOfComrade = ageOfComrade;
    }

    public String getNameOfComrade() {
        return nameOfComrade;
    }

    public void setNameOfComrade(String nameOfComrade) {
        this.nameOfComrade = nameOfComrade;
    }

    public int getAgeOfComrade() {
        return ageOfComrade;
    }

    public void setAgeOfComrade(int ageOfComrade) {
        this.ageOfComrade = ageOfComrade;
    }

    @Override
    public String toString() {
        return "Comrade{" +
                "nameOfComrade='" + nameOfComrade + '\'' +
                ", ageOfComrade=" + ageOfComrade +
                '}';
    }
}

interface ConcatAndUpper {
    public String concatAndUpper(String str1, String str2);
}

class KakoytoClass {
    public String doSomething() {

        ConcatAndUpper cau = (str1, str2) -> {
            System.out.println("The lambda expresssion class is " + getClass().getSimpleName());
            String result = str1.toUpperCase() + str2.toUpperCase();
            return result;
        };

        System.out.println("Another class is name is " + getClass().getSimpleName());
        return Main.stuffDoString(cau, "String 1", "String2");
    }
}
