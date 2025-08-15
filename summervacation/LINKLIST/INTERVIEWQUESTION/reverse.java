package summervacation.LINKLIST.INTERVIEWQUESTION;

public class reverse {
    public static class Node{ // class 
        int data;
        Node next;
        // constructor
        public Node(int data){
            this.data= data;
        }
       }
       public static Node reverse(Node head){ // 1 <2< 3< 4
        if(head.next==null) return head;
        Node newnode = reverse(head.next); //2>3>4
        head.next.next=head;//1>2>3>4
        head.next=null;
        return newnode;
       }
       public static void display(Node head){
        if (head ==null) {
            System.out.println();
            return;}
        System.out.print(head.data+" "); // work
        display(head.next); // call
        
       }

    public static void main(String[] args) {
        Node a = new Node(1);// creating node of linkllist
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        display(a);
        Node R = reverse(a);
        display(R);
    }
    
}
