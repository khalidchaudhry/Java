import java.util.HashSet;
public class SharedDigit {
    public static boolean hasSharedDigit(int number1,int number2)
    {
        if(number1<10 || number1>99 || number2<10 || number2>99){
            return false;
        }
        HashSet<Integer> hs=new HashSet<>();
        while(number1!=0){
            int remainder=number1%10;
            hs.add(remainder);
            number1=number1/10;
        }
        while(number2!=0){
            int remainder=number2%10;
            if(hs.contains(remainder)){
                return true;
            }
            number2=number2/10;
        }
        return false;
    }
}
