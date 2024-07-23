package summervacation.Array;

public class Problem {
    public static void main(String[] args) {
        
    
    //Things done :Target sum for 2 as wll as 3 number , Array manipulation ;
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

// Count the number of triplet whose sum is equal to given num x
int arr9[]={1,4,5,6,3};
int number=0;
for(int i=0; i<arr9.length; i++){
for(int j=i+1; j<arr9.length; j++){
for(int k=j+1; k<arr9.length; k++){
    if(arr9[i]+arr9[j]+arr9[k]==12){
        number++;
    }

}}}System.out.println("The target sum of triplet is "+number);


    
}}
