import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char a;
    a=sc.nextLine().charAt(0);
    if((a>='A'&& a<='Z') || (a>='a'&& a<='z'))
        System.out.print("ALPHABET");
    
    else if (a>='0'&& a<='9')
        System.out.print("NUMBER");
    
    else
           System.out.printf("SPECIAL CHARACTER");
    

    }
}
