package package1;

public class C1 {
    public  int publicVariable=10;
    protected int protectedVariable=20;
    int defaultVariable=30;
    private int privateVariable=50;

    public void c1Method(){

        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);
    }
}

class Test{
    public static void main(String[] args) {
        C1 c1=new C1();
        //c1.protectedVariable
    }


}

