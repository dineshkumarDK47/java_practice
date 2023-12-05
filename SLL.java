

// single Linked List 

import java.util.List;

class LinkedNode{
    int val;
    LinkedNode next;
    public LinkedNode(int val){
        this.val = val;
        this.next = null;
    }
}
class singleLinkedList{
    LinkedNode head = null ;
    
    public void InsertFront(int data){
        LinkedNode newNode = new LinkedNode(data);
        if(head==null){
            head = newNode;
        }else{
            LinkedNode current = head;
            while (current.next!=null) {
                current = current.next;
            }
            current.next = newNode;

        }
    }
    public void InsertMid(int data){
        LinkedNode newNode = new LinkedNode(data);
        if (head==null) {
            head = newNode;
            return;
        }
        LinkedNode slow = head;
        LinkedNode fast = head;
        LinkedNode prev = null;
        while (fast!=null&&fast.next!=null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = newNode;
        newNode.next = slow;
    }

    public void display(){
        LinkedNode curent = head;
        while (curent!=null) {
            System.out.print(curent.val+"->");
            curent = curent.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        singleLinkedList list = new singleLinkedList();
        list.InsertFront(40);
        list.InsertFront(50);
        list.display();
        list.InsertFront(60);
        list.display();
        list.InsertMid(25);
        list.display();
        list.InsertMid(35);
        list.display();
    }
}