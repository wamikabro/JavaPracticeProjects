package javaBeginnersGuideProjects.PackagesAndInterfacesChapter8;
class ByTwos2 implements Series{
    int start;
    int val;

    ByTwos2(){
        start = 0;
        val = 0;
    }

    public int getNext(){
        val += 2;
        return val;
    }

    public void reset(){
        val = start;
    }

    public void setStart(int x){
        start = x;
        val = x;
    }
}
class ByThrees implements Series{
    int start;
    int val;

    ByThrees(){
        start = 0;
        val = 0;
    }

    public int getNext(){
        val += 3;
        return val;
    }

    public void reset(){
        val = start;
    }

    public void setStart(int x){
        start = x;
        val = x;
    }
}
public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos2 twoOb = new ByTwos2();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for(int i = 0; i < 5; i++){
            ob = twoOb;
            System.out.println("Next value is " + ob.getNext());
            ob = threeOb;
            System.out.println("Next value is " + ob.getNext());
        }
    }
}
