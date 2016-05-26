/**
 * Created by ghufran on 5/26/16.
 */
public class MyQueue {
    private Node front;
    private Node back;
    
    public MyQueue(){
        front = null;
        back = null;
        
    }
    
    public MyQueue(Object data){
        front = new Node(data);
        back = front;
    }
    
    public boolean isEmpty(){
        return (front == null);
    }
    
    public void addToQueue(Object data){
        Node newNode = new Node(data);
        if (isEmpty()){
            front = newNode;
            back = front;
        }
        else {
            back.setNext(newNode);
            back = newNode;
        }
    }

    public Object takeFromQueue(){
        Object result;
        if (isEmpty()){
            return "The Queue is Empty";
        }
        else{
            result = front.getData();
            front = front.getNext();
            return result;
        }

    }
    
    
}
