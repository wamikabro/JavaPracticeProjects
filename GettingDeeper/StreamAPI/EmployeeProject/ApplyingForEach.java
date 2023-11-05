package javaBeginnersGuideProjects.GettingDeeper.StreamAPI.EmployeeProject;

import java.util.*;

public class ApplyingForEach {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Wamique", "Abro", 30000.0, List.of("Project 1", "Project 2")));
        employees.add(new Employee("Wasique", "Abro", 40000.0, List.of("Project 2", "Project 3")));
        employees.add(new Employee("Ahsan", "Abro", 25000.0, List.of("Project 3", "Project 4")));
        employees.add(new Employee("Moazzam", "Abro", 30000.0, List.of("Project 4", "Project 5")));

        // taking employees, for each employee printing employee
        employees.stream().forEach(employee -> System.out.println(employee));
    }
}
