package Java.Strings;
import java.util.Scanner;
class Solution {

    static boolean isAnagram(String a, String b) {
        boolean isAnagram=true;
        a=a.toLowerCase();
        b=b.toLowerCase();
        a = a.chars().sorted().collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
        b = b.chars().sorted().collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
        if(a.length()!=b.length())
        isAnagram=false;
        else
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i)){
                isAnagram=false;
                break;
            }  
        }
        return isAnagram;
    }
}