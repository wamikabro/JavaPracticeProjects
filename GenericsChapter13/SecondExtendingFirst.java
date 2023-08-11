package javaBeginnersGuideProjects.GenericsChapter13;

class TwoGenerics2<T, V extends T>{

    T object1;
    V object2;

    TwoGenerics2(T object1, V object2){
        this.object1 = object1;
        this.object2 = object2;
    }

    void ShowTypes(){
        System.out.println("T Type: " +
                object1.getClass().getName());
        System.out.println("V Type: " +
                object2.getClass().getName());
    }
}


public class SecondExtendingFirst {
    public static void main(String[] args) {
        TwoGenerics2<Integer, Integer>
                obj = new TwoGenerics2<>(1, 1);

    }
}
