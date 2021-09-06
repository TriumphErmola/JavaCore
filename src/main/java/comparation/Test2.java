package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        List<SpaceMarine> spaceMarineList = new ArrayList<>();
        SpaceMarine spaceMarine1 = new SpaceMarine("Garvel", "SonOfHorus", 200, 234567);
        SpaceMarine spaceMarine2 = new SpaceMarine("Sigizmund", "ImperialFist", 100, 234567);
        SpaceMarine spaceMarine3 = new SpaceMarine("Rem", "Ultramarines", 250, 234567);
        SpaceMarine spaceMarine4 = new SpaceMarine("Asmodey", "DarkAngels", 150, 234567);
        SpaceMarine spaceMarine5 = new SpaceMarine("Asmodey", "BloodAngels", 154, 1251251);
        spaceMarineList.add(new SpaceMarine("Dante", "BloodAngels", 255, 123456));
        spaceMarineList.add(spaceMarine1);
        spaceMarineList.add(spaceMarine2);
        spaceMarineList.add(spaceMarine3);
        spaceMarineList.add(spaceMarine4);
        spaceMarineList.add(spaceMarine5);
        System.out.println("Перед сортировкой \n" + spaceMarineList);
        Collections.sort(spaceMarineList, new CompanyComparator());
        System.out.println("После сортировки \n" + spaceMarineList);

    }
}

class SpaceMarine implements Comparable<SpaceMarine> {
    String name;
    String legion;
    int age;
    int company;

    public SpaceMarine(String name, String legion, int age, int company) {
        this.name = name;
        this.legion = legion;
        this.age = age;
        this.company = company;
    }

    @Override
    public String toString() {
        return "SpaceMarine{" +
                "name='" + name + '\'' +
                ", legion='" + legion + '\'' +
                ", age=" + age +
                ", company=" + company +
                '}';
    }

    @Override
    public int compareTo(SpaceMarine anotherSpacemarine) {

        if (this.age == anotherSpacemarine.age) {
            return 0;
        } else if (this.age < anotherSpacemarine.age) {
            return -1;
        } else {
            return 1;
        }

////        return this.age.compareTo(anotherSpacemarine.age);

////        return this.age - anotherSpacemarine.age;

////        int res = this.name.compareTo(anotherSpacemarine.name);
////        if (res == 0) {
////            res = this.legion.compareTo(anotherSpacemarine.legion);
////        }
////        return res;
//    }
    }

//class AgeComparator implements Comparator<SpaceMarine> {
//    @Override
//    public int compare(SpaceMarine spaceMarineOne, SpaceMarine spaceMarineTwo) {
//        if (spaceMarineOne.age == spaceMarineTwo.age) {
//            return 0;
//        } else if (spaceMarineOne.age < spaceMarineTwo.age) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//}
}

class NameComparator implements Comparator<SpaceMarine> {
    @Override
    public int compare(SpaceMarine spaceMarineOne, SpaceMarine spaceMarineTwo) {
        return spaceMarineOne.name.compareTo(spaceMarineTwo.name);
    }
}

class CompanyComparator implements Comparator<SpaceMarine> {
    @Override
    public int compare(SpaceMarine spaceMarineOne, SpaceMarine spaceMarineTwo) {
        return spaceMarineOne.company - spaceMarineTwo.company;
    }
}

