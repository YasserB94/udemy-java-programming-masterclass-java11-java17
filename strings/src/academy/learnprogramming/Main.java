package academy.learnprogramming;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Strings!");
        //RECAP
        //8 Primitive Data Types are
        /*
        NAME    USAGE
        Int     COMMON
        Double  COMMON
        Boolean COMMON
        Long    UNCOMMON
        Char    UNCOMMON
        Byte    RARE
        Short   RARE
        Float   RARE
         */

        // STRING DATATYPE
        /*
        This datatype is actually a Java Class
        Consists of a sequence of Chars
        The only technical limit === Integer.MAX_VALUE || 2.14 Billion characters
        STRINGS ARE IMMUTABLE <3

         */
        String myString = "Hello Strings!";
        System.out.println(myString);
        //Concatting strings
        String hello = "Hello";
        String world = "World";
        char exclamationMark = '!';
        String output = hello + " " + world + " " + exclamationMark;
        System.out.println(output);

    }
}