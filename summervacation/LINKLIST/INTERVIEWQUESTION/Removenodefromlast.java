package summervacation.LINKLIST.INTERVIEWQUESTION;

public class Removenodefromlast {
    public static void displaynode(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static Node remove(Node head , int nth){
        Node slow= head;
        Node fast= head;
        for(int i =1; i<=nth; i++){ // jo node ko humme delete karna hai 
            fast = fast.next;
        }
        if (fast ==null){ // eska matlab ki nth denotes to head
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        slow.next= slow.next.next;
        return head;
        
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
        displaynode(a);
        a= remove(a, 5); // a is node 
        displaynode(a);
    }
}
