
package mylinkedlist;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();    
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        
        linkedList.display();
        // 1 --> 2 --> 3 --> null
        
        System.out.println("Length: " + linkedList.length());
        
        linkedList.deleteFirst(); 
        linkedList.display();
        // 2 --> 3 --> null
    }
    
    
}
