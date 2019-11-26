import Queue;

class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        try {
            q.enQueue(6);
        } catch (IllegalStateException e) {
            System.out.println(e);
        }

        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        try {
            q.deQueue();
        } catch (IllegalStateException e) {
            System.out.println(e);
        }

        System.out.println(q);
    }
    
}
