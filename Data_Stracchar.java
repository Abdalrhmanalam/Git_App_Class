package data_stracchar;

public class Data_Stracchar {

    public static void main(String[] args) {

    }
}

class DynamicArray<T> {

    private T[] data;
    private int size;

    public DynamicArray() {
        data = (T[]) new Object[10];
        size = 0;
    }

    public DynamicArray(int n) {
        this.data = (T[]) new Object[n];
        size = 0;
    }

    public void insertNew(T item) {
        if (data.length == size) {
            resize();
        }
        data[size] = item;
        size++;
    }

    private void resize() {
        int newSize = size * 2;
        T[] newArr = (T[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            newArr[i] = data[i];
        }
        data = newArr;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            System.out.println("Eroor in Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public void set(int index, T item) {
        if (index >= size || index < 0) {
            System.out.println("Index: " + index + ", Size: " + size);
        }
        data[index] = item;
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            System.out.println(index + "," + size);
        }
        if (data.length / 4 >= size) {
            decrease();
        }
        T removed = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return removed;
    }

    public void decrease() {
        int newSize = data.length / 2;
        T[] newArr = (T[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            newArr[i] = data[i];
        }
        data = newArr;
    }

    public int indexAt(T item) {
        for (int i = 0; i < size; i++) {
            if (data[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int removeItem(T item) {
        int index = indexAt(item);
        if (index != -1) {
            remove(index);
            size--;
            return index;
        }
        return -1;
    }

    public void print() {
        for (T t : data) {
            System.out.println(t);
        }
    }

    public int size() {
        return size;
    }

}
//-----------------------------------------
//Linked List

class Node<T> {

    public T value;
    public Node<T> next;

    public Node(T value) {
        this.value = value;
    }
}

class LinkedList<T> {

    public Node<T> head;
    public int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    //-----------add First
    public void addFrist(T newValue) {
        Node<T> newNood = new Node<>(newValue);
        newNood.next = head;
        head = newNood;
        size++;

    }
    //-----------Print-------

    public void print() {
        Node<T> crrunt = head;
        while (crrunt != null) {
            System.out.println(crrunt.value);
            crrunt = crrunt.next;
        }
    }

    //-----Remove Item---------
    public Node<T> remov() {
        Node<T> khraa = head;
        if (size == 0) {
            System.out.println("Eroor");
        } else if (size == 1) {
            head = null;
        } else {
            Node<T> nod = head;
            head = head.next;
            nod.next = null;
            size -= 1;
        }
        return khraa;       
    }
    
    
}
