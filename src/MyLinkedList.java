
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
        newNode.setNext(target.getNext());
        target.setNext(newNode);
    }
    
    public void addOneNodeAsHead(Node newNode){
        newNode.setNext(head);
        head = newNode;
    }
    
    
    public void printData(){
        Node thisNode = this.head;
        
        if (thisNode == null) { return; }
        else {

            System.out.println(thisNode.getData());
            
            while (thisNode.getNext() != null) {
                thisNode = thisNode.getNext();
                System.out.println(thisNode.getData());
            }
                
        }
        
    }
    
    public int countNodes(Node head){
        if (head == null) { return 0; }
        else if (head.getNext() == null) { return 1; }
        else {
            return 1 + countNodes(head.getNext());
        }
    }
}
