package javaBeginnersGuideProjects.GettingDeeper.MemoryManagement;

public class PassingByValue {
    public static void main(String[] args) {
        // initializing local value to 5
        int localValue = 5;

        // passing by value to the method: passing copy of the actual value
        calculate(localValue);

        // it will print same 5 because the method had its own copy of value
        // keeping the real value unchanged.
        System.out.println(localValue);
    }

    public static void calculate(int calcValue){
        calcValue = calcValue * 100;
    }
}
