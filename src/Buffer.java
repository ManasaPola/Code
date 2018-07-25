public class Buffer {
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
    public static void main (String[] args){
        MiddleElement MELL = new MiddleElement();
//        for (int i=1; i<=7; i++ ){
//            MELL.push(i);
//        }
        MELL.push(20);
        MELL.push(4);
        MELL.push(15);
        MELL.push(10);

        /* Create a loop for testing */
        MELL.head.next.next.next.next = MELL.head;
        //MELL.DetectLoop(MELL.head);
        //MELL.printList();
        //MELL.InsertAtPosition(1, 10);
        //MELL.InsertAtPosition(2, 11);
        //MELL.DeleteRecursion(MELL.head,10,null );
        //MELL.Search(MELL.head, 5);
        //MELL.printList();
        //MELL.MiddleElementSF();
    }
}
