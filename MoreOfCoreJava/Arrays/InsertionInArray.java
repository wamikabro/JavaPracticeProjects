package javaBeginnersGuideProjects.MoreOfCoreJava.Arrays;

import java.util.Scanner;

public class InsertionInArray {
    public static void main(String[] args) {
        int n, newValueIndex, newValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        n = scanner.nextInt();

        int a[] = new int[n];
        int b[] = new int[n+1];

        System.out.println("Enter values");
        for(int i=0; i<n; i++)
            a[i] = scanner.nextInt();

        System.out.print("Enter index for new value to be inserted: ");
        newValueIndex = scanner.nextInt();

        System.out.print("Enter new value to be inserted: ");
        newValue = scanner.nextInt();

        for(int i=0; i<n+1; i++)
            if(i<newValueIndex)
                b[i] = a[i];
            else if (i==newValueIndex)
                b[i] = newValue;
            else
                b[i] = a[i-1];

        System.out.println("Elements are: ");
        for(int i=0; i<=n; i++)
            System.out.print(b[i] + " ");
    }
}
