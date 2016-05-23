public class Main {

    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        
        
        Node a = new Node("mouse");
        Node b = new Node("the");
        Node c = new Node("ate");
        Node d = new Node("cat");
        Node e = new Node("the"); 
        
        l.head = e; 
        
        l.addOneNodeAfter(e,d);
        l.addOneNodeAfter(d,c);
        l.addOneNodeAfter(c,b);
        l.addOneNodeAfter(b,a);
        
        l.printData();
        
    }
}
