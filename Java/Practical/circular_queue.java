public class circular_queue {
    public class CircularQueue {
        private int[] queue;
        private int front;
        private int rear;
        private int size;

        // this is the constructor of the circular queue class which initializes the queue with a given capacity and sets the front, rear, and size variables. 

        public CircularQueue(int capacity) { 
            queue = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        // this method adds an element to the rear of the queue.
        public void enqueue(int value) {
            if (size == queue.length) {
                System.out.println("Queue is full");
                return;
            }
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            size++;
        }

// this method removes and returns the element at the front of the queue.
        public int dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1; // Return -1 to indicate the queue is empty
            }
            int value = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return value;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == queue.length;
        }

        public int getSize() {
            return size;
        
        }

    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new circular_queue().new CircularQueue(5);

        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);

        System.out.println("Dequeue: " + circularQueue.dequeue());
        System.out.println("Dequeue: " + circularQueue.dequeue());

        circularQueue.enqueue(60);
        circularQueue.enqueue(70); // This will show "Queue is full"

        while (!circularQueue.isEmpty()) {
            System.out.println("Dequeue: " + circularQueue.dequeue());
        }

        System.out.println("Dequeue: " + circularQueue.dequeue()); // This will show "Queue is empty"
    }
}
