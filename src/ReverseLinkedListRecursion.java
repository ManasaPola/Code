public class ReverseLinkedListRecursion {
    Node head;
    Node left;
    Node middle;
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
    public  void printList(Node headref){
        Node tnode = headref;
        while(tnode!=null)
        {
            System.out.print(tnode.data+"->");
            tnode=tnode.next;
        }
        System.out.println("NULL");
    }
    Node Reverse(Node last, Node prev)
    {
        if (last.next == null){
            head = last;
            last.next = prev;
            //prev.next = null;
            return head;
        }
        Node last1 = last.next;
        last.next = prev;
        Reverse(last1, last);
        return head;
    }
    public static void main (String[] args){
        ReverseLinkedListRecursion MELL = new ReverseLinkedListRecursion();
        for (int i=1; i<=8; i++ ){
            MELL.push(i);
        }
        int G[] = {3,1,4,7};
        MELL.printList(MELL.head);
        Node res = MELL.Reverse(MELL.head, null);
        MELL.printList(res);
    }

}
