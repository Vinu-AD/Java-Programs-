package collection.list;

import java.util.ArrayList;
import java.util.Collection;

class CusAL<T> {
    private int size;
    private int capacity = 10;
    private T[] arr;

    @SuppressWarnings("unchecked")
    CusAL() {
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
            sb.append(arr[i] + ", ");
        }
        sb.append(arr[size - 1] + "]");

        return sb.toString();
    }

    public boolean add(T data) {
        if(size == capacity)
            grow();
        arr[size++] = data;
        return true;
    }

    public boolean add(int index, T data) {
        if(size == capacity) grow();
        if(indexCheck(index)) {
            // shifting
            shift(arr, index, size, 1);
            arr[index] = data;
            size++;
        }
        return true;
    }

    public void addFirst(T data) {
        add(0, data);
    }
    public void addLast(T data) {
        add(data);
    }

    public boolean addAll(Collection<T> list) {
        Object[] elements = list.toArray();
        for (Object element : elements) {
            add((T)element);
        }
        return true;
    }

    public boolean addAll(int index, Collection <T> list) {
        Object[] elements = list.toArray();
        int len = list.size();
        capacity += capacity + len;

        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[capacity];
        if (size >= 0)
            System.arraycopy(arr, 0, newArray, 0, size);

        shift(newArray, index, size, len);

        for(int i = 0; i < len; i++) {
            newArray[index + i] = (T) elements[i];
        }
        size += len;
        arr = newArray;
        return true;
    }

    public boolean set(int index, T value) {
        indexCheck(index);
        arr[index] = value;
        return true;
    }

    public T remove(int index) {
        indexCheck(index);
        T value = arr[index];
        for(int i = index; i < size - 1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
        return value;
    }

    public boolean remove(T data) {

        boolean removed = false;
        for(int i = 0; i < size; i++) {
            if(arr[i] == data) {
                removed = true;
                for(int j = i; j < size; j++) {
                    arr[j] = arr[j+1];
                }
                size--;
            }
        }
        return removed;
    }

    public boolean removeFirst() {
        if(size == 0)
            throw new IndexOutOfBoundsException("Empty list");
        for(int i = 0; i < size - 1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
        return true;
    }

    public boolean removeLast() {
        if(size == 0)
            throw new IndexOutOfBoundsException("Empty list");
        size--;
        return true;
    }

    public <E> boolean removeAll(Collection<? extends E> list) {
        Object[] removeArr = list.toArray();
        boolean found = false;
        for(int i = 0; i < size; ) {
            Object ob = arr[i];
            for (Object e : removeArr) {
                if (ob == e) {
                    found = true;
                    break;
                }
            }
            if(found) {
                for(int j = i; j < size; j++) {
                    if(ob.equals(arr[j])) {
                        for (int k = j; k < size - 1; k++) {
                            arr[k] = arr[k + 1];
                        }
                        size--;
                    }
                }
                found = false;
            }
            else i++;
        }
        return true;
    }

    public <E> boolean retainAll(Collection<? extends E> list) {
        Object[] removeArr = list.toArray();
        boolean found = true;
        for(int i = 0; i < size; i++) {
            Object ob = arr[i];
            for (Object e : removeArr) {
                if (ob == e) {
                    found = false;
                    break;
                }
            }
            if(found) {
                for(int j = 0; j < size; j++) {
                    if(ob.equals(arr[j])) {
                        for (int k = j; k < size - 1; k++) {
                            arr[k] = arr[k + 1];
                        }
                        size--;
                    }
                }
                i--;
            }
            found = true;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public <E> T[] reversed() {
        T[] rev = (T[]) new Object[size];
        for(int i = 0; i < size; i++) {
            rev[i] = arr[size - i - 1];
        }
        return rev;
    }

    private boolean indexCheck(int index) {
        if(index >= 0 && index < size)
            return true;
        else
            throw new IndexOutOfBoundsException("Invalid index " + index + " to add");
    }

    @SuppressWarnings("unchecked")
    private void grow() {
        capacity += capacity / 2;
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(arr, 0, newArray, 0, size);
        arr = newArray;
    }

    private void shift(T[] array, int from, int to, int nTimes) {
        for(int i = to - 1; i >= from; i--)
            array[i + nTimes] = array[i];
    }
}

public class CustomArrayList {
    public static void main(String[] args) {
        CusAL<Integer> list = new CusAL<>();
        System.out.println("Size: " + list.size());
        System.out.println("Capacity: " + list.capacity());
        System.out.println(list);
        for (int i = 1; i <= 5; i++) {
            list.add(i * 100);
        }
        list.addFirst(100);
        list.addFirst(50);
        list.addLast(600);
        list.addLast(700);
//        list.add(3, 200);
//        list.add(0, 25);
        System.out.println(list);

        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(6);
//        al.add(8);
//        al.removeAll();
//        al.reversed();

        System.out.println(al.toString());
//        System.out.println(list);
//        list.addAll(al);
//        System.out.println(list);
//        list.addAll(0, al);
//        System.out.println(list);
//        System.out.println("Size: " + list.size());
//        System.out.println("Capacity: " + list.capacity());
//        System.out.println(list);
//        list.set(3, 250);
//        System.out.println(list);
//        System.out.println(list.remove(3));
//        System.out.println(list);
//        System.out.println(list.remove(Integer.valueOf(3)));
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeLast());
//        System.out.println(list);

//        System.out.println(al);
//        System.out.println(list);
//        list.removeAll(al);
//        list.retainAll(al);
//        System.out.println(Arrays.toString(list.reversed()));
//        System.out.println(list);

    }
}
