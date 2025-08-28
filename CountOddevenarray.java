import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int even=0;
    int odd=0;
     int size=sc.nextInt();
     int a[]=new int[size];
     for(int i=0;i<size;i++){
         a[i]=sc.nextInt();
     }
         for(int i=0;i<size;i++){
             if(a[i]%2==0){
                 even++;
     }
             else{
                 odd++;
                 
             }
             }
        System.out.println("Odd = "+odd);
        System.out.print("Even = "+even);
    }
}
