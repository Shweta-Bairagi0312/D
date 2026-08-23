public class Q2 {

    static class Queue {
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // Check if queue is empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Check if queue is full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add element
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // First element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove element
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int res = arr[front];

            // If only one element is present
            if (rear == front) {
                rear = -1;
                front = -1;
            } else {
                front = (front + 1) % size;
            }

            return res;
        }

        // Get front element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());

        q.add(4);

        System.out.println(q.peek());
    }
}