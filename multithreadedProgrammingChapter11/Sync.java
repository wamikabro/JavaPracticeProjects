package javaBeginnersGuideProjects.multithreadedProgrammingChapter11;

class SumArray{
    private int sum;

    synchronized int sumArray(int nums[]){
        sum = 0; // reset sum

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() +
                    " is " + sum);

            try {
                Thread.sleep(10); // allow task-switch
            }
            catch(InterruptedException exc){
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}

class MyThread1 implements Runnable{
    Thread thread;
    static SumArray sa = new SumArray();
    int a[];
    int answer;
    // Construct a new thread.
    MyThread1(String name, int nums[]){
        thread = new Thread(this, name);
        a = nums;
    }

    // A factory method that creates and starts a thread.
    public static MyThread1 createAndStart(String name, int nums[]){
        MyThread1 myThread1 = new MyThread1(name, nums);

        myThread1.thread.start(); // start the thread
        return myThread1;
    }

    // Entry point of thread.
    @Override
    public void run() {
        int sum;

        System.out.println(thread.getName() + " starting.");

        answer = sa.sumArray(a);
        System.out.println("Sum for " + thread.getName() + " is " + answer);

        System.out.println(thread.getName() + " terminating.");
    }
}

public class Sync {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        MyThread1 mt1 = MyThread1.createAndStart("Child #1", a);
        MyThread1 mt2 = MyThread1.createAndStart("Child #2", a);

        try{
            mt1.thread.join();
            mt2.thread.join();
        }
        catch (InterruptedException exception){
            System.out.println("Main thread interrupted.");
        }
    }
}
