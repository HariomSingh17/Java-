package summervacation.Array;

public class manipulationproblem {
    public static void main(String[] args) {
        
    
    //Array manipulation ?? --Find num which are not get  duplicate :>
int array [] ={1,2,3,4,1,2,3};
int noduplicatenumber=0;

for(int i=0; i<array.length; i++){
for(int j=i+1; j<array.length; j++){
    if(array[i]==array[j]){
        array[i]=-1;
        array[j]=-1;//mark kar rha hu -1 se taki jo num bache mai usko print kara lu fhor se loop chla ke 
    }

}

}
for(int l =0; l<array.length; l++){
if(array[l]>0){
noduplicatenumber=array[l];
}       
    }
    System.out.println("The number which is not get duplicate is "+noduplicatenumber);
//second hoghest number 
    int arr[] ={5,6,7,8,9};
    int mx = Integer.MIN_VALUE;
    for(int i =0; i<arr.length; i++){
        if(arr[i]>mx){
            mx=arr[i];

        }
    }
System.out.println(mx); // first highest number 

    for (int i=0; i<arr.length; i++){
        if(arr[i]==mx){
            arr[i]=Integer.MIN_VALUE;// first highest ko update karke -infinity kar deye 
        }
    } // from here we can get second highest  number
    int secondhighest=Integer.MIN_VALUE;
    for (int i=0; i<arr.length; i++){
        if(arr[i]>secondhighest){
            secondhighest=arr[i];
        }
    }
System.out.println(secondhighest);
}}
