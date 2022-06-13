package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test7Collect {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 9.5);
        Student st2 = new Student("Nicolai", 'm', 26, 5, 7.5);
        Student st3 = new Student("Elena", 'f', 19, 2, 8.5);
        Student st4 = new Student("Petr", 'm', 32, 4, 7.0);
        Student st5 = new Student("Mariya", 'f', 21, 3, 8.9);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        MapClass<Integer, List<Student>> map = students.stream().map(e1 -> {
//                    e1.setName(e1.getName().toUpperCase());
//                    return e1;
//                })
//                .collect(Collectors.groupingBy(e1 -> e1.getCourse()));
//        for (MapClass.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue().toString());
//        }

        Map<Boolean, List<Student>> map = students.stream()
                .collect(Collectors.partitioningBy(e1 -> e1.getAvgGrade() > 7));
        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}