public class InsertAtAPosition {
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
    public void InsertAtPosition(int pos, int value){
        Node current = head;
        Node prev = null;
        Node tempnode = new Node(value);
        if(pos == 1)
        {
            tempnode.next=head;
            head = tempnode;
        }
        else{
            int i=1;
            while (i<pos && current!=null){
                prev = current;
                current = current.next;
                i++;
            }
            if(pos<=i)
            {
                tempnode.next = current;
                prev.next = tempnode;
            }
            else{
                System.out.println("Exceeding the length");
            }
        }
    }
    public static void main (String[] args){
        InsertAtAPosition MELL = new InsertAtAPosition();
//        for (int i=1; i<=7; i++ ){
//            MELL.push(i);
//        }
        MELL.push(20);
        MELL.push(4);
        MELL.push(15);
        MELL.push(10);

        /* Create a loop for testing */
        //MELL.head.next.next.next.next = MELL.head;
        //MELL.DetectLoop(MELL.head);
        MELL.printList();
        MELL.InsertAtPosition(1, 10);
        MELL.InsertAtPosition(2, 11);
        //MELL.DeleteRecursion(MELL.head,10,null );
        //MELL.Search(MELL.head, 5);
        MELL.printList();
        //MELL.MiddleElementSF();
    }
}
