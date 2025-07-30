import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    a =sc.nextInt();
    b =sc.nextInt();
    c =sc.nextInt();
    if (a+b+c ==180 && (a+b !=180) && (a+c !=180) && (c+b !=180) && a >=0 && b >=0 && c >=0)
        System.out.print("Valid");
    else
        System.out.print("Not Valid");
    
    }
}
