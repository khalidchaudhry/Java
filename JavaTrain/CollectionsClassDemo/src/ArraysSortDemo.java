import java.util.Arrays;

public class ArraysSortDemo {
    public static void main(String[] args) {
        int[] a=new int[]{10,5,20,11,6};
        System.out.println("Primitive type before sorting");
        for(int i:a){
            System.out.print(i+" ");
        }

        Arrays.sort(a);
        System.out.println();
        for(int i:a){
            System.out.print(i+" ");
        }


    }

}
