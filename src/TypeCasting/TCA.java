package TypeCasting;


public class TCA {

    public static void main(String[] args) {

        // ==========================================
        // IMPLICIT TYPE CASTING
        // (Widening Type Casting)
        // ==========================================

        byte b = 82;
        short s = 12354;
        int i = 746892734;
        long l = 1234558598L;

        // byte to int
        int byteToInt = b;

        // short to long
        long shortToLong = s;

        // int to long
        long intToLong = i;

        // long to float
        float longToFloat = l;

        System.out.println("Original byte value b: " + b);
        System.out.println("Conversion of byte to int: " + byteToInt);

        System.out.println("Original short value s: " + s);
        System.out.println("Conversion of short to long: " + shortToLong);

        System.out.println("Original int value i: " + i);
        System.out.println("Conversion of int to long: " + intToLong);

        System.out.println("Original long value l: " + l);
        System.out.println("Conversion of long to float: " + longToFloat);

        // EXPLICIT TYPE CASTING
        

        double d = 34533.56;
        int doubleToInt = (int) d;

        System.out.println("\nOriginal double value d: " + d);
        System.out.println("Conversion of double to int: " + doubleToInt);


        // float to int

        float f = 7435.34f;
        int floatToInt = (int) f;

        System.out.println("\nOriginal float value f: " + f);
        System.out.println("Conversion of float to int: " + floatToInt);


        // long to int

        long number = 1234558598L;
        int longToInt = (int) number;

        System.out.println("\nOriginal long value: " + number);
        System.out.println("Conversion of long to int: " + longToInt);


        // int to short

        int number2 = 12354;
        short intToShort = (short) number2;

        System.out.println("\nOriginal int value: " + number2);
        System.out.println("Conversion of int to short: " + intToShort);


        // short to byte

        short number3 = 82;
        byte shortToByte = (byte) number3;

        System.out.println("\nOriginal short value: " + number3);
        System.out.println("Conversion of short to byte: " + shortToByte);


        // ==========================================
        // INTEGER TO DECIMAL
        // ==========================================

        int x = 18;
        double intToDouble = x;

        System.out.println("\nOriginal integer value x: " + x);
        System.out.println("Conversion of int to double: " + intToDouble);


        // ==========================================
        // DOUBLE TO FLOAT
        // ==========================================

        double a = 34533.56;
        float doubleToFloat = (float) a;

        System.out.println("\nOriginal double value a: " + a);
        System.out.println("Conversion of double to float: " + doubleToFloat);


        // ==========================================
        // CHARACTER TYPE CASTING
        // ==========================================

        char ch = 'S';
        int charToInt = ch;

        System.out.println("\nOriginal character value ch: " + ch);
        System.out.println("Conversion of char to int: " + charToInt);


        // ==========================================
        // INTEGER TO CHARACTER
        // ==========================================

        int value = 83;
        char intToChar = (char) value;

        System.out.println("\nOriginal integer value: " + value);
        System.out.println("Conversion of int to char: " + intToChar);


        // ==========================================
        // BOOLEAN
        // ==========================================

        boolean a1 = true;
        boolean a2 = false;

        System.out.println("\nBoolean value a1: " + a1);
        System.out.println("Boolean value a2: " + a2);
    }
}