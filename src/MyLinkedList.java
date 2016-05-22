
/**
 * Created by ghufran on 5/21/16.
 */
public class MyLinkedList {
    Node head;
    
    public MyLinkedList(){
        head = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addOneNodeAfter(Node target, 
                                Node newNode){
        newNode.setNext = target.getNext();
        target.setNext = newNode;
    }
    
    public void addOneNodeBeforeHead(Node newNode){
        newNode.next = head;
        head = newNode;
    }
}
