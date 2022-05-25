package package2;
import package1.C1;

public class C3 {

    public void c3Method(){
       C1 class1Instance=new C1();

        System.out.println(class1Instance.publicVariable);

        //+ Can not access private and protected variables from C1 class
        // System.out.println(class1Instance.protectedVariable);
        // System.out.println(class1Instance.privateVariable);



    }

}
