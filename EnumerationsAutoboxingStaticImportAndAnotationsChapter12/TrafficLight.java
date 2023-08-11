package javaBeginnersGuideProjects.EnumerationsAutoboxingStaticImportAndAnotationsChapter12;
enum TrafficLightColor {
    RED, YELLOW, GREEN
}

class TrafficLightSimulator implements Runnable{
    private TrafficLightColor trafficLightColor;
    private boolean stop;
    private boolean changed;

    TrafficLightSimulator(TrafficLightColor trafficLightColor){
        stop = false;
        changed = false;
        this.trafficLightColor = trafficLightColor;
    }

    TrafficLightSimulator(){
        stop = false;
        changed = false;
        trafficLightColor = TrafficLightColor.RED;
    }

    @Override
    public void run() {
        while(!stop){
            try{
                switch(trafficLightColor){
                    case GREEN:
                        Thread.sleep(2000);
                        break;
                    case YELLOW:
                        Thread.sleep(2000);
                        break;
                    case RED:
                        Thread.sleep(12000);
                        break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            changeColor();
        }
    }

    synchronized void changeColor(){
        switch (trafficLightColor){
            case RED:
                trafficLightColor = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                trafficLightColor = TrafficLightColor.RED;
                break;
            case GREEN:
                trafficLightColor = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify(); // signal that the light has changed
    }

    // Wait until a light change occurs.
    synchronized  void waitForChange(){
        try{
            while(!changed)
                wait(); // wait until notified.
            changed = false;

        }catch(InterruptedException excep){
            System.out.println(excep);
        }
    }

    synchronized TrafficLightColor getColor(){
        return trafficLightColor;
    }

    // Stop the traffic light.
    synchronized void cancel(){
        stop = true;
    }
}

public class TrafficLight {
    public static void main(String[] args) {
        TrafficLightSimulator t1 =
                new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thread = new Thread(t1);
        thread.start();



        for(int i=0; i < 9; i++){
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
