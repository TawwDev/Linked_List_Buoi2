
package mylinkedlist;

public class MyLinkedList {
    private Node head;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        while(null != temp.next){
            temp = temp.next;
        }
        temp.next = newNode;
        
    }
    
    public void addPosition(int index, int data){
        Node newNode = new Node (data);
        if(index ==0){
            newNode.next = head;
            head = newNode; 
            return;
        } else{
            Node temp = new Node();
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            Node current = temp.next;
            temp.next = newNode;
            newNode.next = current;
        }   
    }
    /*
    viet code cho ham sau
            1.public int length():
            2. public void display()
            3. public void deleteFirst()

    */
    
    public int length(){
        Node temp = head;
        int count =0;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        return count;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public void deleteFirst(){
        if(head == null){
            return;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
    }
    
    
}
