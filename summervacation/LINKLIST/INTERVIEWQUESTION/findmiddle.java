package summervacation.LINKLIST.INTERVIEWQUESTION;

public class findmiddle {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node middleelemnt(Node head ){
        Node slow = head;
        Node fast = head;
        int size =0;
        Node temp = head;
        while(temp!=null){
            temp= temp.next;
            size++;
        }
        if(size % 2!=0){
            //odd
            while(fast.next!=null){// tail 
                slow= slow.next;
                fast = fast.next.next;
            }


        }
        else{ // even
            // while(fast.next.next!=null){ // Left middle 1,2,3,4,5,6 >> 3
            //     slow=slow.next;
            //     fast=fast.next.next;
            // }
            while (fast!=null){ // right middle >> 4
                slow=slow.next;
                fast=fast.next.next;
            }
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a= new Node(3);
        Node b= new Node(4);
        Node c= new Node(33);
        Node d= new Node(6);
        Node e= new Node(7);
        Node f= new Node(44);
     //   Node g= new Node(411);

       
        // Linking the nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next= e;
        e.next=f;
       // f.next=g;

        Node q =middleelemnt(a);
        System.out.println(q.data);
       
    }
}
