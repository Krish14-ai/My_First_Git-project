public class hash_set {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public class Hashset {
        Node[] buckets;
        int size;
        public Hashset(int size) {
            this.size = size;
            this.buckets = new Node[size];
        }
        public void add(int key) {
            int index = key % size;
            Node newNode = new Node(key);
            if (buckets[index] == null) {
                buckets[index] = newNode;
            } else {
                Node current = buckets[index];
                while (current.next != null) {
                    if (current.data == key) {
                        return; // Key already exists, do not add
                    }
                    current = current.next;
                }
                if (current.data == key) {
                    return; // Key already exists, do not add
                }
                current.next = newNode;
            }
        }
        public boolean contains(int key) {
            int index = key % size;
            Node current = buckets[index];
            while (current != null) {
                if (current.data == key) {
                    return true; // Key found
                }
                current = current.next;
            }
            return false; // Key not found
        }
        public void remove(int key) {
            int index = key % size;
            Node current = buckets[index];
            Node prev = null;
            while (current != null) {
                if (current.data == key) {
                    if (prev == null) {
                        buckets[index] = current.next; // Remove head of the list
                    } else {
                        prev.next = current.next; // Bypass the current node
                    }
                    return; // Key removed
                }
                prev = current;
                current = current.next;
            }
        }
        public void display() {
            for (int i = 0; i < size; i++) {
                Node current = buckets[i];
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
            }
            System.out.println();
        }
        public void clear() {
            for (int i = 0; i < size; i++) {
                buckets[i] = null; // Clear all buckets
            }
        }
        public int size() {
            int count = 0;
            for (int i = 0; i < size; i++) {
                Node current = buckets[i];
                while (current != null) {
                    count++;
                    current = current.next;
                }
            }
            return count;
        }
        
        public boolean isEmpty() {
            for (int i = 0; i < size; i++) {
                if (buckets[i] != null) {
                    return false; // At least one bucket is not empty
                }
            }
            return true; // All buckets are empty
        }
    }
    public static void main(String[] args) {
        
    }
}
