import java.util.*;
public class Reversearray {
    //reverse array by swapping
 public static void reverse(int num[]){
    int first=0;
    int last=num.length-1;
    while(first<last){
        int temp=num[last];
        num[last]=num[first];
        num[first]=temp;
        first++;
        last--;
    }
    for(int i=0;i<num.length;i++){
    System.out.print(num[i]+" ");
    }
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

    reverse(arr);
}
}
