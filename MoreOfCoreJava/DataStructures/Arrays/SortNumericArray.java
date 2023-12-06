package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.Arrays;

import java.util.Arrays;

public class SortNumericArray {
    public static void main(String[] args) {
        int[] numbers = {1,4,3,2,5};
        Arrays.sort(numbers); // method to sort an array
        System.out.println(Arrays.toString(numbers));
    }
}
