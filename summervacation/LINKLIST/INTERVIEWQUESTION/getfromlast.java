package summervacation.LINKLIST.INTERVIEWQUESTION;

public class getfromlast {
    public static Node nthnode(Node head , int nthindx){
         // nthindx >> last se jis index ka element cheye
        Node temp = head;
        int size=0; // linklist size
        while(temp!=null){
            temp= temp.next;
            size++;
        }
        int mth = (size-nthindx)+1; // mth> indx from starting using AP formulae
        Node temp1 =head;
        for(int i =1; i<=mth-1; i++){
            temp1 = temp1.next;
        } return temp1;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a= new Node(3);
        Node b= new Node(4);
        Node c= new Node(5);
        Node d= new Node(6);
        Node e= new Node(7);
        Node f= new Node(100);
        // Linking the nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next= e;
        e.next= f;

        Node q= nthnode(a, 3);

       System.out.println(q.data);
    }
    
}
