package com.khalid;

public class AbstractClassDemo {

    public static void main(String[] args) {

        //! Abstract class cannot be instantiated
        //AbtractClass abstractClass=new AbtractClass();

        DeriveClass deriveClass=new DeriveClass();
        deriveClass.getprotectedvarvalueFromParent();

    }
}

abstract class AbtractClass {
    public static int publicstaticvar=10;
    private static int privatestaticvar=20;
    protected static int protectedstaticvar=30;
    private int privateVar;
    protected int protectedvar;
    int packageProtectedVariable;

    //!instantiating derive class will automatically invoke abstract class constructor
    public AbtractClass() {
        privateVar=100;
        protectedvar=120;
        packageProtectedVariable=100;
    }

    public void publicmethod(){

     System.out.println("Public method");
 }
 //! Although we can create private method in abstract method. There is not much use as we can't instantiate abstract class
 private void privatemethod(){

     System.out.println("Private method");
 }

  protected void protectedmethod(){

     System.out.println("Protected method");
 }
}
class DeriveClass extends AbtractClass{

    //+ Getting private variable value from parent is not allowed
    public void getprivatevarValueFromParent(){

        //System.out.println(this.privateVar);
    }

    //! We can always access public and protected members of parent class in child class
    public void getprotectedvarvalueFromParent(){
        System.out.println(protectedvar);
    }

}


