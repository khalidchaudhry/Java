import java.util.ArrayList;
import java.util.Collections;

public class ReverseDemo {
    public static void main(String[] args) {
        ArrayList test=new ArrayList();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        Collections.reverse(test);
        System.out.println(test);
    }
}
