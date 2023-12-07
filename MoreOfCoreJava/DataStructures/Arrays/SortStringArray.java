package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.Arrays;

import java.util.Arrays;

public class SortStringArray {
    public static void main(String[] args) {
        String[] names = {"harsh", "amir", "batool", "rida"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
    }
}
