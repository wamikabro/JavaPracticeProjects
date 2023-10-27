package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.CollectionInterface.List;

import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        // create an array list
        ArrayList<Integer> list = new ArrayList<>();

        // add some elements
        list.add(1);
        list.add(2);
        list.add(5);

        // display all elements
        for(int element: list){
            System.out.print(element + ", ");
        }
        // to keep it separate from other output to come
        System.out.println();

        // remove 3rd element
        list.remove(2);

        // display final elements
        for(int element: list){
            System.out.print(element + ", ");
        }
    }
}
