package javaBeginnersGuideProjects.GettingDeeper.StreamAPI;

import java.util.*;
import java.util.stream.*;

public class StreamFilterDemo {
    public static void main(String[] args) {
        // create a list of String
        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream");

        // demonstration of filter method
        List<String> result
                = names.stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());

        // now it will display strings those start with uppercase S only.
        System.out.println(result);
    }
}
