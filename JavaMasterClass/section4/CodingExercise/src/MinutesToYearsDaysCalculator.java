public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid value");
        }
        else{

            double minutesInYear = 60 * 24 * 365;
            long years=(long)(minutes/minutesInYear);
            long days=(minutes/60/24)%365;
                                  //"XX min = YY y and ZZ d".
            System.out.println(minutes+" min = "+years+" y and "+days+" d" );
        }

        }

}
