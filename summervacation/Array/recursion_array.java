package summervacation.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class recursion_array {
    //Print all the element of array using recursion 
    //Find maxium element in array
    //Find sum of element
    //Find element wheather it is present in array or not
    //Find element all indexes if it is present in array
    static ArrayList<Integer>findallindex(int arr[], int index , int target){
        // Base case 
        if(index==arr.length){
            return new ArrayList<Integer>(); // empty arraylist
        }ArrayList<Integer> ans = new ArrayList<>();// create new arraylist name ans 

        if(arr[index]==target){
            ans.add(index);
        }
        ArrayList<Integer> smallans = findallindex(arr, index + 1, target);

        ans.addAll(smallans);
        return ans;
        
    }
    static int findindex(int arr[], int index , int target ){
        if(index==arr.length){ //Base case: if index is out of bounds, return false
            return -1;
        }//self work >>Recursive call for the next index 
         if (arr[index]==target){ // only for 0th index 
            return index;

         } return findindex(arr, index+1, target);
        }
    static boolean searching(int arr[], int index , int target ){
        if(index==arr.length){ //Base case: if index is out of bounds, return false
            return false;
        }//self work >>Recursive call for the next index 
         if (arr[index]==target){ // only for 0th index 
            return true;
         }
        // sub problem >>
       return  searching(arr, index+1, target); 
       //This method is boolean .. for 1 to n index either it return true or flase
         
    }
    static int sumofarray(int arr[], int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int smallans =sumofarray(arr, index+1);
        return smallans+arr[index];
    }
    static int maxinarray(int[]arr, int index){
        if(index== arr.length-1)
        {
            return arr[index];
        }
        int smallans = maxinarray(arr, index+1);
        return Math.max(arr[index], smallans);
    }
    static void printarray(int arr[], int index){
        if(index==arr.length){ //Base case
            return;
        }
        System.out.print(arr[index] +" ");// self work
        printarray(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values you want ");
        int n =sc.nextInt();
        int arr [] = new int [n];
        System.out.println("Enter the value");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
      //  printarray(arr, 0);
    // System.out.println(maxinarray(arr, 0)); 
    //System.out.println(sumofarray(arr, 0));
    // if(searching(arr, 0, 5)){
    //     System.out.println("yes found");
    // }
    // else{
    // System.out.println("Not found");
    // }
   // System.out.println(findindex(arr, 0, 5));

System.out.println(findallindex(arr, 0, 1));
    }
}
