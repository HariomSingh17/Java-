package summervacation.Array;
//SUM , SEARCHING ELEMENT , MAXIMUM ELEMENT {TWO WAY OF INITIALIZE ARRAY ,MULTI ARRAY}
public class Basic {
    public static void main(String[] args) {
        
    
//int arr[][]=new int[2][2];// Intializing and declaring the size of array ...
          int arr_1[][]={{1,2,3,4},{4,5,6,2}};  // another way to initialize
         //number of element define no of columns
        // and number of bracket define , num of rows:
        // arr[0][0]=9; manually putting
        //   System.out.println(arr_1[1][0]);
        // System.out.println(arr_1.length);
        int arr[] = {1, 5, 3};
        int sum = 0;
        int count = 0;
        int ans = 0;
        int search  = -1;
        //for(int toprint : arr){ //for each loop used here
        //System.out.println(toprint);
        for (int i = 0; i < 3; i++) {
            sum = sum + arr[i];
            count++;
            if(ans <arr[i]){
                ans = arr[i];
            }int x =6;
            //Seaching the element and return its index if present else return -1  :
            if(arr[i]==x){
                search=i;
            }

        }
        System.out.println(sum);
        System.out.println("The count will be " + count);
        System.out.println("Max number is "+ ans);
        System.out.println("The index of search is "+ search);
}}
