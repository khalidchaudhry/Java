import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List lst=new ArrayList();
        lst.add(1);
        lst.add(100);
        lst.add(5);
        lst.add(50);

        //+ sort based on natural sorting order
        Collections.sort(lst);
        System.out.println(lst);

        Collections.sort(lst,new MyComparator());


        System.out.println(lst);



    }

    public static class MyComparator implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            Integer i1=(Integer) o1;
            Integer i2=(Integer) o2;
            return i2.compareTo(i1);

        }
    }
}