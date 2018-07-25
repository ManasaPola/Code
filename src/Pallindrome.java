public class Pallindrome {
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
    public  void printList(){
        Node tnode = head;
        while(tnode!=null)
        {
            System.out.print(tnode.data+"->");
            tnode=tnode.next;
        }
        System.out.println("NULL");
    }
    public boolean isPallindrome(Node right){
        boolean x;
        //stop recursion
        if (right == null)
            return true;
        x = isPallindrome(right.next);
        if (!x)
            return false;

        boolean y = (left.data == right.data);

        //move left to next
        left = left.next;

        return y;
    }

    public static void main (String[] args){
        Pallindrome MELL = new Pallindrome();
        MELL.push(1);
        MELL.push(4);
        MELL.push(4);
        MELL.push(1);
        MELL.printList();
        MELL.left = MELL.head;
        if(MELL.isPallindrome(MELL.head))
            System.out.println("Number is Pallindrome");
        else
            System.out.println("Number is Not a Pallindrome");
    }


}
