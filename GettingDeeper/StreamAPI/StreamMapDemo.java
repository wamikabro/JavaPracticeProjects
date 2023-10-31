package javaBeginnersGuideProjects.GettingDeeper.StreamAPI;
import java.util.*;
import java.util.stream.*;

public class StreamMapDemo {
    public static void main(String[] args) {
        // create a non-dynamic list of integers
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);

        // use the map method to manipulate things
        // and store the results in another list called square
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());

        // print the list containing squares
        System.out.println(square);
    }
}
