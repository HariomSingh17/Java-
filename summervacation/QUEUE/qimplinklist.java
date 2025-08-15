package summervacation.QUEUE;

import summervacation.QUEUE.qimplinklist.Node.queeueLL;

public  class qimplinklist {
    //node class 
    public static class Node{
        int data ;
        Node next;
        Node (int data){
            this.data = data;
        }
        public static class queeueLL{
            Node head = null;
            Node tail = null;
            int size =0;
            public void add(int data){
                Node temp = new Node(data);
                if(size==0){
                    head=tail=temp;
                }else{
                    tail.next = temp;
                    tail=temp;
                } size++;
            }
            public  int remove(){
                if(size==0){
                    System.out.println("There is nthin to remove");
                    return -1;
                }
                int x = head.data;
                head= head.next;

                return x;
            }
              public  int peek(){
                if(size==0){
                    System.out.println("There is nthin to remove");
                    return -1;
                }
                int x = head.data;
             

                return x;
            } 
            public void display(){
                Node tNode = head;
                while ((tNode!=null)) {
                    System.out.print(tNode.data+" ");
                    tNode = tNode.next;
                }
            }

        }
    }
    public static void main(String[] args) {
      queeueLL qqll = new queeueLL();
        qqll.add(1);
        qqll.add(4);
        qqll.add(3);
        qqll.display();
        
    }
}
