package javaBeginnersGuideProjects.MethodsAndClassesChapter6;
class Queue{
    private char q[];
    private int putloc, getloc;

    Queue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }

    Queue(Queue ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for(int i=getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    Queue(char a[]){
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for(int i=0; i < a.length; i++) put(a[i]);
    }

    void put(char ch){
        if(putloc==q.length){
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    char get(){
        if(getloc == putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }

}
public class QDemo2 {
    public static void main(String[] args) {
        Queue q1 = new Queue(10);

        char name[] = {'T', 'o', 'm'};

        Queue q2 = new Queue(name);

        char ch;
        int i;

        for(i=0; i < 10; i++)
            q1.put((char) ('A' + i));

        Queue q3 = new Queue(q1);

        System.out.println("Contents of q1: ");
        for(i=0; i < 10; i++){
            ch = q1.get();

            System.out.println(ch);
        }

        System.out.println("\n");

        System.out.println("Contents of q3: ");
        for(i=0; i < 10; i++){
            ch = q3.get();
            System.out.println(ch);
        }
    }
}
