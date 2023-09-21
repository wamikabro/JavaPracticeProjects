package MemoryManagement.FinalKeyword;

public class Customer {
    private String name;

    Customer(String name){
        this.name = name;
    }

    public String getName(){
         String temp = this.name;
         this.name = "haha";
         return temp;
    }

    public void setName(String name){
        this.name = name;
    }
}
