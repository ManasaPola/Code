public class DetectLoop {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node (int d){
            data = d;
            next = null;
        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void printList(){
        Node tnode = head;
        while(tnode!=null)
        {
            System.out.print(tnode.data+"->");
            tnode=tnode.next;
        }
        System.out.println("NULL");
    }
    public boolean DetectLoop(Node current){
        Node fPtr = current;
        Node sPtr = current;
        while(fPtr != null && fPtr.next != null) {
            sPtr = sPtr.next;
            fPtr = fPtr.next.next;
            if(sPtr == fPtr) {
                return true;
            }
        }
        return false;
    }
    public static void main (String[] args){
        DetectLoop MELL = new DetectLoop();
//        for (int i=1; i<=7; i++ ){
//            MELL.push(i);
//        }
        MELL.push(20);
        MELL.push(4);
        MELL.push(15);
        MELL.push(10);
        MELL.head.next.next.next.next = MELL.head;
        boolean a = MELL.DetectLoop(MELL.head);
        if (a==true)
            System.out.println("This Linked List has loop");
        else
            System.out.println("This Linked List doesn't have loop");
    }
}
