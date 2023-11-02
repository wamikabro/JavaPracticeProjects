package javaBeginnersGuideProjects.GettingDeeper.StreamAPI;
import java.util.*;
import java.util.stream.*;

public class StreamSortedDemo {
    public static void main(String[] args) {
        // create a list of String
        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream");

        // sorted method will sort from A to Z
        List<String> show
                = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(show);
    }
}
