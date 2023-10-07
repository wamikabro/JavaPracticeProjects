package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.Arrays.CustomDynamicArray;

public class Main {
    public static void main(String[] args) {
        Array<String> array = new Array<>(2);

        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");


        // Hurray it's working!!!
        System.out.println(array.size());
        System.out.println(array);
    }
}
