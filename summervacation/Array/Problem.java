package summervacation.Array;

public class Problem {
    public static void main(String[] args) {
        
    
    //Target sum ;
    //This is how i done :
    int arr [] ={0,1,2,3,4};// find to num of pair that satisfy target sum {4}
    int nooftargetsum=0;
    int nooftargetsum2=0;
    for(int i = 1; i<arr.length; i++){
        if(arr[i]+arr[i-1]==4){
            nooftargetsum++;
        }
    } System.out.println(nooftargetsum);
     
    for(int i =0; i<arr.length; i++){
        for(int j = i+1; j<arr.length; j++){
            if(arr[i]+arr[j]==4){
            nooftargetsum2++;}
        }
    } System.out.println("The total no of target sum is :" +nooftargetsum2);


    
}}
