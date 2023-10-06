package javaBeginnersGuideProjects.EnumerationsAutoboxingStaticImportAndAnotationsChapter12;
enum Transport2{
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
public class EnumerationDemo2 {
    public static void main(String[] args) {
        Transport2 tp;

        System.out.println("Here are all Transport constants.");

        // using values()
        Transport2 allValues[] = Transport2.values();
        for(Transport2 t: allValues){
            System.out.println(t);
        }

        System.out.println();

        // use valueOf()
        tp = Transport2.valueOf("TRAIN");
        System.out.println("tp contains " + tp);
    }
}
