import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size+1];
    for(int i=0;i<size;i++){                            //get size and enter the elements
        arr[i]=sc.nextInt();
    }
     int element=sc.nextInt();
    int pos=sc.nextInt();
    int index=pos-1;
    for(int i=size;i>index;i--){
        arr[i]=arr[i-1];
    }
    arr[index]=element;
    for(int i=0;i<=size;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
