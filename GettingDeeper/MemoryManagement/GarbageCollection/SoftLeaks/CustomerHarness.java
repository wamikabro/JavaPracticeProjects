package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement.GarbageCollection.SoftLeaks;

public class CustomerHarness {
    public static void main(String[] args) {
        CustomerManager cm = new CustomerManager();
        GenerateCustomerTask task = new GenerateCustomerTask(cm);

        for(int user=0; user < 10; user++){
            Thread t = new Thread(task);
            t.start();
        }

        while(true){
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            // this output is showing us that there is some memory leak that's why we keep on losing available memory
            cm.howManyCustomers();
            System.out.println("Available memory: " + Runtime.getRuntime().freeMemory() / 1024 + "k");
        }
    }
}
