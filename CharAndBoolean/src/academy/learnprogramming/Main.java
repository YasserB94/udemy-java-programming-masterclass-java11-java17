package academy.learnprogramming;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Chars and Booleans!");

        //CHAR - Occupies 2 bytes (16BITS)
        //Can only keep one character
        //UseCase example: Last key pressed by a user
        //Uses 2 bytes since it can also store unicode characters
        char myFirstChar = 'U';
        System.out.println("My Char: " + myFirstChar);

        //UNICODE
        //Unicode allows a programmer to represent any character from multiple languagesa in 2 bytes
        //UNICODE contains 65535 different characters
        char myUnicodeChar = '\u2661';
        System.out.println("My Unicode character: " + myUnicodeChar);

        char spade = '\u2660';
        char heart = '\u2665';
        char club = '\u2663';
        char diamond = '\u2666';
        System.out.println(spade + heart + club + diamond + "---UNICODE IS CONFUSING Y U NO DO UNICODE BEFORE STRING---" + diamond + club + heart + spade);

        //BOOLEAN - Occupies Nope, that rabbit hole is deep.!
        boolean myBooleanTrue = true;
        boolean myBooleanFalse = false;

        boolean isStartingABooleansNameWithIsAGoodPractice = true;
    }

}