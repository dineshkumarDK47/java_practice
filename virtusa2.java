// // program to reverse linked list

// /**
//  * virtusa2
//  */
// class ListNode{
//     int val;
//     ListNode next;

//     ListNode(int val){
//         this.val=val;
//     }
// }
// public class virtusa2 {

//     public static void main(String[] args) {
//         ListNode head = new ListNode(30);
//         head.next = new ListNode(40);
//         head.next.next = new ListNode(50);
//         System.out.println("original list");
//         printlist(head);

//         head = reverlist(head);
//         System.out.println("\n reverse list");
//         printlist(head);
//     }

//     public static ListNode reverlist(ListNode head){
//         ListNode prev=null;
//         ListNode current = head;
//         ListNode next;
//         while (current!=null) {
//             next = current.next;
//             current.next = prev;
//             prev=current;
//             current = next;
//         }
//         return prev;
//     }
//     public static void printlist(ListNode head){
//         ListNode curr = head;
//         while (curr!=null){
//             System.out.println(curr.val+" ");
//             curr = curr.next;
//         } {
            
//         }
//     }
// }

// delete a node in single linked list:

import java.util.List;

/**
 * virtusa2
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int item){
        val = item;
        this.next = null;
    }
}
public class virtusa2 {

    public static void main(String[] args) {
        ListNode head = new ListNode(9);
        head.next = new ListNode(40);
        head.next.next = new ListNode(50);
        printlist(head);
        deleteNode(head, 40);
        printlist(head);
    }
    public static void deleteNode(ListNode head, int element){
        ListNode current = head;
        ListNode prev = null;
        while (current!=null) {
            if (current.val==element) {
                if (prev!=null) {
                    prev.next = current.next;
                }else{
                    head = current.next;
                }
             break;
            }
            prev = current;
            current = current.next;
        }
    }
    public static void printlist(ListNode head){
        ListNode current = head;
        System.out.println(" ");
        while (current!=null) {
                System.out.print(current.val);
                if(current.next!=null){
                    System.out.print("->");
                }
             current = current.next;
        }
    }
}