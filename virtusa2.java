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

//