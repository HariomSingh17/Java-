
package summervacation.Array;
import java.util.ArrayList; // Need pacakage to implement arraylist
import java.util.Scanner;

//Arraylists functions , reversing the arraylist
public class Arraylist {
     static void reversethearraylist( ArrayList <Integer> l1){

            int i =0; int j = l1.size()-1;
             while(i<j){
              // Jo i index par l1 ki value hai usko lete aoo
                Integer temp = Integer.valueOf(l1.get(i));
// set modify the value present in array at index i 
                l1.set(i, l1.get(j));
                l1.set(j, temp);
                i++;
                j--;
                
             }}
    public static void main(String[] args) {
     // Wrapper class 
Integer i = Integer.valueOf(4);
 System.out.println(i);
 Float f = Float.valueOf(4.5f);
 System.out.println(f);
 float x = 4.5f;
 String s ="Hello";
 System.out.println(s);

 // Initialising the arraylist
 ArrayList <Integer> l1 = new ArrayList<>();
 // We can store any data type in l1 by using ArrayList l1 = new ArrayList(); ;;

 //We have facility to restricte the array with only integer value or any data type  using  ArrayList <Integer>l1 = new ArrayList<>(); 
 Scanner sc = new Scanner(System.in);

 //adding element through user input
l1.add(1);
l1.add(6);
l1.add(5);
l1.add(4);
l1.add(3);

System.out.println(l1.get(3));
  // System.out.print("Original array : -");
  // System.out.print(l1);
  // System.out.println();
  // System.out.print("This is reversed array: -");
  // reversethearraylist(l1);
  // System.out.println(l1);


// adding element in l1 
// l1.add("Hariom");
// l1.add(45);
// l1.add("True");

 

 
    
}}
