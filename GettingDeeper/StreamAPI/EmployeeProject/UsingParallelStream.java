package javaBeginnersGuideProjects.GettingDeeper.StreamAPI.EmployeeProject;

import java.util.ArrayList;
import java.util.List;

public class UsingParallelStream {
    public static void main(String[] args) {
        // demonstrate reduce using parallel Stream
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Wamique", "Abro", 30000.0, List.of("Project 1", "Project 2")));
        employees.add(new Employee("Wasique", "Abro", 40000.0, List.of("Project 2", "Project 3")));
        employees.add(new Employee("Ahsan", "Abro", 25000.0, List.of("Project 3", "Project 4")));
        employees.add(new Employee("Moazzam", "Abro", 30000.0, List.of("Project 4", "Project 5")));

        // reduce
        Double totalSalary = employees
                // this will do operations using parallel threads
                // keep in mind, your operations should be threadsafe
                // meaning, they shouldn't ruin the result while working on multi thread.
                .parallelStream()
                .map(employee -> employee.getSalary())
                .reduce(0.0, Double::sum);
        //      .reduce(0.0, (sum, i) -> sum + i); // manual way of doing sum of all values

        System.out.println("Total Salary: " + totalSalary);
    }
}
