package MemoryManagement.GarbageCollection.Finalize;

public class Customer {
    private String name;

    public String getName(){
        return name;
    }

    public Customer(String name){
        this.name = name;
    }

    public Customer(Customer oldCustomer){
        this.name = oldCustomer.name;
    }

    public String toString(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // since we know finalize method is called by garbage collector, let's see how many times it is called
    public void finalize(){
        System.out.println("This method is called by GC.");
    }

}
