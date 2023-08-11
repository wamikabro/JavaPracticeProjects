package javaBeginnersGuideProjects.multithreadedProgrammingChapter11;
// Use a synchronized block to control access to SumArray.

class SumArray1{
    private int sum;
    int sumArray(int nums[]){
        sum = 0; // reset sum

        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() +
                    " is " + sum);

            try{
                Thread.sleep(10); // allow task-switch
            }
            catch (InterruptedException exception){
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}

class MyThread3 implements Runnable{
    Thread thread;
    static SumArray1 sa = new SumArray1();
    int a[];
    int answer;

    // Construct a new thread.
    MyThread3(String name, int nums[]){
        thread = new Thread(this, name);
        a = nums;
    }

    // Factory method that creates and starts a thread.
    public static MyThread3 createAndStart(String name, int nums[]){
        MyThread3 myThread = new MyThread3(name, nums);

        myThread.thread.start(); // start the thread
        return myThread;
    }

    // Entry point of thread.
    public void run(){
        int sum;

        System.out.println(thread.getName() + " starting.");

        // synchronize calls to sumArray()
        synchronized(sa){
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for " + thread.getName() + " is " + answer);

        System.out.println(thread.getName() + " terminating");
    }
}


public class SyncStatement {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread3 mt1 = MyThread3.createAndStart("Child #1", a);
        MyThread3 mt2 = MyThread3.createAndStart("Child #2", a);

        try{
            mt1.thread.join();
            mt2.thread.join();
        }catch (InterruptedException exception){
            System.out.println("Main thread interrupted.");
        }

    }
}
