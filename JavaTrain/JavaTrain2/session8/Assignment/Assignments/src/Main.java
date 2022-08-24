public class Main {
    public static void main(String[] args) {

       int number=5;

        System.out.println(isPrimeNumber(number));

    }
    private static boolean isPrimeNumber(int number){
       int factorsCount=0;

       for(int i=1;i<=number;++i){
           if(number%i==0){
               ++factorsCount;
           }
       }
       return factorsCount==2;
    }
    private void ClassifyMarks(int n){
        if(n<0 || n>100){
            System.out.println("Invalid marks");
        }


        if(n>=75 && n<=99){
            System.out.println("Distinction");
        }
        else if(n>=60 && n<=74){
            System.out.println("First class");
        }
        else if(n>=45 && n<=59){
            System.out.println("Second class");
        }
        else if(n>=35 && n<=44){
            System.out.println("Pass");
        }
        else if(n>=0 && n<=34){
            System.out.println("Failed");
        }

    }
}