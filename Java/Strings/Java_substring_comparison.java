package Java.Strings;

 class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String current= "";      
        smallest=s.substring(0, k);
        largest=s.substring(0, k);
        for (int i = 1; i <= s.length()-k; i++) {
            current=s.substring(i,(i+k));
            if(current.compareTo(smallest)<0){
                smallest=current;
            }
            if(current.compareTo(largest)>0){
                largest=current;
            }
        }
        
        return smallest + "\n" + largest;
    }
 }
