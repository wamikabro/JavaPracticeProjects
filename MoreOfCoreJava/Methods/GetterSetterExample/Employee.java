package GetterSetterExample;

public class Employee {
    private String name, department;
    private int age, salary;

     Employee(){
        // Default values if the values aren't set explicitly by the user.
        name = "EmployeeName";
        department = "EmployeeDepartment";
        age = 18;
        salary = 10_000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 2)
            this.name = name;
        else
            System.out.println("Name can not be smaller than 3 letters.");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
