import java.util.Scanner;

public class InputCalculator {
  public static void inputThenPrintSumAndAverage(){

      Scanner scanner=new Scanner(System.in);
      long sum=0;
      int count=0;
      while (true){
          if(scanner.hasNextInt()){
              int number=scanner.nextInt();
              sum+=number;
              ++count;
          }
          else {
              System.out.println("SUM = "+sum+" AVG = "+ Math.round((double)sum / count));
              break;
          }
          scanner.nextLine();
      }
      scanner.close();
  }
}
