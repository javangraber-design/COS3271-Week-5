//Programmer: Javan Graber
//Date: 9/28/26

package javanproject;

import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) throws InterruptedException {
    	//Create the variables, with the "again" variable already initialized
	    String again = "";
	    int row, column, answer, selectedNumber;
	    
	    //Create the "while" loop that exits if "n" is typed
	    while (!again.equals("n")) {
	    	System.out.println();
	    	
		    //Ask the user for the number
		    System.out.print("Enter a number from 3 to 20: ");
		    selectedNumber = userinput.nextInt();
		    userinput.nextLine();
		    
		    //Create the table only if the number provided meets the parameters
		    if (selectedNumber >= 3 && selectedNumber <=20) {
			    
		    	//Create a "for" loop for the rows
		    	System.out.println();
		    	for (row = 0; row <= selectedNumber; row++) {
		    		//Create a "for" loop for the columns
		    		for (column = 0; column <= selectedNumber; column ++) {
		    			//Find the sum and display it
		    			answer = row + column;

		    			System.out.format("%2d ", answer);
		    			}
		    		System.out.println(" ");
		    	}
		    	
		    
		    	//Ask the user if they want to go again
		    	System.out.println();
		    	System.out.print("Do you want to go again? (y or n): ");
		    	again = userinput.nextLine();
		    }
		    //If the number does not meet the conditions, tell the user that their number was not valid and get a new number
		    else {
		    	System.out.println();
		    	System.out.println("Please enter a valid number");
		    }
	    }  
    }
}
