import java.util.ArrayList;
import java.util.List;
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0) {
            return -1;
        }
        if(number==0) {
            return 0;
        }
        List<Integer> lst= new ArrayList<>();
        while(number!=0){
            int remainder=number%10;
            lst.add(remainder);
            number=number/10;
        }
        if(lst.size()==1){
            return lst.get(0);
        }
        return lst.get(0)+lst.get(lst.size()-1);
    }
}
