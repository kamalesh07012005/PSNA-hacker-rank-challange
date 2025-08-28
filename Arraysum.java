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

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = totalSum - arr[i];
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
