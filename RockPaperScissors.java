/*
* TemperatureConverter.java
* Author: JiaoAng Dong
* Submission Date: 9/26/2019
*
* Purpose: The user inputs rock paper scissors and 
* the program will randomly play against the player
* until one wins by reaching the point
 *
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		

		String usersMove ="";                      // users rock paper or scissors
		System.out.println("Points to win:");      
		int points = keyboard.nextInt();           // winning points to determine the result 
		int userwin = 0;                           // amount of win points by user
		int compwin = 0;                           // amount of win points by computer
		while ( userwin < points 
				&& compwin < points ) {
			System.out.println("Rock, paper, or scissors?");      // while loop until either the computer or user reach win first
			usersMove = keyboard.next();                          // takes in user input 
			
			// Check for valid input
			String computersMove = ComputerOpponent.getMove();     // prevents the user to enter something that is not the 3 keywords
			if (!usersMove.equalsIgnoreCase("rock") && !usersMove.equalsIgnoreCase("scissors") 
					&& !usersMove.equalsIgnoreCase("paper")) {
				
				System.out.println("Please choose 'rock', 'paper', or 'scissors'!");
				usersMove = keyboard.next();
				}
			
			if ( usersMove.equalsIgnoreCase("rock") && computersMove.equalsIgnoreCase("scissors")) {
				userwin++;
				System.out.println("The computer chose " + computersMove + ", so you win!  " + "(" + userwin + "-" + compwin + ")");
			}
			else if ( usersMove.equalsIgnoreCase("paper") && computersMove.equalsIgnoreCase("rock")) {
				userwin++;
				System.out.println("The computer chose " + computersMove + ", so you win!  " + "(" + userwin + "-" + compwin + ")");
			}
			else if ( usersMove.equalsIgnoreCase("scissors") && computersMove.equalsIgnoreCase("paper")) {
				userwin++;
				System.out.println("The computer chose " + computersMove + ", so you win!  " + "(" + userwin + "-" + compwin + ")");
			}
			else if ( usersMove.equalsIgnoreCase("paper") && computersMove.equalsIgnoreCase("scissors")) {
				compwin++;
				System.out.println("The computer chose " + computersMove + ", so you lose.  " + "(" + userwin + "-" + compwin + ")");
			}
			else if ( usersMove.equalsIgnoreCase("rock") && computersMove.equalsIgnoreCase("paper")) {
			    compwin++;
			    System.out.println("The computer chose " + computersMove + ", so you lose.  " + "(" + userwin + "-" + compwin + ")");
			}
			else if ( usersMove.equalsIgnoreCase("scissors") && computersMove.equalsIgnoreCase("rock")) {
				compwin++;
				System.out.println("The computer chose " + computersMove + ", so you lose.  " + "(" + userwin + "-" + compwin + ")");
			}
			else if ( usersMove.equalsIgnoreCase(computersMove)) {
				System.out.println("The computer chose " + computersMove + ", so it was a tie.  " + "(" + userwin + "-" + compwin + ")");
			}
			
			
           // all the possible outcomes  of rock paper scissors game 

		}

		
		if ( compwin < userwin) {
			System.out.println("Congratulations! You won! " );
		}
		else if ( compwin > userwin){
			System.out.println( "Sorry, you lost. Better luck next time!" );
		}
		
		// conclude on the result of the game

}}
