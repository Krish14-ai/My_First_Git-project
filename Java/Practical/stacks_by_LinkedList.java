public class stacks_by_LinkedList {

    static class Stack {
        int size =0;
        static class Node {
            int val;
            Node next;

            private Node(int val) {
                this.val = val;
                this.next = null;
            }
        }

        Node head; // top of stack

        Stack() {
            head = null;
        }

        // PUSH → O(1)
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        // POP → O(1)
        public int pop() {
            if (head == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
            
        }

        // DISPLAY
        private void display() {
            if (head == null) {
                System.out.println("Stack is empty");
                return;
            }
            Node temp = head;
            System.out.println("Stack elements:");
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
        //ISEMPTY → O(1)
        private boolean isEmpty() {
            return head == null;
        }

        // size
        private int size() {
            return size;
        }
        public static void main(String[] args) {
            Stack st = new Stack();

            st.push(3);
            st.push(5);
            st.push(7);
            System.out.println("Size: " + st.size());
            st.display();

            int b = st.pop();
            System.out.println("Popped: " + b);
            System.out.println(st.isEmpty());
            System.out.println("Size: " + st.size());
            st.display();

        }
    }
}
