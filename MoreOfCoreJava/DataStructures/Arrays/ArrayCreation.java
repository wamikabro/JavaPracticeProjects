package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.Arrays;
import java.util.Scanner;
public class ArrayCreation {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        n = scanner.nextInt();

        int a[] = new int[n];
        System.out.println("Enter values");
        for(int i=0; i<n; i++)
            a[i] = scanner.nextInt();

        System.out.println("Elements are: ");
        for(int i=0; i<n; i++)
            System.out.print(a[i]);
    }
}
