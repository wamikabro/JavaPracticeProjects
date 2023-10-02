package MemoryManagement.EscapingReferences.HandlingObjects.CopyConstructor;

public class Main {
    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("Moazzam"));

        records.addCustomer(new Customer("Wamique"));

        // now this is the copy of existing customer called Wamique
        Customer wamique = records.getCustomerByName("Wamique");

        System.out.println(wamique.getName());

        wamique.setName("Konain"); // this won't change the name in original object but just in the wamique referenced object
        System.out.println(wamique.getName());

        // original name for customer "Wamique" is stil Wamique
        // but the code below is again creating the copy constructor of wamique.
        // so the original object is never accessible outside the code.
        System.out.println(records.getCustomerByName("Wamique").getName());

        // but the issue is, the copy is still mutable. so it may again start confusions.
    }
}
