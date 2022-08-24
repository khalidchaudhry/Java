public class MyClass extends ParentClass implements MyInterface{

    public MyClass(int number,String randString){
        //System.out.println("You sent: "+number+" "+randString);
    }

    private String idCode="100";
    private String getPrivate(){
        return "How did you get this?";
    }
    private String getOtherPrivate(int thisInt,String thatString){
        return "How did you get here "+thisInt+" "+thatString;
    }
    public void getPublic() {
        System.out.println("getPublic method");
    }
    public void getPublic2(int param1,int param2,MyClass param3) {
        System.out.println("getPublic method");
    }


    @Override
    void getName() {
        System.out.println("MyClass");
    }
}
