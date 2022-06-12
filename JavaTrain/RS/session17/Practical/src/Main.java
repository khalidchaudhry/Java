import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner scanner=new Scanner(System.in);
        //System.out.println("Enter string 1");
        String str1=args[0];//scanner.nextLine();
        //System.out.println("Enter string 2");
        System.out.println(str1);
        String str2=args[1];//scanner.nextLine();
        System.out.println(str2);

//        String s3="welcome";
//        String s4="welcome";
//        if(s3==s4){
//            System.out.println("Equal");
//        }
        if(str1==str2){
            System.out.println("Object reference are equal");
        }

//        if(str1.equalsIgnoreCase(str2)){
//            System.out.println("String 1 and string 2 are equal");
//        }




    }
}