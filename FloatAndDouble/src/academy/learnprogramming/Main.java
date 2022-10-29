package academy.learnprogramming;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Floats And Doubles!");

        //SINGLE VS DOUBLE PRECISION
        /*
        Precision refers to the FORMAT and SPACE occupied by the type
        SINGLE precision occupies 32 BITS
        DOUBLE precision occupies 64 BITS
        Therefor a float (has a smaller range within memory and is less accurate compared to a double)
         */
        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = "+ myFloatMinValue);
        System.out.println("Float Maximum Value = "+ myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = "+ myDoubleMinValue);
        System.out.println("Double Maximum Value = "+ myDoubleMaxValue);

        int myIntValue = 32;
        float myFloatValue = 3.2f; //Add an F to tell java to keep this as a float
        double myDoubleValue = 3.2d; //Add a D to tell Java to keep this as a double

        float myCastedFloatValue = (float) 3.56;//Here we cast the double value to a float in the long way (NOT RECOMENDED BUT IT EXISTS)


        //---§
        int someIntValue = 5;
        float someFloatValue = 5f;
        double someDoubleValue = 5d;
        System.out.println("Int Value = " + someIntValue);
        System.out.println("Float Value = " + someFloatValue);
        System.out.println("Double Value = " + someDoubleValue);

        //Dividing these  values
        int someDividedIntValue = someIntValue/2;
        float someDividedFloatValue = someFloatValue/2f;
        double someDividedDoubleValue = someDoubleValue/2d;
        System.out.println("Int Value divided by 2 = " + someDividedIntValue);
        System.out.println("Float Value divided by 2 = " + someDividedFloatValue);
        System.out.println("Double Value divided by 2 = " + someDividedDoubleValue);

        int anotherDividedIntValue = someIntValue/3;
        float anotherDividedFloatValue = someFloatValue/3f;
        double anotherDividedDoubleValue = someDoubleValue/3d;
        System.out.println("Int Value divided by 3 = " + anotherDividedIntValue);
        System.out.println("Float Value divided by 3 = " + anotherDividedFloatValue);
        System.out.println("Double Value divided by 3 = " + anotherDividedDoubleValue);

        //SUMMARY
        /*
        Doubles are more precise than floats
        Floats take up less memory than Doubles
        !!! MODERN TIMES = MODERN PROGRAMMING
        Processors and their processes are optimised for doubles, they are commonly processed quicker than floats.
        By default floating points are typed as Doubles by Java
        It's recommended to use Doubles where possible (Who cares about how )
         */
    }
}