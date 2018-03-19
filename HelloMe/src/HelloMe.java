/**
 * This program asks for the user's name and age, and says hello to the user.
<p>
 * @author      Nathan Saunders <njsaund @ gmail.com> 
 * @version     1.0
 * @since       2018-03-12
<p>
 * Longer description. 
 * Standard input and output is used. * This program will be further modified during this assignment.
*/

import java.util.Scanner;

public class HelloMe {
    /**
     * main method is entry point for all java programs.
    <p>
     * @author      Nathan Saunders <njsaund @ gmail.com> 
     * @version     1.0
     * @param args  a String array of commmand line parameters;
     *              may be empty.
     * @since       2018-03-12
    <p>
     * Longer description. 
     * Describe what the method does and how it works.
    */
    public static void main(String[] args) {
		
		String name;
		int love;
		Scanner scanIn = new Scanner(System.in);
	
		System.out.println("What is your name? ");//asks for user input for name
		name = scanIn.nextLine(); //receives user input for name
		System.out.println("Hello " + name);

		System.out.println("How much love do you need? ");//asks for user input for love amount
		
		love = scanIn.nextInt(); //receives user input for love
		/**if (love contain string ) {
			System.out.println("Please input the number."); //I want to handle the error if a string is inputted, but it seems more complicated than it would be worth for this project.
		}
		*/
		if (love <= 0) {
			System.out.println("Everybody needs some love!");//handles user input 0 and below
		}
		else if(love >= 10) {
			System.out.println("You cannot handle that much love!"); //handles user input above 10, but also equal to 10 because the instructions were unclear.
		}
		else {
			for(int i = 1; i <= love; i++) {	//loop starts at 1 and continues to love amount.
				if(i == 1) {
					System.out.println("I love you " + i + " way");//handles the change in grammar
				}
				else {
				System.out.println("I love you " + i + " ways");
				}
			}
		}
		
		
		scanIn.close();

    }
}
