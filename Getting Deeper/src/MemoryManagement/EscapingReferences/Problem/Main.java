package MemoryManagement.EscapingReferences.Problem;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("Moazzam"));

        records.addCustomer(new Customer("Wamique"));

        for(Customer next : records.getCustomers().values()){
            System.out.println(next);
        }

        // since the getCustomers() method in CustomerRecords is returning reference to the object
        // the calling class can manipulate it, for example:
        Map<String, Customer> myCustomers = records.getCustomers();
        myCustomers.clear(); // this will literally remove the data of "records" object
        // since the calling class had the reference to the object, it destroyed it with no worry.
    }
}
