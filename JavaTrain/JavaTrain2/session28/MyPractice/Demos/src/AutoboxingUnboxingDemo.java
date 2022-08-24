public class AutoboxingUnboxingDemo {
    public static void main(String[] args) {

        int a=20;

        Integer integer1=Integer.valueOf(a);//! before JAVA 5 we need to use value of
        Integer integer2=a;//!autoboxing: compiler AUTOMATICALLY convert it from primitive type to integer type
        System.out.println("Integer1:"+integer1+"\ninteger2:"+integer2);

        int b=integer1.intValue();//! before JAVA 5 we need to use intValue()
        int c=integer1;//! unboxing compiler AUTOMATICALLY convert it from integer type to object type
        System.out.println("b:"+b+" c:"+c);

    }
}