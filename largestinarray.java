import java.util.*;
public class largestinarray {
   
    //find the largest number

 public static int getlargest(int num[]){
    int largest=Integer.MIN_VALUE;
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<num.length;i++){
        if(largest<num[i]){
            largest=num[i];
        }
        else//(smallest>num[i])
        {
            smallest=num[i];
        }
    }
    System.out.println("smallest value=  "+smallest);
    return largest;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the length of array:- ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the "+n +" number of array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("largest value= "+getlargest(arr));
}
}
