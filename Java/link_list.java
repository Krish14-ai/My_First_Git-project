public class link_list {
    public class Node{ // Node class this act as Connecting link between two nodes
        int data;
        Node next;
    }
    link_list(){
        this.size=0;
    }
    private Node head;
    private int size;
    
    public void add(int data){ // add at last
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=null;
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
      
    public int getSize(){  // size of linked list
        return size;
    }

    public static void main(String[] args) {
        link_list ll=new link_list();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.display(); // 10 -> 20 -> 30 -> null
        System.out.println("Size of linked list: "+ll.getSize()); // Size of linked list: 3
    }
}
