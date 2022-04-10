public class NumberToWords {
    public static  void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
            return;
        }
        int reversedNumber=reverse(number);
        int originalNumberDigitsCount=getDigitCount(number);
        int reversedNumberDigitsCount=getDigitCount(reversedNumber);

        if(originalNumberDigitsCount!=reversedNumberDigitsCount){
            int diff=originalNumberDigitsCount-reversedNumberDigitsCount;
            for (int i=0;i<diff;++i){
                System.out.println("Zero");
            }
        }

        while (number!=0) {
            int lastDigit = number % 10;

            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            number=number/10;
        }

    }
    public static  int reverse(int number){
        int reversedNumber=0;
        while (number!=0){
            int lastDigit=number%10;
            reversedNumber=reversedNumber*10+lastDigit;
            number=number/10;
        }
        return reversedNumber;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        if(number==0){
            return 1;
        }
        int digitsCount=0;
        while (number!=0){
            ++digitsCount;
            number=number/10;
        }
        return digitsCount;
    }
}
