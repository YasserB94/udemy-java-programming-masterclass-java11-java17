package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Saturday!");

        //Integer occupies 32 bits
        int myIntMinValue = Integer.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myIntMinValue);
        System.out.println("Integer Maximum Value = " + myIntMaxValue);
        //Overflow ===BAD
        System.out.println("Trying to add 1 to Int Max Value = " + (myIntMaxValue+1));
        //Underflow ===BAD
        System.out.println("Trying to subtract 1 from Int Min Value = " + (myIntMinValue-1));

        //Byte - OCCUPIES 8 BITS
        //Used for performance reasons, Byte has a small range of storable values, yet uses less memory
        //As a bonus it also tells other readers of the code instantly that the variable has a small range
        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myByteMinValue);
        System.out.println("Byte Maximum Value = " + myByteMaxValue);

        //Short - OCCUPIES 16 BITS
        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myShortMinValue);
        System.out.println("Short Maximum Value = " + myShortMaxValue);

        //Long - OCCUPIES 64 BITS
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myLongMinValue);
        System.out.println("Long Maximum Value = " + myLongMaxValue);
        //Longs that fit into an Integer value(32Bits) are converted to an Int unless an L is added which tells the compiler? to use 64 Bits
        long myLongValue = 2_147_483_648L;
        System.out.println("Long Value consisting of the largest Integer value +1 :" + myLongValue);

        

    }
}