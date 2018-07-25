public class NumComponents {
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
//    public void numComponents(Node head, int[] G) {
//        int counter = 0;
//        while (head != null)
//        {
//            boolean x = false;
//            System.out.println("Outer Loop "+ head.data);
//            boolean value = useLoop(G, head.data);
//            while (head!=null && value)
//            {
//                //System.out.println("Yes this value is there"+ head.data);
//                if (value) {
//                    x = true;
//                    //System.out.println("Value set to true "+x);
//                    if(head.next!=null) {
//                        head = head.next;
//                        value = useLoop(G, head.data);
//                    }
//                }
//                else
//                    break;
//            }
//            if (x){
//                counter = counter + 1;
//                System.out.println("Counter is " + counter);
//            }
//            if (head.next== null)
//                break;
//            //System.out.println(counter);
//            head = head.next;
//        }
//        //counter = counter +1;
//        System.out.println("Final Counter is "+ counter+1);
//    }
//    public static boolean useLoop(int[] arr, int targetValue) {
//        for(int s: arr){
//            if(s==targetValue)
//                return true;
//        }
//        return false;
//    }
    public static void main (String[] args){
        NumComponents MELL = new NumComponents();
        for (int i=1; i<=8; i++ ){
            MELL.push(i);
        }
        int G[] = {3,1,4,7};
        MELL.printList(MELL.head);
       // MELL.numComponents(MELL.head, G);
        //System.out.println(a);
        //MELL.left = MELL.head;
        //Node res = MELL.Reverse(MELL.head, null);
        //MELL.middle = MELL.MiddleElementSF();
        //System.out.println(MELL.Reorder(MELL.head));
        //MELL.printList(res);
    }
}
