package JavaCore.VarargsLesson19;

public class Test2 {
    public static void main(String[] args) {

        String[] students = {"Ivanov","Petrov","Sidorov"};
        String[] exams = {"MatAnaliz","Phfilosofiya"};
        for(String s1 : students){
            for(String s2 : exams){
                System.out.println(s1+ " "+s2);
            }
        }

    }
}
