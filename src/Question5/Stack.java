package Question5;

public class Stack {
    private int[] array;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push element " + element + ".");
            return;
        }
        array[++top] = element;
        System.out.println("Pushed element: " + element);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Cannot pop element.");
            return Integer.MIN_VALUE;
        }
        int poppedElement = array[top--];
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.push(60);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }

}
