package javaBeginnersGuideProjects.multithreadedProgrammingChapter11;
/*
 Controlling the main thread
 */
public class UseMain {
    public static void main(String[] args) {
        Thread thread;

        // Get the main thread.
        thread = Thread.currentThread();

        // Display main thread's name.
        System.out.println("Main thread is called: " + thread.getName());

        // Display main thread's priority
        System.out.println("Priority: " + thread.getPriority());

        System.out.println();

        // Set the name and priority.
        System.out.println("Setting name and priority of the main thread.\n");
        thread.setName("Thread #1");
        thread.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("Main thread is now called:" + thread.getName());
        System.out.println("Priority is now: " + thread.getPriority());

    }
}
