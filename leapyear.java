import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a;
    a=sc.nextInt();
    if(a%400==0)
        System.out.print("Leap year");
    else if(a%100==0)
        System.out.print("Not a Leap year");
    else if(a%4==0)
        System.out.print("Leap year");
    else
        System.out.print("Not a Leap year");
    }
}
