package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.GarbageCollection.TryingVerboseGC;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        // For this application I've set its heap size to very small to see how many times GC is called.
        // And I got to know that GC was called as soon as the application started because it has got not much memory.
        // And it proves that if GC is being called again and again that means there's some memory issue
        // And we need to figure out memory leaks or try to give more memory to the program if there's no memory leak issue.
        while (true) {
            Customer c = new Customer("Wamique");
            if(customers.size() >= 100)
            {
                for(int i = 0; i<10; i++){
                    customers.remove(0);
                }
            }
        }
     }
}
