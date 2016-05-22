/**
 * Created by ghufran on 5/21/16.
 */
public class Node {

    private Object data;
    private Node next;
    

    public Node(Object newItem){
        data = newItem;
        next = null;
    }

    public Node(Object newItem, 
                Node nextNode){
        data = newItem;
        next = nextNode;
    }
    
    public void setData(Object newData){
        data = newData;
    }
    
    public Object getData(){
        return data;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node nextNode){
        next = nextNode;
    }
    
    
}
