package JavaCore.Lesson20ArrayList;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add(1,"Petrov");
        students.add(2,"Petrov");
        students.add(3,"Petrov");
        students.add(4,"Petrov");
        students.remove(2);
        for(String s : students){
            System.out.println(s);
        }
    }
}
