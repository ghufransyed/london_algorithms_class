import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        
        MyBinaryTree tree = new MyBinaryTree();
        tree.addLeftSubTree(new MyBinaryTree());
        tree.addRightSubTree(new MyBinaryTree());
        
        tree.root.setData(1); 
        tree.root.getleftChildTreeNode().setData(2);
        tree.root.getrightChildTreeNode().setData(3);
        
        System.out.println(tree.root.getData());
        System.out.println(tree.root.getleftChildTreeNode().getData());
        System.out.println(tree.root.getrightChildTreeNode().getData());
        
        
        
        /*
        Scanner in = new Scanner(System.in);
        MyStack stack = new MyStack();
        String inputString;
        
        
        System.out.println("Please enter a few lines of strings (ended by 'end-of-input')");

        inputString = in.nextLine(); 
        while (! inputString.equalsIgnoreCase("end-of-input")){
            stack.push(inputString);
            inputString = in.nextLine(); 
        }
        
        System.out.println("The reversed sequence of strings is: ");
        
        while (! stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
       */

        /*
        Scanner in = new Scanner(System.in);
        MyStack stack = new MyStack();
        MyQueue queue = new MyQueue();
        String inputString;


        System.out.println("Please enter a few lines of strings (ended by 'end-of-input')");

        inputString = in.nextLine();
        while (! inputString.equalsIgnoreCase("end-of-input")){
            queue.addToQueue(inputString);
            inputString = in.nextLine();
        }

        System.out.println("The non-reversed sequence of strings is: ");

        while (! queue.isEmpty()){
            System.out.println(queue.takeFromQueue());
        }
        
       */ 
        
        
        
        
        
        /*
        MyStack testStack1 = new MyStack();
        System.out.println("Stack empty? " + testStack1.isEmpty());
        
        testStack1.push(1);
        System.out.println("Stack empty? " + testStack1.isEmpty());
        System.out.println("The value of the top node is " + testStack1.top());

        testStack1.push(2);
        System.out.println("Stack empty? " + testStack1.isEmpty());
        System.out.println("The value of the top node is " + testStack1.top());


        testStack1.push(3);
        System.out.println("Stack empty? " + testStack1.isEmpty());
        System.out.println("The value of the top node is " + testStack1.top());


        System.out.println("Stack empty? " + testStack1.isEmpty());
        System.out.println("The value of pop()" + testStack1.pop());

        System.out.println("Stack empty? " + testStack1.isEmpty());
        System.out.println("The value of pop()" + testStack1.pop());

        System.out.println("Stack empty? " + testStack1.isEmpty());
        System.out.println("The value of pop()" + testStack1.pop());

        System.out.println("Stack empty? " + testStack1.isEmpty());
        System.out.println("The value of pop()" + testStack1.pop());
        
         */
        
        
        
        
        
        
        
        
        
        
        
       /* 
        MyLinkedList l = new MyLinkedList();
        
        
        Node a = new Node("mouse");
        Node b = new Node("the");
        Node c = new Node("ate");
        Node d = new Node("cat");
        Node e = new Node("the"); 
        
        
        l.addOneNodeAsHead(e);
        l.addOneNodeAfter(e,d);
        l.addOneNodeAfter(d,c);
        l.addOneNodeAfter(c,b);
        l.addOneNodeAfter(b,a);
        
        l.printData();
        
        System.out.println(l.countNodes(l.head));
        */
        
        
        
        
        
    }
}
