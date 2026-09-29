//Programmer: Javan Graber
//Date: 9/28/26

package javanproject;

import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args){
    	//The following code is a great example of the usefulness of each of the individual parts of a "for" loop.
    	//First, we can see that this code created an integer variable, and in the "for" loop, this variable begins at 1.
    	//Since the first part of the "for" loop always runs first, we will have "Count is: 1" displayed in the first iteration.
    	//However, the next part of the "for" loop is i<5000, which means that the "for" loop will continue until i is not less than 5000
    	//The final part of the "for" loop shows the variable changes implemented in each iteration.
    	//Each time, i will be multiplied by 2 (2*i), and 1 will be added to that.
    	//Thus, after the first 1, we get 1*2+1, which equals 3, then 3*2+1, which equals 7, and so on until we reach 5000. I have provided the numbers below.
    	//(1,3,7,15,31,63,127,255,511,1023,2047,4095
        int i;
        for(i=1; i<5000; i=2*i+1){
             System.out.println("Count is: " + i);
        }
   }
}
