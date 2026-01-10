public class link_list {
    public class Node{
        int data;
        Node next;
    }
    link_list(){
        this.size=0;
    }
    private Node head;
    private int size;
    
    public void add(int data){
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
      
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        
    }
}
