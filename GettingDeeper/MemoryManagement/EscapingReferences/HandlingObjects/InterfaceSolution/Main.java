package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.HandlingObjects.InterfaceSolution;

public class Main {
    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("Moazzam"));

        records.addCustomer(new Customer("Wamique"));

        // now the records.getCustomerByName is returning CustomerReadOnly interface instead of the original object
        // now the programmer can't even accidentally change anything of the customer object because it has the reference to
        // the interface only. and the interface has no method to set the data of customer object. it can only read data from it.
        CustomerReadOnly wamique = records.getCustomerByName("Wamique");
    }
}
