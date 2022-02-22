package DataStructure;
import java.util.Stack;

public class StackExample {
//     Last in , First out principle
    public static void main(String[] args) {
//        creating a stack
        Stack<String> names = new Stack<String>();
//        Inserting elements           into the stack by the use of push method
        names.push("Priscilla");
        names.push("Isaac");
        names.push("Mike");
        names.push("Sam");
        names.push("Timothy");
        names.push("Jessica");

//printing out the stack
        System.out.println("Stack elements:" + names);

//        removing some elements in the stack by using pop method
        names.pop();
        System.out.println("popped :" + names);
    }



}
