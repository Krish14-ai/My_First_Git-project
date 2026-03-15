public class stacks_byArrays {
    public static class Stack {
    int stack [];
    int top;
    int capacity;
    Stack(int size){
        capacity = size;
        stack = new int[size];
        top = -1;
    }

    // push function to add an item to the stack
    public void push(int x){ // time complexity is O(1)
        
        if(top ==capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }
    // pop function to remove an item from the stack
    public int pop(){ // time complexity is O(1)
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // peek function to return the top element of the stack
    public int peek(){ // time complexity is O(1)
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];

    }
    // isEmpty function to check if the stack is empty
    public boolean isEmpty(){ // time complexity is O(1)
        return top == -1;
    }
    // size function to return the size of the stack
    public int size(){ // time complexity is O(1)
        return top + 1;
    }
    // display function to print the elements of the stack
    public void display(){ // time complexity is O(n)
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }
}
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20); 
        s.push(30);
        System.out.println("Top element is: " + s.peek());
        s.display();
    }
}
