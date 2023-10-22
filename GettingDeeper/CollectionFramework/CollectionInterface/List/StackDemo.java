package javaBeginnersGuideProjects.GettingDeeper.CollectionFramework.CollectionInterface.List;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Stack is also from the List Interface
        Stack<Integer> stack = new Stack<>();

        // to check if stack is empty
        System.out.println(stack.empty());

        // it will keep on pushing the new element on the top of the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // it will return the top element
        System.out.println(stack.peek());

        // it will return and remove the top element
        System.out.println(stack.pop());

        // check the number of elements in stack
        System.out.println(stack.size());

    }
}
