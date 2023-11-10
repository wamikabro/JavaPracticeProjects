package javaBeginnersGuideProjects.GettingDeeper.StreamAPI.EmployeeProject;

import java.util.stream.Stream;

public class LimitInfiniteData {
    public static void main(String[] args) {
        Stream.generate(Math::random) // generate random values forever
                .limit(5) // limit the values to 5 only
                .forEach(System.out::println); // print each
            //  .forEach(value -> System.out.println(value);
    }
}
