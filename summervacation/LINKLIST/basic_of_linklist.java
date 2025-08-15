package summervacation.LINKLIST;

public class basic_of_linklist {
 public static class Node{ // class 
    int data;
    Node next;
    // constructor
    public Node(int data){
        data= data;
    }
   }
   public static void main(String[] args) {
    Node a = new Node(1);// creating node of linkllist
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    a.next=b;
    b.next=c;
    c.next=d;
       // print linklist

    Node temp =a;
       for(int i =1; i<=4; i++){
         System.out.println(temp.data+" ");
         temp = temp.next;
       
       }
   }
 
}
