package academy.learning;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        /*THE CHALLENGE
        Create a BYTE variable set to any valid byte number
        Create a SHORT variable set to any valid short number
        Create an INTEGER variable set to any valid Integer number

        Create a LONG variable set to:
        50_000 plus 10x the sum of the byte,short and integer values.
        * */
        byte myRandomByte = 8;
        short myRandomShort = 16;
        int myRandomInteger = 32;

        long myResult = (50_000L + ( 10L * (myRandomByte + myRandomShort + myRandomInteger)));
        System.out.println("My Solution equals:" + myResult);

        //EXTRA - With a short we have to cast the result of the expression to a SHORT
        //Since an Integer does not fit into a short aka 16<32
        short myShortResult = (short)(1000 + ( 10 * (myRandomByte + myRandomShort + myRandomInteger)));
        System.out.println("My Solution equals:" + myShortResult);
    }
}