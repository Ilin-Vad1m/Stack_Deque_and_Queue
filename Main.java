package Stack_Deque_and_Queue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>(10);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);

        char[] c = {'a','2', '1', 'a', 's'};


//        for (int i = 0; i < c.length; i++) {
//            System.out.print(c[i]);
//        }
//        System.out.println();


//        stack.push('v');
//        stack.push('a');
//        stack.push('d');
//        stack.push( ' ');
//        stack.push('i');


        for (char a : c) {
            priorityQueue.insert(a);
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(priorityQueue.remove());
        }
    }
}
