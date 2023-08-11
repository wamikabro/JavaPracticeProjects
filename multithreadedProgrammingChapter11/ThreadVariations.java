package javaBeginnersGuideProjects.multithreadedProgrammingChapter11;
// MyThread variations
/* creates a Thread when its constructor is called and
stores it in an instance variable called thread. It also sets the name
of the thread and provides a factory method to create and start a thread.*/
class MyThread2 implements Runnable{
    Thread thread;

    // Construct a new thread using this Runnable and give it a name
    MyThread2(String name){
        thread = new Thread(this, name);
    }

    // A factory method that creates and starts a thread.
    public static MyThread2 createAndStart(String name){
        MyThread2 myThread = new MyThread2(name);

        myThread.thread.start(); // start the thread
        return myThread;
    }

    // Entry point of the thread.
    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");
        try{
            for(int count = 0; count<10; count++){
                Thread.sleep(400);
                System.out.println("In " + thread.getName() + ", count is " + count);
            }
        }catch (InterruptedException exception){
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");
    }
}
class ThreadVariations{
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // Create and start a thread.
        MyThread2 mt = MyThread2.createAndStart("Child #1");

        for(int i = 0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException exception){
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}