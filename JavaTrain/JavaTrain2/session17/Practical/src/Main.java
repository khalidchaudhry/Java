import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner scanner=new Scanner(System.in);
        //System.out.println("Enter string 1");
        String str1=new String("Welcome");//args[0];//scanner.nextLine();
        //System.out.println("Enter string 2");
        //System.out.println(str1);
        String str2=new String("Welcome");//args[1];//scanner.nextLine();
        //System.out.println(str2);
        if(str1==str2){
            System.out.println("str1 and str2 are equal");
        }else {
            System.out.println("str1 and str2 are not equal");
        }

        String s3="welcome";
        String s4="welcome";
        if(s3==s4){
            System.out.println("s3 and s4 are equal");
        }else{
            System.out.println("s3 and s4 are not equal");
        }
//        if(str1==str2){
//            System.out.println("Object reference are equal");
//        }

//        if(str1.equalsIgnoreCase(str2)){
//            System.out.println("String 1 and string 2 are equal");
//        }




    }
}