import java.util.*;
public class binarrysearch {
    //Binary search
public static int binarysearch(int num[],int key){
    int start=0;
    int end=num.length;
    while(start<=end){
        int mid=(start+end)/2;
        if(num[mid]==key){
            return mid;
        }
        else if(num[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return -1;
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
    System.out.println("enter the key :- ");
    int key=sc.nextInt();
    System.out.print("index is :"+binarysearch(arr, key));
}
}
