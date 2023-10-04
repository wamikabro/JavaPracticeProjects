package MemoryManagement.GarbageCollection.Finalize;

public class FinalizeMethod {
    public static void main(String[] args) {

        // we created objects 10 times and lost the reference to it each time in the loop.
        // So there are 10 objects to be collected technically.
        for(int i=0; i<10; i++){
            Customer c;
            c = new Customer("wamique");
        }

        // finalize method is made in customer, so it should print our desired output each time it is called by the gc.
        System.gc();

        // in our case it has been called the 10 times. But if we will make our code complex it will start showing us the effects.
        // so using finalize to close the resources can make resources leak happen and make our code buggy.
    }

}
