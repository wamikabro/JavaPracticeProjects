package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.ImmutableCollections;

import java.util.Collections;
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

    public Map<String, Customer> getCustomer(){
        // now the copy that we are sending to the caller is not even modifiable.
        // clearing the possible confusion of mutating the original collection that programmer could've.
        return Collections.unmodifiableMap(this.records);
        // there are a lot of other options in Collection class that we can make use of when needed.
    }

}
