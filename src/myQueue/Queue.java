package myQueue;

public class Queue {

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public Node get(int index){
        if (size == 0){
            System.out.println("Empty list");
            return null;
        }

        if (index < 0 || index > size - 1){
            System.out.println("Input correct index!");
            return null;
        }

        int i = 0;
        Node holder = head;
        while (i < index){
            holder = holder.getNext();
            i++;
        }
        return holder;
    }

    public void add(double value) {
        Node node = new Node(value, null);

        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }

        size++;
    }

    public Node peek(){
        if (size != 0) {
            return head;
        }
        return null;
    }

    public Node poll(){
        Node holder = head;
        head = holder.getNext();
        size--;
        return holder;
    }

    public void deleteLast(){
        if (size == 0){
            System.out.println("Nothing to delete!");
            return;
        }

        if (size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }

        Node holder = head;
        int i = 1;
        while (i < (size - 1)){
            holder = holder.getNext();
            i++;
        }
        holder.setNext(null);
        tail = holder;
        size--;
    }

    public void printAll() {
        if (size == 0) {
            System.out.println("Empty list!");
            return;
        }

        Node holder = head;

        System.out.println("Queue [");
        while (true){
            System.out.println(holder);
            holder = holder.getNext();
            if (holder == null){
                break;
            }
        }
        System.out.println("]");
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }
}
