package javaBeginnersGuideProjects.PackagesAndInterfacesChapter8;

public class ByTwos implements Series{
    int start;
    int val;

    ByTwos(){
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        val = start;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class SeriesDemo{
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for(int i = 0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nResetting");
        ob.reset();
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());
    }
}
