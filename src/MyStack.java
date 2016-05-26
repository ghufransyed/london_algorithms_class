/**
 * Created by ghufran on 5/26/16.
 */
public class MyStack {
    private Node head;
    
    public MyStack() {
        head = null;
    }
    
    public MyStack(Node firstNode) {
        head = firstNode;
    }
    
    
    public void push(Object data){

        Node newNode = new Node(data);
        
        if (isEmpty()){
            head = newNode;
        }
        else{
            Node oldHead = head;
            head = newNode;
            head.setNext(oldHead);
        }
        
        return ;  // to be tested
    }
    
    public Object pop(){
        if (isEmpty()){
           return "Stack empty";
        }
        else {
            Object result = head.getData();
            head = head.getNext();

            return result;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public Object top(){
        return head.getData() ; // to do
    }
    
    // no full() method required for linked list implementation (only for array implementation)
    
}
