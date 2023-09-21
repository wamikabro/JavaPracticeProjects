package MemoryManagement.PassingByReference;

public class Main {
    public static void main(String[] args) {
        // creating customer object and setting its name property
        Customer c = new Customer("Wamique");
        // this method belongs to main class, it will call the setName of Customer class
        // on getting reference of an object.
        renameCustomer(c);

        // Wasique will be printed because the name got changed.
        // So when we gave reference to someone, they easily manipulated our object.
        System.out.println(c.getName());
    }

    public static void renameCustomer(Customer cust){
        // The name set before will be garbage collected in heap.
        cust.setName("Wasique");
    }
}
