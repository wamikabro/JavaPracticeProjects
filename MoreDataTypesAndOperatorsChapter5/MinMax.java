package javaBeginnersGuideProjects.MoreDataTypesAndOperatorsChapter5;

public class MinMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;

        nums[0] = 22;
        nums[1] = 322;
        nums[2] = 332;
        nums[3] = 34;
        nums[4] = 4;
        nums[5] = 43;
        nums[6] = 67;
        nums[7] = 71;
        nums[8] = 78;
        nums[9] = 94;

        min = max = nums[0];
        for(int i=1; i < 10; i++){
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("min and max: " + min + " " + max);
    }
}
