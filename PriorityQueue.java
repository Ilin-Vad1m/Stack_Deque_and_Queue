package Stack_Deque_and_Queue;

import java.util.Arrays;
import java.util.EmptyStackException;

public class PriorityQueue <Item>{

    private Item[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    public PriorityQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("bad size " + capacity);
        }
        list = (Item[])new Object[DEFAULT_CAPACITY];
    }

    public PriorityQueue() {
        list = (Item[])new Object[DEFAULT_CAPACITY];
    }

    public void insert(Item item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[size] = item;
        size++;
        // сдвигаем если неправильно стоят элементы при вставке
            Arrays.sort(list);

    }

    public Item remove() {
        Item temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    private Item peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private void reCapacity(int newCapacity) {
        Item[] tempArr = (Item[]) new Object[newCapacity];
        System.arraycopy(list, 0, tempArr, 0, size);
        list = tempArr;
    }

    private void sortAbc(){
        Arrays.sort(list);
    }

    private void swap(int index1, int index2) {
        Item temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(list[i] + " ");
        }
        return sb.toString();
    }

}
