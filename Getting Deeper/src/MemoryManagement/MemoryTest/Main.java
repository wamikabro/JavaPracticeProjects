package MemoryManagement.MemoryTest;
// An interesting exercise to understand how is memory being managed.
// We are supposed to dry run the code and make a chart in our head or somewhere on paper just to realize
// how is memory being used stack and heap. And through that we have to figure out the output of the program
// if we get the right output, that means we've understood the work of memory, otherwise more clarity of concepts is needed.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start(){
        String last = "Z";
        Container container = new Container();
        container.setInitial("C");
        another(container, last);
        System.out.println(container.getInitial());
    }

    public void another(Container initialHolder, String newInitial){
        newInitial.toLowerCase();
        initialHolder.setInitial("B");
        Container initial2 = new Container();
        initialHolder=initial2;
        System.out.println(initialHolder.getInitial());
        System.out.println(newInitial);

    }
}
