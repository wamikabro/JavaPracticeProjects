package javaBeginnersGuideProjects.GettingDeeper.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamReduceDemo {
    public static void main(String[] args) {
        // create a non-dynamic list of integers
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);

        // demonstration of reduce method
        // sum of all the even numbers
        int even = number.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (ans, i) -> ans + i);

        System.out.println(even);
    }
}
