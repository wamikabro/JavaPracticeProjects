package javaBeginnersGuideProjects.GettingDeeper.StreamAPI.EmployeeProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplyingMap {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Wamique", "Abro", 30000.0, List.of("Project 1", "Project 2")));
        employees.add(new Employee("Wasique", "Abro", 40000.0, List.of("Project 2", "Project 3")));
        employees.add(new Employee("Ahsan", "Abro", 25000.0, List.of("Project 3", "Project 4")));
        employees.add(new Employee("Moazzam", "Abro", 30000.0, List.of("Project 4", "Project 5")));

        List<Employee> increasedSalary = employees.stream().map(employee -> new Employee(
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSalary() * 1.10, // increasing salary by 10%
                employee.getProjects()
            )).collect(Collectors.toList());

        System.out.println("Before: ");
        System.out.println(employees);
        System.out.println("After: ");
        System.out.println(increasedSalary);
    }
}
