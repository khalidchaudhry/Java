import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface MyAnnotation{
int value1();
int value2();
}

@MyAnnotation(value1=10,value2 = 20)
public class TargetAnnotationDemo {
    public static void main(String[] args) {
        TargetAnnotationDemo demo=new TargetAnnotationDemo();
        System.out.println("Applied my annotation to "+demo.getClass().getSimpleName()+" class");
    }
}