package Stack_Deque_and_Queue.Reverse_String;

import Stack_Deque_and_Queue.PriorityQueue;
import Stack_Deque_and_Queue.Queue;
import Stack_Deque_and_Queue.Stack;

import java.util.*;

import java.util.stream.Collectors;

public class Reverse_String {

    Scanner in = new Scanner(System.in);
    String str;
    int capacity = 150;
    Stack <Character> stack = new Stack<>(capacity);
    Queue <Character> queue = new Queue<>(capacity);
    PriorityQueue<Character> priorityQueue = new PriorityQueue<>(capacity);
    List<Character> charList;


    public Reverse_String() {
    }

    public String read(){
        return str = in.nextLine();
    }

    public void reverse(){
        while(true) {
            String str = read();
            if(stop(str)){
                break;
            }else{
                charList = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
                addCharToStack();
                viewStack();
                System.out.println();
                addCharToQueue();
                viewQueue();
                System.out.println();
                addCharToPriorityQueue();
                priorityQueue.remove();
            }
        }
    }

    public void normal(){
        while(true) {
            String str = read();
            if(stop(str)){
                break;
            }else{
                charList = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
                addCharToStack();
                viewStack();
                System.out.println();
                addCharToQueue();
                viewQueue();
                System.out.println();
                addCharToPriorityQueue();
                viewPriorityQueue();
            }
        }
    }

    private void viewPriorityQueue() {
        for (int i = 0; i < charList.size(); i++) {
            System.out.print(priorityQueue.remove());
        }
    }

    private void viewQueue() {
        for (int i = 0; i < charList.size(); i++) {
            System.out.print(queue.remove());
        }
    }

    private void addCharToStack(){
        for (char a : charList){
            stack.push(a);
        }
    }
    private void viewStack(){
        for (int i = 0; i < charList.size(); i++) {
            System.out.print(stack.pop());
        }
    }

    private void addCharToQueue(){
        for (char a : charList){
            queue.insert(a);
        }
    }

    private void addCharToPriorityQueue(){
        for (char a : charList){
            queue.insert(a);
        }
    }

    private boolean stop(String str){
        return str.equals("stop") || str.equals("Stop");
    }

}
