package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.HandlingObjects.CopyConstructor;

import java.util.HashMap;
import java.util.Map;

public class CustomerRecords{
    private Map<String, Customer> records;

    public CustomerRecords(){
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer c){
        this.records.put(c.getName(), c);
    }

    // the problem
    /* public Customer getCustomerByName(String name)
    {
        // dangerous way to return customer to the caller
        // since it is giving the access to the reference of object.
        return this.records.get(name);
    }*/

    public Customer getCustomerByName(String name){
        // returning the copy constructor by passing the object to it to construct the copy.
        return new Customer(this.records.get(name));
    }
}
