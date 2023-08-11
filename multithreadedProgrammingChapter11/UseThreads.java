package javaBeginnersGuideProjects.multithreadedProgrammingChapter11;

// Create a thread by implementing Runnable.
class MyThread implements Runnable{
    String threadName;
    MyThread(String name){
        threadName = name;
    }

    // Entry point of the thread.
    public void run(){
        System.out.println(threadName + "starting.");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + threadName + ", count is " + count);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadName + " terminating.");
    }
}

public class UseThreads {
    public static void main(String[] args) {
        // First, construct a MyThread object.
        MyThread mt = new MyThread("Child #1");

        // Next, construct a thread from that object.
        Thread newThread = new Thread(mt);


        // Finally, start execution of the thread.
        newThread.start();



        for(int i=0; i<50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Main thread ending.");

    }
}
