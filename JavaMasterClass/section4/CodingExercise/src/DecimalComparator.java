import java.math.RoundingMode;
import java.text.NumberFormat;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double param1,double param2){
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(3);
        nf.setRoundingMode(RoundingMode.FLOOR);

        if(nf.format(param1).equals(nf.format(param2))){
            return true;
        }
        else{
            return false;
        }
    }
}