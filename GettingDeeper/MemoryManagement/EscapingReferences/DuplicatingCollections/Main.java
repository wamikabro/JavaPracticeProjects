package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.DuplicatingCollections;

public class Main {
    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("Moazzam"));

        records.addCustomer(new Customer("Wamique"));

        // now this is clearing the copy of collection that it has got. so technically your original data is safe.
        // but at the same time the programmer will get confused, and it will happen to be a complex structure of the program.
        records.getCustomers().clear();

        // this getCustomers() is now going to send the new copy of original collection, so it won't give empty collection
        // as the things were expected before doing the copy collection thing.
        // so this shows that our original collection is safe and healthy, except the fact that things are a bit confusing
        // if many programmers will work on same program, they may get confused.
        for(Customer next : records.getCustomers().values()){
            System.out.println(next);
        }
    }
}
