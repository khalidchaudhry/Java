import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class TestingReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        MyClass myObj=new MyClass(12,"TestObj");

        //! Below statement will print class name for obj i.e. MyClass
        System.out.println("Class name of myObj:"+myObj.getClass().getName());

        System.out.println("***********************************");
        System.out.println("Constructors");
        System.out.println("***********************************");
        //! Below statement will get all public constructors  of the class
        Constructor[] constructors=myObj.getClass().getConstructors();
        for(Constructor c:constructors){
            System.out.println(c);
        }
        //! Access class constructor
        System.out.println("***********************************");
        System.out.println("Access class constructor");
        System.out.println("***********************************");
        Constructor constructor=null;
        constructor=MyClass.class.getConstructor(new Class[]{int.class,String.class});
        Object newObj=constructor.newInstance(123,"random");


        System.out.println("***********************************");
        System.out.println("Public Methods");
        System.out.println("***********************************");
        //! Below statement is used to get all public methods in a class
        Method[] methods=myObj.getClass().getMethods();
        for(Method method:methods){
            System.out.println("Method signature:"+method);
            System.out.println("Method return type: "+method.getReturnType());
            Class[] parameterTypes=method.getParameterTypes();
            System.out.println("****************");
            System.out.println("Method Parameters");
            System.out.println("****************");
            int count=0;
            for(Class parameter:parameterTypes){
                System.out.println("Parameter " + ++count +" "+parameter.getClass().getName()+" ");
            }
            System.out.println("****************");
        }

        System.out.println("***********************************");
        System.out.println("Get class objects");
        System.out.println("***********************************");
        //! Get class object for MyClass
        //! Method 1
        //! below statement gives class object
        Class reflectClass=Class.forName("MyClass");
        String className=reflectClass.getName();
        System.out.println(className);
        //! Method 2
        Object obj=new MyClass(123,"random string");
        //! Below statement returns class object
        Class reflectClass2=obj.getClass();
        String className2=reflectClass2.getName();
        System.out.println(className2);
        //!Method 3
        Class reflectClass3=MyClass.class;
        //! Below statement returns class object
        String className3=reflectClass3.getName();
        System.out.println(className3);
        System.out.println("***********************************");
        System.out.println("Get class modifier");
        System.out.println("***********************************");
        int classModifier=MyClass.class.getModifiers();
        System.out.println("MyClass modifier public?: "+Modifier.isPublic(classModifier));
        System.out.println("Other access modifiers we can check are ");
        System.out.println("isAbstract,isFinal,isInterface,isPrivate,isProtected,isStatic,isStrict,isSynchronized,isVolatile");

       //! All interfaces used by class
        System.out.println("***********************************");
        System.out.println("Get all interfaces used by class");
        System.out.println("***********************************");
        Class[] interfaces=MyClass.class.getInterfaces();
        for(Class item : interfaces){
            System.out.println(item.getName());
        }

    }
}