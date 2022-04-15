package academy.learnprogramming;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        return count;
    }

    private static int[] readElements(int count){
        Scanner scanner=new Scanner(System.in);
        int[] elements=new int[count];
        for(int i=0;i<elements.length;++i){
            elements[i]=scanner.nextInt();
        }
        return elements;
    }
    private static  int findMin(int[] arr){
       int min=arr[0];
       for (int i=0;i<arr.length;++i){
           min=Math.min(min,arr[i]);
       }
       return min;
    }
}
