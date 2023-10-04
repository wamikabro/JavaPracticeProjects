package MemoryManagement.GarbageCollection;

public class StringInternalization {
    public static void main(String[] args) {
        // Although we have created two string objects, but java is smart enough to know that both are same
        // and since String is immutable, so both the variables are saved once in heap and pointing towards the same value.
        String one = "hello";
        String two = "hello";

        // checking strings with == instead of .equals() will compare their memory references instead of the value
        // that's why since our strings "hello" are just same, they'll give us output "they're the same objects"
        if(one == two){
            System.out.println("they are the same objects.");
        }else{
            System.out.println("they are different objects.");
        }

        // java still can not decide somethings to be same. suppose
        String three = Integer.toString(75);
        String four = "75";

        // the result of this if else seems wrong, just because java is not capable of keeping both these values in the same pool.
        // so for java, both of them are different, although they're same in reality.
        // to do the reality check, we could've used .equals method of String class.
        if(three == four){
            System.out.println(three + " and " + four + " are same objects");
        }else{
            System.out.println(three + " and " + four + " are different objects");
        }

        // now checking three and four using .equals
        // this is giving us the right result now.
        if(three.equals(four)){
            System.out.println(three + " and " + four + " are same objects");
        }else{
            System.out.println(three + " and " + four + " are different objects");
        }
    }
}
