package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.DuplicatingCollections;

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

    public Map<String, Customer> getCustomers(){
        // now we are actually sending the copy of collection to the caller.
        // this way we can save our original data from being mutated.
        return new HashMap<String, Customer>(this.records);
        // but there's still a downside. Although the original hashmap will not be changed
        // but the copy can still be changed. so the caller may change the copy and think that I am working on
        // original collection. This thing will start a huge confusion in the structure of the program.

    }


}
