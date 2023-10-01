import java.util.*;
//stack in java collection framework
class dk{
    public static void main(String[] args) {
        Stack<Integer> a=new Stack<>();
        a.push(21);
        a.push(11);
        a.push(32);
        System.out.println(a);
        for (Integer num : a) {
            System.out.println(num);
        }
        a.pop();
        System.out.println(a);
        int peel = a.peek();
        System.out.println(peel);
        a.add(12);
        a.add(0, 4);
        System.out.println(a);
        int ele = a.search(11);
        System.out.println(ele);
        boolean b = a.empty();
        System.out.println(b);
    }
}