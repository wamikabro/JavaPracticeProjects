package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.ImmutableCollections;

public class Main {
    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("Moazzam"));

        records.addCustomer(new Customer("Wamique"));

        // now since the map is not mutable, this code is going to throw an exception on your face.
        //records.getCustomer().clear();

        // Now this is the best solution so far
        // the summary to the case study is that we should return unmodifiable map or list whatever instead of returning reference.
        for(Customer next: records.getCustomer().values()){
            System.out.println(next);
        }

        // stay secure, stay safe!
    }
}
