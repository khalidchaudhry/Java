public class Main {
    @FunctionalInterface
    interface CustomFunctionalInterface{
        int sum(int num1,int num2);
    }
    public static void main(String[] args) {

        CustomFunctionalInterface customFunctionalInterface=(num1,num2)-> num1+num2;
        int result=customFunctionalInterface.sum(30,40);
        System.out.println(result);
    }
}