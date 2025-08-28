import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];    
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int[] result=new int[size];
        result[0] = arr[0] * arr[1];
        for(int i=1;i<size-1;i++) {
            result[i] =arr[i-1]*arr[i+1];
        }
        result[size-1]=arr[size-2]*arr[size-1];
        for (int i=0;i<size;i++) {
            System.out.print(result[i] + " ");
        }
       
    }
}
