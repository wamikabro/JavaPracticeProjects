package javaBeginnersGuideProjects.multithreadedProgrammingChapter11;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThreadAgain mt1 = MyThreadAgain.createAndStart("Child #1");
        MyThreadAgain mt2 = MyThreadAgain.createAndStart("Child #2");
        MyThreadAgain mt3 = MyThreadAgain.createAndStart("Child #3");


        do{
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException exception){
                System.out.println("Main thread interrupted.");
            }
        }while (mt1.isAlive() || mt2.isAlive() || mt3.isAlive());

        System.out.println("Main thread ending.");
    }
}
