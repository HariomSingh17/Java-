package summervacation.LINKLIST;

public class createlinklistclass {
    public static class Node{
        int data;
        Node next;
        Node(int data){// constructor
            this.data = data;
        }
    }
    public static class linklist{
        Node head = null;
        Node tail =null;
        //Insert element at end of linklist
        void InsertatEnd(int data){
        // 1. Create node with particular data
        Node newdata = new Node(data);
        // check wheather linklist is empty 
        if (head ==null){
            head =newdata;
            tail =newdata;
        }else{
            tail.next =newdata;
            tail =newdata;
        }

    // Insert element in beginning of linklist

     
        
        }   
         void InsertatHead(int data){
            // 1. Create node with particular data
            Node New = new Node(data);
            if (head==null){
                head = tail =New;
            }
            else {
                New.next =head;
                head= New;
            }
        }

        //Insert element at any place in linklist
        void Insertat(int idx , int data){ // 2, 10 [1 > 2 > 3 >4] >> [1 > 2 > 10 > 3 >4]
            Node starting = new Node(data);
             Node temp = head;
             if(idx==4){
                InsertatEnd(data);
             }
             else if(idx==0){
                InsertatHead(data);
             }
             for(int i =1; i<=idx-1; i++){
                temp = temp.next; // temp us indx par phuch chuka hai jha par node add hoga
             }
             starting.next= temp.next;
             temp.next=starting;

        }
        
             void display ()
        {
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linklist L =new linklist();
        L.InsertatEnd(3);
        L.InsertatEnd(4);
        L.InsertatEnd(5);
        L.InsertatHead(2);
       // L.display();
        L.Insertat(1, 8);
       
        
        L.display();
    } 
}
