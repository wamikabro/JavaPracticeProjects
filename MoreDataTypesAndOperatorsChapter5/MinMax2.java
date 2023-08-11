package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class MinMax2 {
    public static void main(String[] args) {
        int nums[] = {100, -34, 343, 324, 54, 223, 5};

        int min, max;

        min = max = nums[0];
        for(int i=1; i < 10; i++){
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("min and max: " + min + " " + max);
    }
}
