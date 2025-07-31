import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String date = sc.nextLine(); // Format: dd/mm/yyyy

        String[] parts = date.split("/");

        if (parts.length == 3) {
            int dd = Integer.parseInt(parts[0]);
            int mm = Integer.parseInt(parts[1]);
            int yyyy = Integer.parseInt(parts[2]);
            if (yyyy >= 1900 && yyyy <= 9999) {
                if (mm >= 1 && mm <= 12) {
                    int maxDays = 31; 
                    if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
                        maxDays = 30;
                    } else if (mm == 2) {
                
                        if ((yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0)) {
                            maxDays = 29;
                        } else {
                            maxDays = 28;
                        }
                    }

                    
                    if (dd >= 1 && dd <= maxDays) {
                        System.out.println("Valid");
                    } else {
                        System.out.println("Invalid");
                    }
                } else {
                    System.out.println("Invalid"); 
                }
            } else {
                System.out.println("Invalid"); 
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
