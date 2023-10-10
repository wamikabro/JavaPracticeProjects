package javaBeginnersGuideProjects.MoreOfCoreJava.DataStructures.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>("How");
        stack.push("Are");
        stack.push("You");

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println("Size is: " + stack.size());
    }
}
