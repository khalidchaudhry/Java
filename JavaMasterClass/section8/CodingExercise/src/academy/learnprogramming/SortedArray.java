package academy.learnprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortedArray {

    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;++i){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){

        int[] cloned=arr.clone();
        Arrays.sort(cloned);
        int left=0;
        int right=arr.length-1;

        while (left<right){
            int temp=cloned[left];
            cloned[left]=cloned[right];
            cloned[right]=temp;
        }
        return cloned;
    }
    public static Integer[] getIntegers(int size){
        Scanner scanner=new Scanner(System.in);
        Integer[] arr=new Integer[size];
        for(int i=0;i<arr.length;++i){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
}

