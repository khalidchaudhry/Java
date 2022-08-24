package com.edureka.khalid.assignments.assignment1;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.Scanner;

public class DataTypesAndOperationsAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********Welcome***************");
        DataTypesAndOperationsAssignment obj = new DataTypesAndOperationsAssignment();
        while (true) {
            System.out.println("Select operation.Enter \n" +
                    "1----Addition\n" +
                    "2----Subtraction\n" +
                    "3----Multiplication\n" +
                    "4----Division\n" +
                    "5----Increment\n" +
                    "6----Decrement\n" + "" +
                    "To quit press 7");
            int operationType = scanner.nextInt();

            switch (operationType) {
                case 1:
                    int operandType = obj.getOperandsType();
                    switch (operandType) {
                        case 1:
                            byte byteNum1 = obj.getByteOperand();
                            byte byteNum2 = obj.getByteOperand();
                            System.out.println(byteNum1 + "+" + byteNum2 + "=" + (byteNum1 + byteNum2));
                            break;
                        case 2:
                            long longNum1 = obj.getLongOperand();
                            long longNum2 = obj.getLongOperand();
                            System.out.println(longNum1 + "+" + longNum2 + "=" + (longNum1 + longNum2));
                            break;
                        case 3:
                            short shortNum1 = obj.getShortOperand();
                            short shortNum2 = obj.getShortOperand();
                            System.out.println(shortNum1 + "+" + shortNum2 + "=" + (shortNum1 + shortNum1));
                            break;
                        case 4:
                            int intNum1 = obj.getIntOperand();
                            long intNum2 = obj.getIntOperand();
                            System.out.println(intNum1 + "+" + intNum2 + "=" + (intNum2 + intNum2));
                            break;
                        case 5:
                            double doubleNum1 = obj.getDoubleOperand();
                            double doubleNum2 = obj.getDoubleOperand();
                            System.out.println(doubleNum1 + "+" + doubleNum2 + "=" + (doubleNum1 + doubleNum2));
                            break;
                        case 6:
                            float floatNum1 = obj.getFloatOperand();
                            float floatNum2 = obj.getFloatOperand();
                            System.out.println(floatNum1 + "+" + floatNum2 + "=" + (floatNum1 + floatNum2));
                            break;
                    }
                    break;
                case 2:
                    operandType = obj.getOperandsType();
                    switch (operandType) {
                        case 1:
                            byte byteNum1 = obj.getByteOperand();
                            byte byteNum2 = obj.getByteOperand();
                            System.out.println(byteNum1 + "-" + byteNum2 + "=" + (byteNum1 - byteNum2));
                            break;
                        case 2:
                            long longNum1 = obj.getLongOperand();
                            long longNum2 = obj.getLongOperand();
                            System.out.println(longNum1 + "-" + longNum2 + "=" + (longNum1 - longNum2));
                            break;
                        case 3:
                            short shortNum1 = obj.getShortOperand();
                            short shortNum2 = obj.getShortOperand();
                            System.out.println(shortNum1 + "-" + shortNum2 + "=" + (shortNum1 - shortNum1));
                            break;
                        case 4:
                            int intNum1 = obj.getIntOperand();
                            long intNum2 = obj.getIntOperand();
                            System.out.println(intNum1 + "-" + intNum2 + "=" + (intNum2 - intNum2));
                            break;
                        case 5:
                            double doubleNum1 = obj.getDoubleOperand();
                            double doubleNum2 = obj.getDoubleOperand();
                            System.out.println(doubleNum1 + "-" + doubleNum2 + "=" + (doubleNum1 - doubleNum2));
                            break;
                        case 6:
                            float floatNum1 = obj.getFloatOperand();
                            float floatNum2 = obj.getFloatOperand();
                            System.out.println(floatNum1 + "-" + floatNum2 + "=" + (floatNum1 - floatNum2));
                            break;
                    }
                    break;
                case 3:
                    operandType = obj.getOperandsType();
                    switch (operandType) {
                        case 1:
                            byte byteNum1 = obj.getByteOperand();
                            byte byteNum2 = obj.getByteOperand();
                            System.out.println(byteNum1 + "*" + byteNum2 + "=" + (byteNum1 * byteNum2));
                            break;
                        case 2:
                            long longNum1 = obj.getLongOperand();
                            long longNum2 = obj.getLongOperand();
                            System.out.println(longNum1 + "*" + longNum2 + "=" + (longNum1 * longNum2));
                            break;
                        case 3:
                            short shortNum1 = obj.getShortOperand();
                            short shortNum2 = obj.getShortOperand();
                            System.out.println(shortNum1 + "*" + shortNum2 + "=" + (shortNum1 * shortNum1));
                            break;
                        case 4:
                            int intNum1 = obj.getIntOperand();
                            long intNum2 = obj.getIntOperand();
                            System.out.println(intNum1 + "-" + intNum2 + "=" + (intNum2 - intNum2));
                            break;
                        case 5:
                            double doubleNum1 = obj.getDoubleOperand();
                            double doubleNum2 = obj.getDoubleOperand();
                            System.out.println(doubleNum1 + "*" + doubleNum2 + "=" + (doubleNum1 * doubleNum2));
                            break;
                        case 6:
                            float floatNum1 = obj.getFloatOperand();
                            float floatNum2 = obj.getFloatOperand();
                            System.out.println(floatNum1 + "*" + floatNum2 + "=" + (floatNum1 * floatNum2));
                            break;
                    }
                    break;
                case 4:
                    operandType = obj.getOperandsType();
                    switch (operandType) {
                        case 1:
                            byte byteNum1 = obj.getByteOperand();
                            byte byteNum2 = obj.getByteOperand();
                            System.out.println(byteNum1 + "/" + byteNum2 + "=" + (byteNum1 / byteNum2));
                            break;
                        case 2:
                            long longNum1 = obj.getLongOperand();
                            long longNum2 = obj.getLongOperand();
                            System.out.println(longNum1 + "/" + longNum2 + "=" + (longNum1 / longNum2));
                            break;
                        case 3:
                            short shortNum1 = obj.getShortOperand();
                            short shortNum2 = obj.getShortOperand();
                            System.out.println(shortNum1 + "/" + shortNum2 + "=" + (shortNum1 / shortNum1));
                            break;
                        case 4:
                            int intNum1 = obj.getIntOperand();
                            long intNum2 = obj.getIntOperand();
                            System.out.println(intNum1 + "/" + intNum2 + "=" + (intNum2 / intNum2));
                            break;
                        case 5:
                            double doubleNum1 = obj.getDoubleOperand();
                            double doubleNum2 = obj.getDoubleOperand();
                            System.out.println(doubleNum1 + "/" + doubleNum2 + "=" + (doubleNum1 / doubleNum2));
                            break;
                        case 6:
                            float floatNum1 = obj.getFloatOperand();
                            float floatNum2 = obj.getFloatOperand();
                            System.out.println(floatNum1 + "/" + floatNum2 + "=" + (floatNum1 / floatNum2));
                            break;
                    }
                    break;
                case 5:
                    operandType = obj.getOperandsType();
                    switch (operandType) {
                        case 1:
                            byte byteNum1 = obj.getByteOperand();
                            System.out.println("++" + byteNum1 + "=" + (++byteNum1));
                            break;
                        case 2:
                            long longNum1 = obj.getLongOperand();
                            System.out.println("++" + longNum1 + "=" + (++longNum1));
                            break;
                        case 3:
                            short shortNum1 = obj.getShortOperand();
                            System.out.println("++" + shortNum1 + "=" + (++shortNum1));
                            break;
                        case 4:
                            int intNum1 = obj.getIntOperand();
                            System.out.println("++" + intNum1 + "=" + (++intNum1));
                            break;
                        case 5:
                            double doubleNum1 = obj.getDoubleOperand();
                            System.out.println("++" + doubleNum1 + "=" + (++doubleNum1));
                            break;
                        case 6:
                            float floatNum1 = obj.getFloatOperand();
                            System.out.println("++" + floatNum1 + "=" + (++floatNum1));
                            break;
                    }
                    break;
                case 6:
                    operandType = obj.getOperandsType();
                    switch (operandType) {
                        case 1:
                            byte byteNum1 = obj.getByteOperand();
                            System.out.println("--" + byteNum1 + "=" + (--byteNum1));
                            break;
                        case 2:
                            long longNum1 = obj.getLongOperand();
                            System.out.println("--" + longNum1 + "=" + (--longNum1));
                            break;
                        case 3:
                            short shortNum1 = obj.getShortOperand();
                            System.out.println("--" + shortNum1 + "=" + (--shortNum1));
                            break;
                        case 4:
                            int intNum1 = obj.getIntOperand();
                            System.out.println("--" + intNum1 + "=" + (--intNum1));
                            break;
                        case 5:
                            double doubleNum1 = obj.getDoubleOperand();
                            System.out.println("--" + doubleNum1 + "=" + (--doubleNum1));
                            break;
                        case 6:
                            float floatNum1 = obj.getFloatOperand();
                            System.out.println("--" + floatNum1 + "=" + (--floatNum1));
                            break;
                    }
                    break;
                case 7:
                    System.out.println("Have a nice day.Exiting!");
                    break;
            }
            if (operationType == 7) {
                break;
            }
        }
    }


    //Helper functions
    private int getOperandsType() {
        while (true) {
            System.out.println("Enter operand(s) type.Enter \n" +
                    "1----byte\n" +
                    "2----long\n" +
                    "3----short\n" +
                    "4----int\n" +
                    "5----double\n" +
                    "6----float\n");
            Scanner scanner = new Scanner(System.in);
            int operandType = scanner.nextInt();
            if (operandType >= 1 && operandType <= 6) {
                return operandType;
            }
            System.out.println("Enter valid operand(s) type");
        }
    }

    private byte getByteOperand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num:");
        return scanner.nextByte();
    }

    private short getShortOperand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num:");
        return scanner.nextShort();
    }

    private int getIntOperand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num:");
        return scanner.nextInt();
    }

    private long getLongOperand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num:");
        return scanner.nextLong();
    }

    private Double getDoubleOperand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num:");
        return scanner.nextDouble();
    }

    private Float getFloatOperand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num:");
        return scanner.nextFloat();
    }

    //endregion

}
