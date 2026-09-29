//Programmer: Javan Graber
//Date: 9/28/26

package javanproject;

import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) throws InterruptedException {
    	//Create the variables
	    String cont = "";
	    int dice1, dice2, sum;
	    
	    //Create the "while" loop that exits if "n" is typed
	    while (!cont.equals("n")) {
	    	System.out.print("\n");
	    	System.out.println("Rolling the first dice...\n");
	    	Thread.sleep(1000);
	    	
	    	//Generate a random number and display it
	    	dice1 = (int)(Math.random()*6 + 1);
	    	System.out.println("Here is the number from the first roll: " + dice1);
	    	System.out.print("\n");
	    	Thread.sleep(1000);
	    	
	    	System.out.println("Rolling the second dice...\n");
	    	Thread.sleep(1000);
	    	
	    	//Generate another random number and display it
	    	dice2 = (int)(Math.random()*6 + 1);
	    	System.out.println("Here is the number from the second roll: " + dice2);
	    	System.out.print("\n");
	    	
	    	//Find the sum of the numbers and display it
	    	sum = dice1 + dice2;
	    	System.out.println("Therefore, the sum of the numbers is: " + sum);
	    	System.out.print("\n");
	    	
	    	//Ask the user if they want to go again
	    	System.out.print("Do you want to roll again? (y or n): ");
	    	cont = userinput.nextLine();
	   }
    }
}
