import org.w3c.dom.Node;

public class JLinklist <T> {
    Node head;
    class Node{
        T data;
        Node next;
    Node(){
        data = null;
        next= null; 
    }
    Node( T d){ 
        data = d;
        next = null;
    }
}
JLinklist(){
    head= new Node();
}
public void insertinfont( T data) {
    Node newNode = new Node(data);
    newNode.next = this.head.next;
    this.head.next = newNode;
}
public void insertend(  T data) {
    Node newNode = new Node(data);
    newNode.next = null;
    Node temp = this.head;
    while (temp != null) {
        temp = temp.next;
    }
    temp.next = newNode;
}
    public void insertkey(T data, T key) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = this.head;
        boolean status = false;
        while(temp != null) {
            if(temp.data==key){
            status = true;
            break;
            }
            temp=temp.next;
            if (status) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        } 
    }
    public void printlist() {
        Node currnNode = this.head.next;
        System.out.println("Linklist :");
        while (currnNode != null) {
            System.out.print(currnNode.data + " ");
            currnNode = currnNode.next;
        }
        System.out.println();
        
    }
   /*  public static void main(String[] args) {
        JLinklist <Integer> list = new JLinklist <Integer> ();
        list.insertinfont(9);
        list.printlist();   

    }   */
}


