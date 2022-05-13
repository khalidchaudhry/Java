import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {
    public static void main(String[] args) {
        String[] s={"A","Z","B"};
        List l= Arrays.asList(s);
        System.out.println(l);
        l.set(1,"L");

        for(String s1:s){
            System.out.print(s1);
        }
        //+ Below line will report unsupported reported exception
        //l.add("K");

        //+ Below will produce Array store exception
        l.set(1,10);


    }
}
