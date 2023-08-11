package javaBeginnersGuideProjects.multithreadedProgrammingChapter11;
// Suspending, resuming, and stopping a thread.
class MyThreadSuspend implements Runnable{
    Thread thread;
    boolean suspended;
    boolean stopped;

    MyThreadSuspend(String name){
        thread = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    // A factory method that creates and starts a thread.
    public static MyThreadSuspend createAndStart(String name){
        MyThreadSuspend myThreadSuspend = new MyThreadSuspend(name);

        myThreadSuspend.thread.start();

        return myThreadSuspend;
    }

    // Entry point of thread.
    public void run(){
        System.out.println(thread.getName() + " starting.");

        try{
            for(int i = 1; i < 1000; i++){
                System.out.print(i + " ");
                if((i%10) == 0){
                    System.out.println();
                    Thread.sleep(250);
                }
                // Use synchronized block to check suspended and stopped.
                synchronized (this){
                    while(suspended){
                        wait();
                    }
                    if(stopped) break;
                }
            }
        }catch(InterruptedException exception){
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " exiting.");
    }

    // Stop the thread.
    synchronized  void mystop(){
        stopped = true;
        // The following ensures that a suspended thread can be stopped.
        suspended = false;
        notify();
    }

    // Suspend the thread.
    synchronized  void mysuspend(){
        suspended = true;
    }

    // Resume the thread.
    synchronized void myresume(){
        suspended = false;
        notify();
    }

}

public class Suspend {
    public static void main(String[] args) {
        MyThreadSuspend mt1 = MyThreadSuspend.createAndStart("My Thread");

        try{
            Thread.sleep(1000); // let ob1 thread start executing

            mt1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.mystop();
        }catch(InterruptedException exception){
            System.out.println("Main thread Interrupted.");
        }

        // wait for thread to finish
        try{
            mt1.thread.join();
        }catch(InterruptedException exception){
            System.out.println("Main thread Interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
