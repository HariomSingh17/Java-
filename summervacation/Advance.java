package summervacation;

import java.util.Scanner;

public class Advance {
    static void printArray(int[]arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println("");
    }
    
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5};
    //Shallow copying
    System.out.println("This is arr 1");
        printArray(arr);
        int[]arr_1=arr;
        System.out.println("This is arr2");
        printArray(arr_1);
    arr_1[0]=123;
    System.out.println("This is after change");
    printArray(arr);
    printArray(arr_1);
    //Deep copy
    int arr_2[]= arr_1.clone();
    arr_2[0]=123;
    arr_2[1]=321;
    System.out.println("arr1 after updating ");
    printArray(arr_1); //As we can see that there will no change in arr_1"
    //Take input from user ::
   Scanner sc = new Scanner(System.in);
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
    

