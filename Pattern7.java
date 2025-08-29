import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
       int n,row,col;
        n=sc.nextInt();
        int size=2*n-1;
        for(row=1;row<=size;row++){
            for(col=1;col<=size;col++){
               if(row==1 || row==size || col==1 || col==size || col+row==size+1 || col==row ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");    
            }
            }
            System.out.println();
        }
    }
}
