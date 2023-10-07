package javaBeginnersGuideProjects.MoreOfCoreJava.Arrays;

import java.util.Scanner;

public class DeletionOfAnElementInArray {
    public static void main(String[] args) {
        int n, deleteValueIndex;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        n = scanner.nextInt();

        int a[] = new int[n];
        int b[] = new int[n-1];

        System.out.println("Enter values");
        for(int i=0; i<n; i++)
            a[i] = scanner.nextInt();

        System.out.print("Enter index of value to be deleted: ");
        deleteValueIndex = scanner.nextInt();


        for(int i=0; i<a.length; i++)
            if(i<deleteValueIndex)
                b[i] = a[i];
            else if(i==deleteValueIndex)
                continue;
            else
                b[i-1] = a[i];

        System.out.println("Elements are: ");
        for(int i=0; i<b.length; i++)
            System.out.print(b[i] + " ");
    }
}
