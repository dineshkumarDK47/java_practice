// doubly linked list - insert and delete:

class doubleListNode{
    int val;
     doubleListNode next;
     doubleListNode prev;

     public doubleListNode(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
     }
}

class doublyLinkedList{
    private doubleListNode head;
    private doubleListNode tail;

    public doublyLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void addtoFront(int data){
        doubleListNode newNode = new doubleListNode(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addtoEnd(int data){
        doubleListNode newNode = new doubleListNode(data);
        if(tail==null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertmid(doubleListNode prev, int data){
        if(prev==null){
            System.out.println("pevious node cant be null");
             return;
        }

        doubleListNode newNode = new doubleListNode(data);
        newNode.next = prev.next;
        newNode.prev = prev;
        prev.next = newNode;
        if(newNode.next!=null){
            newNode.next.prev = newNode;
        }else{
            tail = newNode;
        }
    }
    public void deleteNode(int data){
        doubleListNode current = head;
        while (current!=null) {
            if(current.val==data){
                if(current.prev!=null){
                    current.prev.next = current.next;
                }
            else{
                head = current.next;
            }

            if(current.next!=null){
                current.next.prev = current.prev;
            }else{
                tail = current.prev;
            }
            break;
        }
        current = current.next;
        }
    }
    public void displayForward(){
        doubleListNode current = head;
        while(current!=null){
            System.out.print(current.val+"<=>");
            current = current.next;
        }
        System.out.println("null");
    }
    public void displayBack(){
        doubleListNode current = tail;
        while (current!=null) {
            System.out.print(current.val+"<=>");
            current = current.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        doublyLinkedList list = new doublyLinkedList();
        list.addtoEnd(1);
        list.addtoFront(3);
        list.insertmid(list.head.next, 40);
        list.displayBack();
        list.displayForward();
        list.addtoFront(7);
        list.displayForward();
    }

}