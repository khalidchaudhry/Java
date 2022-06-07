public class NestedIfElseAssignment {
    public static void main(String[] args) {
       int a=10;

       if(a>=10){
           System.out.println("a value is >=10");
           if(a%2==0){
               System.out.println("a is divisible by 2");
           }else {
               System.out.println("a is not divisible by 2");
           }
       }
    }
}
