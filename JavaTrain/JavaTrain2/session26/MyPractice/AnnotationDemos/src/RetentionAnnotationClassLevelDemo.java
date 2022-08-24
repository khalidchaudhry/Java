import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
}


@MyAnnotation3
public class RetentionAnnotationClassLevelDemo {
    public static void main(String[] args) throws Exception {
        RetentionAnnotationClassLevelDemo demo=new RetentionAnnotationClassLevelDemo();
        Class demoClass = demo.getClass();
        Annotation annotation=  demoClass.getAnnotation(MyAnnotation3.class);
        System.out.println(annotation);

    }

    public void testMethod(){
        System.out.println("testMethod output");
    }
}
