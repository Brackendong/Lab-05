import java.util.Scanner;

public class groupExercise {

	public static void main (String [] args) {

		Scanner keyboard = new Scanner (System.in);

		System.out.println("Enter 2 non-empty strings: ");
		String input1 = keyboard.nextLine();
		String input2 = keyboard.nextLine();

		boolean output;

        if (input1.length()==input2.length()) {
		for (int i=0 ; i<input1.length() ; i++) {
			if (input1.charAt(i)==input2.charAt(i)) {
				output=true;}
			else 
				output =false;
		}
		
	}

           System.out.print(output);
	}}
