package javaBeginnersGuideProjects.GettingDeeper.StreamAPI.EmployeeProject;

import java.util.ArrayList;
import java.util.List;

public class ApplyingFindFirstOrElse {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Wamique", "Abro", 30000.0, List.of("Project 1", "Project 2")));
        employees.add(new Employee("Wasique", "Abro", 40000.0, List.of("Project 2", "Project 3")));
        employees.add(new Employee("Ahsan", "Abro", 25000.0, List.of("Project 3", "Project 4")));
        employees.add(new Employee("Moazzam", "Abro", 30000.0, List.of("Project 4", "Project 5")));

        // increase the salary of the employees having salary greater than 30,000
        Employee newSalary =
                employees
                        .stream()
                        .filter(employee -> employee.getSalary() > 30000.0)
                        .map(employee -> new Employee(employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.10,
                                employee.getProjects()))
                        .findFirst() // just store first employee
                        .orElse(null); // if findFirst not found then use or else

        System.out.println(newSalary);
    }
}
