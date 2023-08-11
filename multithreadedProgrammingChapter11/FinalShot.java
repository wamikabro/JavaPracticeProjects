package javaBeginnersGuideProjects.multithreadedProgrammingChapter11;

class MyFinalThread implements Runnable{

    public Thread thread;

    MyFinalThread(String name){
        thread = new Thread(this,name);
    }

    // Factory Method
    public static MyFinalThread createAndStart(String name){
        MyFinalThread myFinalThread = new MyFinalThread(name);
        myFinalThread.thread.start();
        return myFinalThread;
    }

    @Override
    public void run(){
        System.out.println("Hello");
    }
}


public class FinalShot {
    public static void main(String[] args) {
        MyFinalThread myFinalThread = MyFinalThread.createAndStart("Thread 1");
        try{
            myFinalThread.thread.join();
        }catch (InterruptedException exception){
            System.out.println("Exception in " + myFinalThread.thread.getName());
        }

    }
}
