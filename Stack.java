package Stack_Deque_and_Queue;

import java.util.EmptyStackException;

public class Stack<Item> {

    private Item[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public Stack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("bad size");
        }
        list = (Item[])new Object[capacity];
    }

    public Stack() {
        list = (Item[])new Object[DEFAULT_CAPACITY];
    }

    // метод вставки
    public void push(Item item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[size] = item;
        size++;
    }

    // метод удаления
    public Item pop() {
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

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private void reCapacity(int newCapacity) {
        Item[] tempArr = (Item[]) new Object[newCapacity];
        System.arraycopy(list,0,tempArr,0,size);
        list = tempArr;
    }

}
