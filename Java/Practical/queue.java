public class queue {
    public class Queue{
        public Queue(int size){
            this.q = new int[size];
        }

       int front, rear, capacity;
        public int q[] = new int[100];
        // function to add an item to the queue
        public void enqueue(int x){ // time complexity is O(1)
            if(rear == capacity-1){
                System.out.println("Queue Overflow");
                return;
            }
            q[++rear] = x;
        }
        // function to remove an item from the queue
        public int dequeue(){ // time complexity is O(1)
            if(front == rear){
                System.out.println("Queue Underflow");
                return -1;
            }
            return q[++front];
        }
        // function to return the front element of the queu
        public int peek(){ // time complexity is O(1)
            if(front == rear){
                System.out.println("Queue is empty");
                return -1;
            }
            return q[front + 1];
        }
        // function to check if the queue is empty
        public boolean isEmpty(){ // time complexity is O(1)
            return front == rear;
        }
        // function to return the size of the queue
        public int size(){ // time complexity is O(1)
            return rear - front;
        }

    }
    public static void main(String[] args) {
        
    }
}
