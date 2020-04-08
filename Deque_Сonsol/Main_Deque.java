package Stack_Deque_and_Queue.Deque_Сonsol;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main_Deque {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Deque<String> deque = new Deque<>();
        String s, val;

        while(in.hasNext()) {
            s = in.next();
            if (s.equals("exit")) out.println(deque.ex());
            else if (s.equals("clear")) out.println(deque.clear());
            else if (s.equals("size")) out.println(deque.getSize());
            else if (s.equals("back")) {
                try {
                    out.println(deque.back());
                } catch(DequeException e) {
                    out.println("error");
                }
            }
            else if(s.equals("front")) {
                try {
                    out.println(deque.front());
                } catch(DequeException e) {
                    out.println("error");
                }
            }
            else if (s.equals("pop_back")) {
                try {
                    out.println(deque.popBack());
                } catch(DequeException e) {
                    out.println("error");
                }
            }
            else if (s.equals("pop_front")) {
                try {
                    out.println(deque.popFront());
                } catch(DequeException e) {
                    out.println("error");
                }
            }
            else if(s.equals("push_back")) {
                val = in.next();
                out.println(deque.pushBack(val));
            }
            else if(s.equals("push_front")) {
                val = in.next();
                out.println(deque.pushFront(val));
            }
            out.flush();
        }
    }
}
