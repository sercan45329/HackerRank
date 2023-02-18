package Java.Strings;

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum;
        String A=sc.next();
        String B=sc.next();
        sum=A.length()+B.length();
        System.out.println(sum);
        if(A.compareTo(B)>0)
        System.out.println("Yes");
        else
        System.out.println("No");
        char a=Character.toUpperCase(A.charAt(0));
        char b=Character.toUpperCase(B.charAt(0));
        StringBuilder string1=new StringBuilder(A);
        StringBuilder string2=new StringBuilder(B);
        string1.setCharAt(0, a);
        string2.setCharAt(0, b);
        System.out.println(string1+" "+string2);
    }
}