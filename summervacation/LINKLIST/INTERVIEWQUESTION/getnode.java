package summervacation.LINKLIST.INTERVIEWQUESTION;

public class getnode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void geetnode(Node head , int indx){
        Node temp = head;
        for(int i =0; i<=indx-1; i++){
            temp= temp.next;
            
        }System.out.println(temp.data);
    }
    public static void main(String[] args) {
        Node a= new Node(3);
        Node b= new Node(4);
        Node c= new Node(5);
        Node d= new Node(6);
        // Linking the nodes
        a.next = b;
        b.next = c;
        c.next = d;
      geetnode(a, 2);
    }
    
}
