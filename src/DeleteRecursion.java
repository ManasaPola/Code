public class DeleteRecursion {
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
    public void DeleteRecursion(Node current, int pos, Node prev){
        if (pos == 1)
        {
            prev.next = current.next;
            return;
        }
        if (current == null)
        {
            System.out.println("Length Exceeded");
            return;
        }
        //System.out.println(prev.data);
        System.out.println(current.data);
        prev = current;
        DeleteRecursion(current.next, pos-1,  prev);
    }
    public static void main (String[] args){
        DeleteRecursion MELL = new DeleteRecursion();
       for (int i=1; i<=7; i++ ){
            MELL.push(i);
        }
        MELL.printList();
        MELL.DeleteRecursion(MELL.head,5,null );
        MELL.printList();
    }
}
