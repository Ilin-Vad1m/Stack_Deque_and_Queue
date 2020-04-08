package Stack_Deque_and_Queue.Deque_Сonsol;

class DequeException extends Exception {}

class Node <T>
{
    T val;
    Node prev, next;

    Node(T v, Node p, Node n) {val = v; prev = p; next = n;}
}

class Deque <T> {
    int size;
    Node<T> first, last;

    Deque() {
        size = 0;
        first = null;
        last = null;
    }

    String pushBack(T val) {
        if (size > 0) {
            Node currentNode = new Node<T> (val, last, null);
            last.next = currentNode;
            last = currentNode;
            size++;
        }
        else {
            Node currentNode = new Node<T> (val, null, null);
            last = currentNode;
            first = currentNode;
            size++;
        }
        return "ok";
    }

    String pushFront(T val) {
        if (size > 0) {
            Node currentNode = new Node<T> (val, null, first);
            first.prev = currentNode;
            first = currentNode;
            size++;
        }
        else {
            Node currentNode = new Node<T> (val, null, null);
            last = currentNode;
            first = currentNode;
            size++;
        }
        return "ok";
    }

    T popFront() throws DequeException {
        if(size == 0) throw new DequeException();
        T v = first.val;
        first = first.next;
        size--;
        return v;
    }

    T popBack() throws DequeException {
        if(size == 0) throw new DequeException();
        T v = last.val;
        last = last.prev;
        size--;
        return v;
    }

    T front() throws DequeException {
        if(size == 0) throw new DequeException();
        return first.val;
    }

    T back() throws DequeException {
        if(size == 0) throw new DequeException();
        return last.val;
    }

    int getSize() {
        return size;
    }

    String clear() {
        size = 0;
        return "ok";
    }

    String ex() {
        return "bye";
    }
}
