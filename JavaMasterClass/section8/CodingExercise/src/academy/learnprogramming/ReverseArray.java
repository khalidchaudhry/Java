package academy.learnprogramming;

import java.util.Arrays;

public class ReverseArray {

    private static void ReverseArray(int[] array){
        System.out.println("Array = "+Arrays.toString(array));
        int left=0;
        int right=array.length-1;
        while (left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            ++left;
            --right;
        }
        System.out.println("Reversed Array = "+Arrays.toString(array));
    }
}
