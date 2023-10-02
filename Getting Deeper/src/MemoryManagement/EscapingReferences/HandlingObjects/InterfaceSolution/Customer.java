package MemoryManagement.EscapingReferences.HandlingObjects.InterfaceSolution;

public class Customer implements CustomerReadOnly {
   private String name;

   @Override
   public String getName(){
       return name;
   }
   public Customer(String name){
       this.name = name;
   }

   // creating a copy constructor will help us give copy of the data to the caller instead of giving access to the original object.
   public Customer(Customer oldCustomer){
       this.name = oldCustomer.name;
   }

   @Override
   public String toString(){
       return name;
   }

   public void setName(String name){
       this.name = name;
   }
}
