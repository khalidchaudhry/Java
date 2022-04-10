package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue=10000;
        int myMinIntValue=Integer.MIN_VALUE; //Integer is the wrapper class
        int myMaxIntValue=Integer.MAX_VALUE; // 32 bytes
        System.out.println("Integer min value="+myMinIntValue);
        System.out.println("Integer max value="+myMaxIntValue);
        System.out.println("Busted max value="+(myMaxIntValue+1)); //overflow
        System.out.println("Busted min value="+(myMinIntValue-1)); //underflow
        int myMaxIntTest=2_147_483_647;

        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Byte min value:"+myMinByteValue);
        System.out.println("Byte max value:"+myMaxByteValue);

        short myMinShortValue=Short.MIN_VALUE; //16 bits
        short myMaxShortValue=Short.MAX_VALUE; //16 bytes
        System.out.println("Short min value:"+myMinShortValue);
        System.out.println("Short max value:"+myMaxShortValue);

        long myLongValue=100L; // 64 bits(8 bytes)

        long myMinLongValue=Long.MIN_VALUE; //64 bits(8 bytes)
        Long myMaxLongValue=Long.MAX_VALUE; //64 bits(8 bytes)
        System.out.println("long min value:"+myMinLongValue);
        System.out.println("long max value:"+myMaxLongValue);

        long bigLongLiteralValue=2_147_483_647_345L;
        System.out.println(bigLongLiteralValue);


        byte myNewByteValue=(byte)(myMinByteValue/2);

        short myNewShortValue=(short)(myMinShortValue/2);




    }
}
