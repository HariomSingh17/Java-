package summervacation;

import java.util.Scanner;
//Shallow copy , deep copy , input from user array :
public class Advance {
    static void printArray(int[]arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println("");
    }
    
    public static void main(String[] args) {
        
    //Shallow copying
    
    int []arr ={1,2,3,4,5};
   
        int[]arr_1=arr;
        System.out.println("This is original array");
        printArray(arr);
         System.out.println("This is arr 1 in which arr will be copied");
        printArray(arr_1);
       // Make changes in arr_1 
       arr_1[1]=1999;
       arr_1[2]= 19;
       System.out.println("This is original array after change in arr_1");
        printArray(arr);
         System.out.println("This is arr 1 in which change is been made");
        printArray(arr_1);
    //Deep copy
    int []original ={1,2,3,4,5,6,7};
    System.out.println("This is original array");
        printArray(original);
         System.out.println("This is arr 2 by deep copy of original");  
          int arr_2[]= original.clone();
        printArray(arr_2);
  //Through this function deep copy will happen
    arr_2[0]=123;
    arr_2[1]=321;
   
    System.out.println("original after updating arr_2 ");
    printArray(original);
     System.out.println("arr2 after updating ");
    printArray(arr_2); //As we can see that there will no change in arr_1"
   
   
    //Take input from user ::
   Scanner sc = new Scanner(System.in);//Scanner class >> sc object
   System.out.println("Enter the number of element");
   int n = sc.nextInt();
   int arr3[]= new int[n];
   System.out.println("Enter elements ");
   for(int i =0; i<arr3.length; i++){
     arr3[i]=sc.nextInt();

   }for(int i =0; i<arr3.length; i++){
     System.out.print(arr3[i]+" ");

   }


    } 
    




}
    

