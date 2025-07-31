import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();  // Read input like "hh:mm:ss"
        
        String[] parts = time.split(":");

        if (parts.length == 3) {
            int hh = Integer.parseInt(parts[0]);
            int mm = Integer.parseInt(parts[1]);
            int ss = Integer.parseInt(parts[2]);
            if (hh >= 0 && hh <= 23) {
                if (mm >= 0 && mm <= 59) {
                    if (ss >= 0 && ss <= 59) {
                        System.out.println("Valid");
                    } else {
                        System.out.println("Not Valid"); 
                    }
                } else {
                    System.out.println("Not Valid"); 
                }
            } else {
                System.out.println("Not Valid");  
            }
        } else {
            System.out.println("Not Valid");  
        }
    }
}
