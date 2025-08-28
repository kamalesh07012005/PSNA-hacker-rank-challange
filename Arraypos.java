import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        if (pos < 1 || pos > n) {
            System.out.println("Deletion not possible.");
        } else {
            int[] newArr = new int[n - 1];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (i != pos - 1) {
                    newArr[index++] = arr[i];
                }
            }
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + (i == newArr.length - 1 ? "\n" : " "));
            }
        }

        sc.close();
    }
}
