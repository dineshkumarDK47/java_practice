// import java.util.*;
// class Stack{
//     private ArrayList<Integer> items;
//     public Stack(){
//         items = new ArrayList<>();
//     }
//     public boolean isEmpty(){
//         return items.isEmpty();
//     }
//     public void push(int item){
//         items.add(item);
//     }
//     public int pop(){
//         if(!isEmpty()){
//             return items.remove(items.size()-1);
//         }else{
//             System.out.println("stack is empty");
//             return -1;
//         }
//     }
//     public int peek(){
//         if(isEmpty()){
//             System.out.println("its empty");
//             return -1;
//         }else{
//             return items.get(items.size()-1);
//         }
//     }
//     public int size(){
//         return items.size();
//     }
//     @override
//     public String toString(){
//         return items.toString();
//     }
// }
// public class virtusa3 {
//     public static void main(String[] args) {
//         Stack stack = new Stack();
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         System.out.println(stack);
//         System.out.println(stack.peek());
//         System.out.println(stack.pop());
//         System.out.println(stack);
//     }
// }

// queue using list :

import java.util.*;
class Queue{
    private ArrayList<Integer> items;
    public Queue(){
        items = new ArrayList<>();
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }
    public void enqueue(int item){
        items.add(item);
    }
    public int dequeue(){
        if(!isEmpty()){
            return items.remove(0);
        }else{
            System.out.println("stack is empty");
            return -1;
        }
    }
    public int front(){
        if(isEmpty()){
            System.out.println("its empty");
            return -1;
        }else{
            return items.get(0);
        }
    }
    public int size(){
        return items.size();
    }
    @Override
    public String toString(){
        return items.toString();
    }
}
public class virtusa3 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        System.out.println(queue.front());
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }
}

