package Java.Strings;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        boolean isPalindrome=true;
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int j=A.length()-1;
        for (int i = 0; i <= A.length()/2; i++) {
            if(A.charAt(i)!=A.charAt(j)){
                isPalindrome=false;
                break;
            }        
           j--;
        }      
        if(isPalindrome)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
