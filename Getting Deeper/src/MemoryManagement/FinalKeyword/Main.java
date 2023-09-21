package MemoryManagement.FinalKeyword;

public class Main {
    public static void main(String[] args) {
        // first of all, final doesn't mean values won't change.
        // it only means that the reference can not refer to any other thing now
        final Customer c = new Customer("John");

        // we can not refer to any other customer object using c
        // c = new Customer("Sam");
        // it will generate error since it is final.

        // But we can still change values inside Customer object that's being refered by
        // c

        // this method call isn't safe
        System.out.println(c.getName());
        // the method call above has called getName, even it is changing the name
        // and ruining our method, (look at customer class)
        // the example doesn't make sense, it's a proof that value inside it isn't final.
        // and the references can ruin things if put in wrong hangs.


    }
}
