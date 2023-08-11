package javaBeginnersGuideProjects.multithreadedProgrammingChapter11;

// Using Join method to wait until other threads are over.
public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting. ");

        MyThreadAgain mt1 = MyThreadAgain.createAndStart("Child #1");
        MyThreadAgain mt2 = MyThreadAgain.createAndStart("Child #2");
        MyThreadAgain mt3 = MyThreadAgain.createAndStart("Child #3");


        try{
            mt1.join();
            System.out.println("Child #1 Joined.");

            mt2.join();
            System.out.println("Child #2 Joined.");

            mt3.join();
            System.out.println("Child #3 Joined.");

        }
        catch(InterruptedException exception){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}
