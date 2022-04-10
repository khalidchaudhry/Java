import java.util.ArrayList;
import java.util.List;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        List<Integer> lst= new ArrayList<>();
        while(number!=0){
            int remainder=number%10;
            lst.add(remainder);
            number=number/10;
        }
        int j=lst.size()-1;
        int i=0;
        while(i<(lst.size()/2)){
            if(lst.get(i)!=lst.get(j)){
                return false;
            }
            ++i;
            --j;
        }
        return true;

    }

}
