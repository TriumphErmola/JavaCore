package generics.game;

public class Test {
    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan", 12);
        Schoolar schoolar2 = new Schoolar("Petr", 13);
        Schoolar schoolar3 = new Schoolar("Dima", 10);
        Schoolar schoolar4 = new Schoolar("Egor", 9);
        Student student1 = new Student("Max", 18);
        Student student2 = new Student("Gleb", 20);
        Employee employee1 = new Employee("Georg", 25);
        Employee employee2 = new Employee("Victor", 29);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        Team<Schoolar> schoolarTeam2 = new Team<>("Mudrici");
        Team<Student> studentTeam = new Team<>("Tigers");
        Team<Employee> employeeTeam = new Team<>("Managers");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);

    }
}
