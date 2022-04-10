package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while (true){
            System.out.println("Enter number:");
            if(scanner.hasNextInt()){
                int number=scanner.nextInt();
                min=Math.min(number,min);
                max=Math.max(number,max);
            }
            else {
                break;
            }

            scanner.nextLine(); //handle input
        }
        scanner.close();

        System.out.println("Min:" +min+" Max:"+max);
    }
}
