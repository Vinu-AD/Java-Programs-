package collection.list;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

class CustomStack<T> {
    private int size;
    private int capacity = 10;
    private T[] arr;

    @SuppressWarnings("unchecked")
    CustomStack() {
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

    public T push(T data) {
        if(size == capacity)
            grow();
        arr[size++] = data;
        return data;
    }

    public T pop() {
        if(size == 0)
            throw new NoSuchElementException("Empty list");
        return arr[--size];
    }

    public T peek() {
        if(size == 0)
            throw new EmptyStackException();
        return arr[size-1];
    }

    public int search(T data) {
        for(int i = size - 1; i >= 0; i--)
            if(arr[i].equals(data))
                return size - i;

        return -1;
    }

    @SuppressWarnings("unchecked")
    private void grow() {
        capacity += capacity / 2;
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(arr, 0, newArray, 0, size);
        arr = newArray;
    }
}

public class CustomStackDemo {
    private static void method1() {
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(3);
        stack.push(5);
        stack.push(8);
        stack.push(1);
        stack.push(8);
        stack.push(6);
        stack.push(5);
        stack.push(0);
        stack.push(7);
        stack.push(4);
        stack.push(2);
//        System.out.println(stack.push(9));
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack);

//        System.out.println(stack.isEmpty());
//        System.out.println(stack.size());
//        System.out.println(stack.capacity());
        System.out.println(stack.search(0));
        System.out.println(stack);
    }
    public static void main(String[] args) {
        method1();
    }
}
