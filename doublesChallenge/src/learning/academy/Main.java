package learning.academy;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello floating point numbers!");
        /*
        * CHALLENGE
        * Create a variable containing a number of pounds that will be converted to kilograms
        * Calculate the result and store it into another variable
        * */
        double conversionValue = 0.453_592_37d;
        double pounds = 200d;
        double kilograms = pounds*conversionValue;
        System.out.println(pounds + " pounds in kilograms equals: " + kilograms);

    }
}