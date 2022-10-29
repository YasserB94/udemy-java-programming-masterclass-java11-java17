package learning.academy;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Operator Challenge!");
        /*CHALLENGE
        * Create a double with a value of 20
        * Create a second double with a value of 80
        * multiply the sum of both numbers by 100
        * get the remainder of that result and 40
        * Create a boolean that holds if there is a remainder or not
        * Output some stuff...
        * use if/then to display a message dependant on the boolean's value
        * */
        double stepOne = 20d;
        double stepTwo = 80d;
        double stepThree = (double)((stepOne+stepTwo)*100);
        double remainder = stepThree%40d;
        boolean hasRemainder = (remainder>0);// same as remainder>0? true:false;
        if(hasRemainder){
            System.out.println(stepThree + " % " + 40d + " Has a remainder of: " + remainder);
        }else{
            System.out.println(stepThree + " % " + 40d + " Has no remainder.");
        }
    }
}