package collection.queue;

import java.util.NoSuchElementException;

class CustomQueue<T> {
    private int size;
    private int capacity = 10;
    private T[] arr;

    @SuppressWarnings("unchecked")
    CustomQueue() {
        arr = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        if(size == 0)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[size - 1]).append("]");

        return sb.toString();
    }

    public boolean add(T data) {
        if(size == capacity)
            grow();
        arr[size++] = data;
        return true;
    }

    public boolean offer(T data) {
        add(data);
        return true;
    }

    public T remove() {

        if(size == 0)
            throw new NoSuchElementException("Queue is empty");

        T value = arr[0];
        for(int i = 0; i < size - 1; i++)
            arr[i] = arr[i + 1];
        size--;

        return value;
    }

    public T poll() {
        if(size == 0)
            return null;

        T value = arr[0];
        for(int i = 0; i < size - 1; i++)
            arr[i] = arr[i + 1];
        size--;

        return value;
    }

    public T element() {
        if(size == 0)
            throw new NoSuchElementException("Queue is empty");
        return arr[0];
    }

    public T peek() {
        if(size == 0)
            return null;
        return arr[0];
    }

    private void grow() {
        capacity += capacity / 2;
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(arr, 0, newArray, 0, size);
        arr = newArray;
    }
}

public class CustomQueueDemo {
    private static void method1() {

        CustomQueue<String> q = new CustomQueue<>();
//        System.out.println(q.isEmpty());
//        System.out.println(q.size());
//        System.out.println(q.capacity());
        q.add("Ajan");
        q.add("Vinu");
        q.add("Subash");
        q.offer("Jegan");
        System.out.println(q);

//        System.out.println("remove: " + q.remove());
//        System.out.println("poll: " + q.poll());
//        System.out.println(q);

//        System.out.println("element: " + q.element());
//        System.out.println("peak: " + q.peek());
//        System.out.println(q);





    }
    public static void main(String[] args) {
        method1();
    }
}
