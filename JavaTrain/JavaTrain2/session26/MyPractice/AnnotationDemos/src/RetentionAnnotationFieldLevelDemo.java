import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation4{
}



public class RetentionAnnotationFieldLevelDemo {

    @MyAnnotation4
    private int val;

    public static void main(String[] args) throws Exception {
        
        RetentionAnnotationFieldLevelDemo demo =new RetentionAnnotationFieldLevelDemo();
        Annotation[] annotations=demo.getClass().getDeclaredField("val").
                getDeclaredAnnotations();
        for(Annotation annotation:annotations){
            System.out.println(annotation);
        }
        Annotation annotation=demo.getClass().getDeclaredField("val").
                getDeclaredAnnotation(MyAnnotation4.class);

        System.out.println(annotation);


    }

    public void testMethod(){


        System.out.println("testMethod output");
    }
}
