public class MiddleElement {
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
        MiddleElement MELL = new MiddleElement();
        for (int i=1; i<=9; i++ ){
            MELL.push(i);
        }
        int a = MELL.MiddleElementSF();
        System.out.println("Middle Element is "+ a);
    }
}
