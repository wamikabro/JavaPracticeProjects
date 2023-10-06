package javaBeginnersGuideProjects.multithreadedProgrammingChapter11;
// Extending thread
class MyThreadAgain extends Thread{
    MyThreadAgain (String name){
        super(name); // name thread
    }

    // Entry point of a thread
    @Override
    public void run(){
        System.out.println(getName() + " starting.");
        try{
            for(int count=0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        }catch(InterruptedException exception){
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }

    // Create and Start Factory Method
    public static MyThreadAgain createAndStart(String name){
        MyThreadAgain mt = new MyThreadAgain(name);
        mt.start();
        return mt;
    }
}


public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting. ");

        /* // No more need of starting explicitly.
        MyThreadAgain mt = new MyThreadAgain("Child #1");
        mt.start();
        */
        MyThreadAgain mt = MyThreadAgain.createAndStart("Child #1");


        for(int i=0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException exception){
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
