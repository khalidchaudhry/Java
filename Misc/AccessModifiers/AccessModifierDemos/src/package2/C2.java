package package2;

import package1.C1;

class C2 extends C1{

    public  void c2Method(String[] args) {

        //! I can access public and protected(because i extend this class from C1)
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        //+ Can't access private and default variables
        //System.out.println(defaultVariable);
        //System.out.println(class1.privateVariable);
    }

}
