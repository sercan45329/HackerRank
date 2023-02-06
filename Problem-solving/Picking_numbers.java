
import java.util.*;


class Result {
    public static int pickingNumbers(List<Integer> a) {
        a.sort(null);
        int maxLength=0;
        for (int i = 0; i < a.size()-1; i++) {
          int counter=1;
          for (int j = i+1; j < a.size(); j++) {
            int tmp=Math.abs(a.get(i)-a.get(j));
            if(tmp<=1)
                counter++;
            else break;        
          }
          if(counter>maxLength)
           maxLength=counter;
        }
        return maxLength;
    }

}
