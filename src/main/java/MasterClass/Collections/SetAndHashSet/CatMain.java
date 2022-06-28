package MasterClass.Collections.SetAndHashSet;

public class CatMain {
    public static void main(String[] args) {

        MainCun kot1 = new MainCun("Kot1");
        Cat kot2 = new Cat("Kot1");

        System.out.println(kot1.equals(kot2));
        System.out.println(kot2.equals(kot1));
    }
}
