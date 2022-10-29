package com.yasserbal;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Keywords!");

        /*Java Keywords
        *
        abstract	continue	for	new	switch
        assert	default	goto	package	synchronized
        boolean	do	if	private	this
        break	double	implements	protected	throw
        byte	else	import	public	throws
        case	enum	instanceof	return	transient
        catch	extends	int	short	try
        char	final	interface	static	void
        class	finally	long	strictfp	volatile
        const	float	native	super	while
        These keywords are reserved by Java  */

        /*Expressions
        * ~ an expression is a series of variables, operators, and method calls (constructed according to the syntax of the language) that evaluates to a single value.
        * */
        //Example
        // One mile is equal to 1.609344 Kilometers
        //Excluding the type 'double' the following line of code is an expression
        double kilometres = (100*1.609344);
        String helloWorld = "Hello World!";//Except for the type once more this is an expression
        System.out.println("Between the brackets an expression is given as an Argument");

        //MiniChallenge
        //In the following code what parts of the code are expressions:
        int score =100;
        if(score>99){
            System.out.println("You got the high score!");
            score =0 ;
        }
        /*Solution
           score=100
           score>99
           "you got the high score!"
           = 0
           Correction:
           score = 0//The variable is included in the reassignment
         */
    }
}