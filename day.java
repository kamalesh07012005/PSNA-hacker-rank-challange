import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();

        if (dayNum == 0) {
            System.out.println("Sunday");
        } else if (dayNum == 1) {
            System.out.println("Monday");
        } else if (dayNum == 2) {
            System.out.println("Tuesday");
        } else if (dayNum == 3) {
            System.out.println("Wednesday");
        } else if (dayNum == 4) {
            System.out.println("Thursday");
        } else if (dayNum == 5) {
            System.out.println("Friday");
        } else if (dayNum == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid");
        }
    }

    }
