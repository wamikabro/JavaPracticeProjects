package javaBeginnersGuideProjects.GenericsChapter13.Queue;
// Demonstrating a generic queue class.
public class GenQDemo {
    public static void main(String[] args) {
        // Create an integer queue.
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers.");
        try{
            for(int i=0; i < 5; i++){
                System.out.println("Adding " + i + " to q.");
                q.put(i); // add integer value to q
            }
        } catch (QueueFullException e) {
            System.out.println(e);
        }

        System.out.println();

        // Create a String queue.
        String sStore[] = new String[10];
        GenQueue<String> q2 = new GenQueue<>(sStore);

        String sVal;

        System.out.println("Demonstrate a queue of Strings.");
        try{
            for(int i=0; i < 5; i++){
                System.out.println("Adding Hello "+i+" to q2.");
                q2.put(String.format("Hello %d", i));
            }
        }catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try{
            for(int i=0; i < 5; i++){
                System.out.print("Getting next String form q2: ");
                sVal = q2.get();
                System.out.println(sVal);
            }
        }catch(QueueEmptyException exc){
            System.out.println(exc);
        }
    }
}
