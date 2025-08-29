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
        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){
              if(row%2==col%2){
                  System.out.print("1");
              }
                else{
                    System.out.print("0");
                }
        }
            System.out.println();
    }
}
}
