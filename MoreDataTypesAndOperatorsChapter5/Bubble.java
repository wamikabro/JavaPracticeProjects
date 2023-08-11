package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {43, 53, 234, 643, 363, 324};

        int a, b, t;
        int size;

        size = 6;

        // original array
        System.out.println("Original Array is: ");
        for(int i=0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();

        // Bubble Sort
        for(a=1; a < size; a++)
            for(b=size-1; b >= a; b--)
                if(nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }

        // displaying sorted array
        System.out.println("Sorted array is: ");
        for(int i=0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();

    }
}
