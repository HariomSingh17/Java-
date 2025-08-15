package summervacation.LINKLIST;

public class usingrecursion {
    public static void display(Node head){
        if(head==null){
            return;
        }
     System.out.print(head.data+" ");
           display( head.next);
    }
    public static void displayrevrse(Node head){
        if(head==null){
            return;
        }
        displayrevrse( head.next);
     System.out.print(head.data+" ");
           
    }

    public static class Node{ // class 
        int data;
        Node next;
        // constructor
        public Node(int data){
            this.data = data;
        }
       }
    public static void main(String[] args) {
        Node a = new Node(1);// creating node of linkllist
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    a.next=b; // connecting node
    b.next=c;
    c.next=d;
    Node temp =a;
    display(temp);
    System.out.println();
    displayrevrse(temp);
    }
    
}
