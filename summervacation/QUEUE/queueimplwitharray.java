package summervacation.QUEUE;

public class queueimplwitharray {
    public static class queueA{
        // we need here to implement 3 primary function[add(),peek(),remove()]
        int arr[] =new int[100];
        int f=-1;//front 
        int r =-1; //rear
        int size =0;
        public void add(int val){
            if(r==arr.length-1){ 
                System.out.println("Queue is full");
                 return;}
            if( f==-1){
                 r=f=0 ;
                arr[f]=val;}// something will be added thus we increase f and r
            else{arr[++r]=val;}
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("There is nothing to remove");
            }
            f++;
            size--;
            return arr[f-1];
        }
         public int peek(){
            if(size==0){
                System.out.println("No any element on top");
                return -1;
            }
           
            return arr[f];
        }
        public void display(){
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }   System.out.println();}
    }
    public static void main(String[] args) {
      queueA q = new queueA();
      q.add(0);
      q.add(1);
      q.add(2);
      q.add(3); 
      q.display();

    }
    
}
