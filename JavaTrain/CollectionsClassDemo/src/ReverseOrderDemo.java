import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseOrderDemo {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Comparator comparator=Collections.reverseOrder(new MyComparator());
        Collections.sort(list,comparator);
        System.out.println(list);

    }
    public static class MyComparator implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            return o1.toString().compareTo(o2.toString());
        }
    }
}
