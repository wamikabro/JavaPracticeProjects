package MemoryManagement.GarbageCollection;

public class ForcingIntoPool {
    public static void main(String[] args) {
        /*// java still can not decide somethings to be same. suppose
        String three = Integer.toString(75);
        String four = "75";*/

        // now the "three" is forced into pool. So same string values can now be pointed out by different variables.
        String three = Integer.toString(75).intern();

        String four = "75";

        // now both of them will be same since both the variables are pointing towards same memory location in heap
        if(three == four){
            System.out.println(three + " and " + four + " are same objects");
        }else{
            System.out.println(three + " and " + four + " are different objects");
        }

        // although intern won't be used until a case like this occurs. but why will you still use it?
        // when you know, the string is going to be used a lot, and it's somewhat a "calculated string"
        // you can push it into pool for the better memory management.
    }
}
