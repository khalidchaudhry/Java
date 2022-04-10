public class EvenDigitSum {
    public  static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int evenDigitsSum=0;
        while(number!=0){
            int remainder=number%10;
            if(remainder%2==0){
                evenDigitsSum+=remainder;
            }
            number=number/10;
        }
        return evenDigitsSum;
    }
}
