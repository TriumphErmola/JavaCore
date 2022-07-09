package MasterClass.Streams;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Comrade> comradesList;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.comradesList = new ArrayList<>();
    }

    public void addComrade(Comrade comrade) {
        comradesList.add(comrade);
    }

    public List<Comrade> getComradesList() {
        return comradesList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", comradesList=" + comradesList +
                '}';
    }
}
