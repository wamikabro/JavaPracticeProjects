package javaBeginnersGuideProjects.GettingDeeper.StreamAPI.EmployeeProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplyingFlatMap {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Wamique", "Abro", 30000.0, List.of("Project 1", "Project 2")));
        employees.add(new Employee("Wasique", "Abro", 40000.0, List.of("Project 2", "Project 3")));
        employees.add(new Employee("Ahsan", "Abro", 25000.0, List.of("Project 3", "Project 4")));
        employees.add(new Employee("Moazzam", "Abro", 30000.0, List.of("Project 4", "Project 5")));

        // flatmap
        // it will take out all the list elements of the project list inside the main list
        // and flat them into string.
        // then join them all and store in String called projects
        String projects =
                employees
                .stream()
                .map(employee -> employee.getProjects())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.joining(","));

        System.out.println("projects");
    }
}
