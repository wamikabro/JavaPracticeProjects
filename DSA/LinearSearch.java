public class LinearSearch {
    public static int linearSearch(int array[], int key){
        for(int i=0; i<=array.length; i++)
            if(array[i] == key)
                return i;

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5,10,30,2,6};
        int key = 10;
        int result = linearSearch(numbers, key);

        if(result == -1)
            System.out.println("Value not found.");
        else
            System.out.printf("Value is on index: " + result);
    }
}
