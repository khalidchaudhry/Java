import java.util.ArrayList;
import java.util.List;

public class FactorPrinter {
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        List<Integer> factors=new ArrayList<Integer>();
        for(int i=1;i<=number;++i){
            if(number%i==0){
                factors.add(i);
            }
        }
        for(Integer factor : factors){
            System.out.print(factor);
        }
    }
}
