import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char a;
    a=sc.nextLine().charAt(0);
    if(a=='A'||a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u')
        System.out.print("Vowel");
        else
            System.out.print("Consonant");
    
    }
}
