package GetterSetterExample;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Wa");

        System.out.println(employee.getName());
        System.out.println(employee.getDepartment());

        employee.setName("Wamique");
        System.out.println(employee.getName());
    }
}
