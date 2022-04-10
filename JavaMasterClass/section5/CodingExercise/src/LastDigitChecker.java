public class LastDigitChecker {
    public static  boolean hasSameLastDigit(int num1,int num2,int num3){
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }
        int num1RightMostDigit=num1%10;
        int num2RightMostDigit=num2%10;
        int num3RightMostDigit=num3%10;

        if(num1RightMostDigit==num2RightMostDigit || num1RightMostDigit==num3RightMostDigit
           || num2RightMostDigit==num3RightMostDigit){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean  isValid(int num) {
        return num>=10 && num<=1000;
    }
}
