import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
}
public class RetentionAnnotationMethodLevelDemo {
    public static void main(String[] args) throws Exception {
        RetentionAnnotationMethodLevelDemo demo=new RetentionAnnotationMethodLevelDemo();
        Class demoClass = demo.getClass();
        Method method=demoClass.getMethod("testMethod");
        MyAnnotation2 myAnnotation2=method.getAnnotation(MyAnnotation2.class);
        System.out.println(myAnnotation2);

    }
    @MyAnnotation2
    public void testMethod(){
        System.out.println("testMethod output");
    }
}
