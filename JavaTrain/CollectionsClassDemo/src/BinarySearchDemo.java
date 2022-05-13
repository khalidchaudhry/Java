import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchDemo {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add(15);
        arrayList.add(0);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(5);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println(Collections.binarySearch(arrayList,10));
        System.out.println(Collections.binarySearch(arrayList,15));
        System.out.println(Collections.binarySearch(arrayList,1000));

    }
}
