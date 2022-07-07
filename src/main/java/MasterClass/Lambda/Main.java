package MasterClass.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        new Thread(() -> {

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

        comrades.forEach(comrade -> {
            System.out.println(comrade.getNameOfComrade());
            System.out.println(comrade.getAgeOfComrade());
        });

//        for (Comrade comrade : comrades) {
//            System.out.println(comrade.getNameOfComrade());
//            System.out.println(comrade.getAgeOfComrade());
//        }

//        System.out.println("=====================");
//
//        for (int i = 0; i < comrades.size(); i++) {
//            Comrade comrade = comrades.get(i);
//            System.out.println(comrade.getAgeOfComrade());
//            new Thread(() -> System.out.println(comrade.getAgeOfComrade())).start();
//        }

        ConcatAndUpper cu = (str1, str2) -> {
            String result = str1.toUpperCase() + str2.toUpperCase();
            return result;
        };

        String sillyString = stuffDoString(cu, comrades.get(0).getNameOfComrade(),
                comrades.get(1).getNameOfComrade());


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
        int i = 0;

        ConcatAndUpper cau = (str1, str2) -> {
            System.out.println("The lambda expresssion class is " + getClass().getSimpleName());
            System.out.println("int i in lambda expresssion" + i);
            String result = str1.toUpperCase() + str2.toUpperCase();
            return result;
        };

        System.out.println("Another class is name is " + getClass().getSimpleName());
        return Main.stuffDoString(cau, "String 1", "String2");
    }

    public void valuePrint() {
        int number = 25;

        Runnable run = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            }
            System.out.println("The value is : " + number);
        };
        new Thread(run).start();
    }

}
