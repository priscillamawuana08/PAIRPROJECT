package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class MyuQueue {
//    First in, First out principle
public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.add("Green");
    queue.add("Greeks");
    queue.add("Great");



    System.out.println(queue);
    queue.remove();
    System.out.println(queue);
}
}
