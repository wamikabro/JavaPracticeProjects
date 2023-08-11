package javaBeginnersGuideProjects.multithreadedProgrammingChapter11;

// Use wait() and notify() to create a ticking clock.
class TickTock{
    String state; // contains the state of the clock

    synchronized void tick(boolean running){
        if(!running){ // stop the clock
            state = "ticked";
            notify(); // notify any waiting thread for the last time before closing
            return;
        }

        System.out.print("Tick ");

        state = "ticked"; // set the current state to ticked

        notify(); // let tock() run

        try{
            while(!state.equals("tocked"))
                wait(); // wait for tock() to complete

        }catch(InterruptedException exception){
            System.out.println("Thread Interrupted.");
        }
    }

    synchronized  void tock(boolean running){
        if(!running){ // notify any waiting threads
            state = "tocked";
            notify(); // notify any waiting thread for the last time before closing
            return;
        }

        System.out.println("Tock");

        state = "tocked"; // set the current state to tocked

        notify(); // let tick() run

        try{
            while(!state.equals("ticked"))
                wait(); // wait for tick to complete;
        }catch(InterruptedException exception){
            System.out.println("Thread interrupted.");
        }


    }
}

class MyCommunicationThread implements Runnable {
    Thread thread;
    TickTock tickTock;

    // Construct a new thread.
    MyCommunicationThread(String name, TickTock tt){
        thread = new Thread(this, name);
        tickTock = tt;
    }

    // A factory method that creates and starts a thread.
    public static MyCommunicationThread createAndStart(String name, TickTock tt){
        var myCommunicationThread = new MyCommunicationThread(name, tt);
        myCommunicationThread.thread.start();
        return myCommunicationThread;
    }

    // Entry point of the thread.
    @Override
    public void run() {
        if(thread.getName().compareTo("Tick") == 0){
            for(int i=0; i<5; i++) tickTock.tick(true);
            tickTock.tick(false);
        }else{
            for(int i=0; i<5; i++) tickTock.tock(true);
            tickTock.tock(false);
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        var mt1 = MyCommunicationThread.createAndStart("Tick", tt);
        var mt2 = MyCommunicationThread.createAndStart("Tock", tt);

        try{
            mt1.thread.join();
            mt2.thread.join();
        }catch (InterruptedException exception){
            System.out.println("Main thread interrupted.");
        }
    }
}
