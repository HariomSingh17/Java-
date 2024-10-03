package summervacation.Array;
//Bubble sorting 
//Selection sorting
//Insertion sorting -> Take one element , iterate through the sorted 7 find the correct position of this 
//Problem number 1 --> Given an integer array move all zeros to the end of it while maintaining the relative order of the non zero element
//Problem 2 -->given an array of name of fruit you are supposed to sort it in Lexiographical Order using a selection short

public class sorting {
    static void problem2(String[]fruits){
        for(int i=0; i<fruits.length-1; i++){
            int min_index=i;//Already mention that we have to use selection sort
        for(int j =i+1; j<fruits.length; j++){
            if(fruits[j].compareTo(fruits[min_index])<0){// negative hone ka matlab j vala string chota hai 
                min_index =j;

            }
        } if(min_index!=i){
            String temp = fruits[i];
            fruits[i]=fruits[min_index];
            fruits[min_index]=temp;
        }
        }
    }
    static void problem1(int arr[]){
  
        for(int i = 0; i < arr.length; i++){
          for(int j =i+1; j<arr.length-i; j++){
            if(arr[j-1]==0&&arr[j]!=0){//j ko dekhenge ki kya ye non-zero hai aur j-1 ko dekhenge ki kya vo zero hai
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                }
            }
        }
    }
   
    static void insertionsort(int a[]){
for(int i =1; i<a.length; i++){
    int j =i;
    while(j>0 && a[j]<a[j-1]){
        //swap a[j] , a[j-1]
        int temp =a[j];
        a[j]=a[j-1];
        a[j-1]=temp;
        j--;
    }
}
    }
    static void selectionsorting(int a[]){
        for(int i =0; i<a.length-1; i++){// for 5 element number of passes will be 3
            int min_index =i; //initial le rha hu element
        for(int j =i+1; j<a.length; j++){//taki mai sare index se compare kar pau 
            if(a[j]<a[min_index]){
                min_index=j;

            }
        }
        int temp =a[i];
     a[i]=a[min_index];
        a[min_index] =temp;
        }
    }
    static void bubblesortof(int a[]){
        for(int i =0; i<a.length;i++){
            for(int j=i+1; j<a.length-i;j++){
                //swap a[i]-a[j]
                if(a[i]>a[j]){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                
            }
            }
        }
    }
    //we do a certain number(n-1) of passes & in every pass , we compare adjacent  element and swap them if they are not in correct order

     public static void main(String[] args) {
//Is bubble sort stable or unstable.. order of appereance will same is called stable  
        int a[]={0,30,0,55};
        String fruits[]={"mango","banana","apple"};
    //bubblesortof(a);     
    //selectionsorting(a);
  //  insertionsort(a);
 // problem1(a);
 problem2(fruits);
for(String i:fruits){
    System.out.print(i+" ");

}
    
}}
