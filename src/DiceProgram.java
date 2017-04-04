import java.util.Scanner;
import java.util.*;

public class DiceProgram 
{

	
	/**
	 * Create a program that will randomly select two numbers from 1-6 (like rolling two dice).
	 *  Show the dice rolls and end the program UNLESS the program rolls doubles. 
	 *  If the program rolls doubles, then it should roll again, show the new roll and stop UNLESS the program rolls doubles again and so on.
	 *   But on the third time you roll doubles, you don't get to roll again, on the third time you roll doubles, you go to jail!
	 * @param args
	 */
	
	public static void main (String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		//int loopControler = 1
		Random dice1 = new Random();
		Random dice2 = new Random();
		
		 int diceRollCounter = 0;
		 System.out.println("Press 1 to begin rolling the two dice.");
		 
		 int realDice1 = 1 + dice1.nextInt(5);
		 int realDice2 = 1 + dice2.nextInt(5);
		 while(keyboard.nextInt() == 1)
		 {
				while(diceRollCounter < 3)
				{ int adder;
					if(realDice1 != realDice2)
					{
						System.out.println("User rolls " +realDice1+ " & "+ realDice2);	
						
						adder = realDice1 + realDice2;
						System.out.println("Move " + adder + " Spaces and stop");
						break;
						
					}
					else
					{
						diceRollCounter += 1;
						System.out.println("User rolls " +realDice1+ " & "+ realDice2);	
						
						adder = realDice1 + realDice2;
						if(diceRollCounter <= 2)
						{   System.out.print("\n DOUBLES!");
							System.out.println("Move " + adder + " Spaces and roll again getting...");
						}
						
					}
					 realDice1 = 1 + dice1.nextInt(5);
					 realDice2 = 1 + dice2.nextInt(5);
					
				}
				break;
		 }	
			 if (diceRollCounter == 3)
			 {
				 System.out.print("DOUBLES \nGO TO JAIL --->");
			 }
			
	}
}
