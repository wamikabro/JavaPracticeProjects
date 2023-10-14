package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.IterableSolution;

public class Main {
    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("Moazzam"));

        records.addCustomer(new Customer("Wamique"));

        for(Customer next : records){
            System.out.println(next);
        }

        records.iterator().remove();
    }
}
