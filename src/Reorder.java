import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Reorder {
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


    public boolean Reorder(Node right){
        if (right == null)
            return true;
        boolean isp = Reorder(right.next);
        if (!isp)
            return false;
        if(left == middle)
            System.exit(1);
        right.next = null;
        Node tnode = head;
        while(tnode!=null)
        {
            System.out.println("Yes");
            System.out.print(tnode.data+"->");
            tnode=tnode.next;
        }
        System.out.println("NULL");
        Node temp=left.next;
        left.next=right;
        right.next = temp;
        left=temp;
        return true;
    }
    public int MiddleElementSF(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main (String[] args){
        Reorder MELL = new Reorder();
        for (int i=1; i<=8; i++ ){
            MELL.push(i);
        }
        //int G[] = {3,1,4,7};
        MELL.printList(MELL.head);
        MELL.left = MELL.head;
        int middle = MELL.MiddleElementSF();
        boolean a = MELL.Reorder(MELL.head);
        //System.out.println(MELL.Reorder(MELL.head));
        System.out.println(a);
        //MELL.printList(res);
    }
}
