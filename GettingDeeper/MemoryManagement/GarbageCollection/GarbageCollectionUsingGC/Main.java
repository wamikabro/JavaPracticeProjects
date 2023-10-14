package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.GarbageCollection.GarbageCollectionUsingGC;

import javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.Problem.Customer;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long availableBytes =   runtime.freeMemory();
        System.out.println("Available memory: " + availableBytes / 1024 + "k");

        // let's create a lot of garbage
        for(int i=0; i<1000000; i++){
            javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.EscapingReferences.Problem.Customer c;
            c = new Customer("John");
        }

        availableBytes = runtime.freeMemory();
        System.out.println("Available memory: " + availableBytes / 1024 + "k");

        System.gc(); // using this method is not recommended at all, since it belongs to JVM itself.
        // We shouldn't interfere and try to garbage collect since it is not obvious that it will work or ruin our game.
        // In our case, garbage collection seem to ruin the game.
        // But in some computers, it may work.
        // But simply, let the JVM decide when to collect the garbage and when not to collect.

        availableBytes = runtime.freeMemory();
        System.out.println("Available memory: " + availableBytes / 1024 + "k");
    }
}
