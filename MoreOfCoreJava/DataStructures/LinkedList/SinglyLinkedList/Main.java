package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListt<String> linkedList = new LinkedListt<>();

        linkedList.addFirst("My");
        linkedList.add("Name");
        linkedList.add("Is");
        linkedList.add("Wamique");

        System.out.println(linkedList.get(3));

        linkedList.add(3,"Haha");

        System.out.println(linkedList.get(3));
        System.out.println(linkedList.get(4));

        linkedList.addLast("Homie");
        linkedList.removeFirst();
        linkedList.removeLast();

        linkedList.printList();

        System.out.println(linkedList.getSize());

    }
}
