import java.util.*;
public class  Llinearsearch{

//linear search
 public static int linearsearch(int num[],int key){
     for(int i=0;i<num.length;i++){
         if(num[i]==key){
             return i;
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
    


// Without taking input from user
  /* int number[]={1,2,3,4,5,6};
    int key=3;  */

    
    System.out.println("enter the key :- ");
    int key=sc.nextInt();
    int index=linearsearch(arr, key);
    if(index==-1){
        System.out.print("NOT FOUND");
    }
    else{
        System.out.print("Key is found at index "+index);
    }
}
}